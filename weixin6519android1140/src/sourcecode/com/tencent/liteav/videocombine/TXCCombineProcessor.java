package com.tencent.liteav.videocombine;

import android.content.Context;
import com.tencent.liteav.basic.videocombine.TXCCombineFrame;
import com.tencent.liteav.beauty.TXCVideoPreprocessor;
import com.tencent.liteav.beauty.TXIVideoPreprocessorListener;
import java.util.LinkedList;
import java.util.Queue;

public class TXCCombineProcessor
{
  private String TAG = "CombineProcessor";
  public TXCCombineVideoFilter mCombineVideoFilter = null;
  private Context mContext = null;
  public float[] mExtMatrix = null;
  private int[] mProcessTextureId = null;
  public int mProcessorIndex = 0;
  private int mProcessorLength = 0;
  private final Queue<Runnable> mRunOnDraw = new LinkedList();
  public TXCCombineFrame[] mSzOutputFrame = null;
  public TXCVideoPreprocessor[] mSzVideoProcess = null;
  private TXIVideoPreprocessorListener mVideoProcessListen = new TXIVideoPreprocessorListener()
  {
    public void didDetectFacePoints(float[] paramAnonymousArrayOfFloat) {}
    
    public void didProcessFrame(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, long paramAnonymousLong)
    {
      TXCCombineProcessor.this.mSzOutputFrame[TXCCombineProcessor.this.mProcessorIndex].format = 0;
      TXCCombineProcessor.this.mSzOutputFrame[TXCCombineProcessor.this.mProcessorIndex].texture = paramAnonymousInt1;
      TXCCombineProcessor.this.mSzOutputFrame[TXCCombineProcessor.this.mProcessorIndex].width = paramAnonymousInt2;
      TXCCombineProcessor.this.mSzOutputFrame[TXCCombineProcessor.this.mProcessorIndex].height = paramAnonymousInt3;
    }
    
    public void didProcessFrame(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, long paramAnonymousLong) {}
    
    public int willAddWatermark(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      return 0;
    }
  };
  
  public TXCCombineProcessor(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  private void InitFilter(TXCCombineFrame[] paramArrayOfTXCCombineFrame)
  {
    if (this.mSzVideoProcess == null)
    {
      this.mSzVideoProcess = new TXCVideoPreprocessor[paramArrayOfTXCCombineFrame.length];
      int i = 0;
      while (i < this.mSzVideoProcess.length)
      {
        this.mSzVideoProcess[i] = new TXCVideoPreprocessor(this.mContext, true);
        if ((4 == paramArrayOfTXCCombineFrame[i].format) && (this.mExtMatrix != null)) {
          this.mSzVideoProcess[i].setInputMatrix(this.mExtMatrix);
        }
        this.mSzVideoProcess[i].setListener(this.mVideoProcessListen);
        this.mSzVideoProcess[i].setCrop(paramArrayOfTXCCombineFrame[i].crop);
        this.mSzVideoProcess[i].setRotate(paramArrayOfTXCCombineFrame[i].rotation);
        i += 1;
      }
    }
    if (this.mProcessTextureId == null) {
      this.mProcessTextureId = new int[paramArrayOfTXCCombineFrame.length];
    }
    if (this.mCombineVideoFilter == null) {
      this.mCombineVideoFilter = new TXCCombineVideoFilter();
    }
  }
  
  private void UnInitFilter()
  {
    if (this.mSzVideoProcess != null)
    {
      int i = 0;
      while (i < this.mSzVideoProcess.length)
      {
        if (this.mSzVideoProcess[i] != null)
        {
          this.mSzVideoProcess[i].release();
          this.mSzVideoProcess[i] = null;
        }
        i += 1;
      }
      this.mSzVideoProcess = null;
    }
    if (this.mCombineVideoFilter != null)
    {
      this.mCombineVideoFilter.release();
      this.mCombineVideoFilter = null;
    }
  }
  
  private void runAll(Queue<Runnable> paramQueue)
  {
    for (;;)
    {
      Runnable localRunnable = null;
      try
      {
        if (!paramQueue.isEmpty()) {
          localRunnable = (Runnable)paramQueue.poll();
        }
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
      finally {}
    }
  }
  
  private void runOnDraw(Runnable paramRunnable)
  {
    synchronized (this.mRunOnDraw)
    {
      this.mRunOnDraw.add(paramRunnable);
      return;
    }
  }
  
  public int combineFrame(TXCCombineFrame[] paramArrayOfTXCCombineFrame, int paramInt)
  {
    if ((paramArrayOfTXCCombineFrame == null) || (paramArrayOfTXCCombineFrame.length <= 0)) {
      return -1;
    }
    if (this.mProcessorLength != paramArrayOfTXCCombineFrame.length)
    {
      this.mProcessorLength = paramArrayOfTXCCombineFrame.length;
      UnInitFilter();
      InitFilter(paramArrayOfTXCCombineFrame);
    }
    runAll(this.mRunOnDraw);
    this.mSzOutputFrame = ((TXCCombineFrame[])paramArrayOfTXCCombineFrame.clone());
    int i = 0;
    while (i < this.mSzVideoProcess.length)
    {
      if (this.mSzVideoProcess[i] != null)
      {
        this.mProcessorIndex = i;
        this.mSzVideoProcess[i].processFrame(paramArrayOfTXCCombineFrame[i].texture, paramArrayOfTXCCombineFrame[i].width, paramArrayOfTXCCombineFrame[i].height, 0, paramArrayOfTXCCombineFrame[i].format, 0);
      }
      i += 1;
    }
    return this.mCombineVideoFilter.combineFrame(this.mSzOutputFrame, paramInt);
  }
  
  public void setCanvasSize(final int paramInt1, final int paramInt2)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCCombineProcessor.this.mCombineVideoFilter != null) {
          TXCCombineProcessor.this.mCombineVideoFilter.setCanvasSize(paramInt1, paramInt2);
        }
      }
    });
  }
  
  public void setInputMatrix(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == this.mExtMatrix) {
      return;
    }
    this.mExtMatrix = paramArrayOfFloat;
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCCombineProcessor.this.mSzVideoProcess != null)
        {
          int i = 0;
          while (i < TXCCombineProcessor.this.mSzVideoProcess.length)
          {
            if (TXCCombineProcessor.this.mSzVideoProcess[i] != null) {
              TXCCombineProcessor.this.mSzVideoProcess[i].setInputMatrix(TXCCombineProcessor.this.mExtMatrix);
            }
            i += 1;
          }
        }
      }
    });
  }
  
  public void setListener(final TXIVideoPreprocessorListener paramTXIVideoPreprocessorListener)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCCombineProcessor.this.mCombineVideoFilter != null) {
          TXCCombineProcessor.this.mCombineVideoFilter.setListen(paramTXIVideoPreprocessorListener);
        }
      }
    });
  }
  
  public void setOutputSize(final int paramInt1, final int paramInt2)
  {
    runOnDraw(new Runnable()
    {
      public void run()
      {
        if (TXCCombineProcessor.this.mCombineVideoFilter != null) {
          TXCCombineProcessor.this.mCombineVideoFilter.setOutputSize(paramInt1, paramInt2);
        }
      }
    });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\videocombine\TXCCombineProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
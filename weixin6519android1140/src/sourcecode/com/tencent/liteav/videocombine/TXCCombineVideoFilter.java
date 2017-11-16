package com.tencent.liteav.videocombine;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.CropRect;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.videocombine.TXCCombineFrame;
import com.tencent.liteav.beauty.TXIVideoPreprocessorListener;

public class TXCCombineVideoFilter
{
  private String TAG = "CombineVideoFilter";
  private final int THREE_VIDEO_STREAM = 3;
  private final int TWO_VIDEO_STREAM = 2;
  private int mCanvaceHeight = 0;
  private int mCanvaceWidth = 0;
  private TXIVideoPreprocessorListener mCombineProcessListen = null;
  protected int[] mFrameBuffer = null;
  protected int[] mFrameBufferTexture = null;
  TXCGPUFilter mOutputFilter = null;
  private int mOutputHeight = 0;
  private int mOutputWidth = 0;
  TXCGPUFilter[] mSzCombineFilter = null;
  
  private void createOutputFilter(int paramInt1, int paramInt2)
  {
    if (this.mOutputFilter == null)
    {
      this.mOutputFilter = new TXCGPUFilter();
      this.mOutputFilter.setHasFrameBuffer(true);
      this.mOutputFilter.init();
      this.mOutputFilter.onOutputSizeChanged(paramInt1, paramInt2);
    }
  }
  
  private void initFilter(TXCCombineFrame[] paramArrayOfTXCCombineFrame)
  {
    int i;
    if (this.mSzCombineFilter == null)
    {
      this.mSzCombineFilter = new TXCGPUFilter[paramArrayOfTXCCombineFrame.length];
      i = 0;
    }
    for (;;)
    {
      if (i < paramArrayOfTXCCombineFrame.length)
      {
        this.mSzCombineFilter[i] = new TXCGPUFilter();
        if (this.mSzCombineFilter[i].init()) {}
      }
      else
      {
        initFrameBuffer(this.mCanvaceWidth, this.mCanvaceHeight);
        createOutputFilter(this.mOutputWidth, this.mOutputHeight);
        return;
      }
      if (paramArrayOfTXCCombineFrame[i].posision != null) {
        this.mSzCombineFilter[i].onOutputSizeChanged(paramArrayOfTXCCombineFrame[i].posision.cropWidth, paramArrayOfTXCCombineFrame[i].posision.cropHeight);
      }
      i += 1;
    }
  }
  
  private void initFrameBuffer(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0) || ((this.mFrameBuffer != null) && (this.mFrameBufferTexture != null))) {
      return;
    }
    if (this.mFrameBuffer == null)
    {
      this.mFrameBuffer = new int[1];
      if (this.mFrameBufferTexture != null) {
        break label77;
      }
      this.mFrameBufferTexture = new int[1];
    }
    for (;;)
    {
      TXCOpenGlUtils.createDrawFrameBuffer(this.mFrameBuffer, this.mFrameBufferTexture, paramInt1, paramInt2);
      return;
      GLES20.glDeleteFramebuffers(1, this.mFrameBuffer, 0);
      break;
      label77:
      GLES20.glDeleteTextures(1, this.mFrameBufferTexture, 0);
    }
  }
  
  private void releaseFrameBuffer()
  {
    if (this.mFrameBuffer != null)
    {
      GLES20.glDeleteFramebuffers(1, this.mFrameBuffer, 0);
      this.mFrameBuffer = null;
    }
    if (this.mFrameBufferTexture != null)
    {
      GLES20.glDeleteTextures(1, this.mFrameBufferTexture, 0);
      this.mFrameBufferTexture = null;
    }
  }
  
  private void releaseOutputFilter()
  {
    if (this.mOutputFilter != null)
    {
      this.mOutputFilter.destroy();
      this.mOutputFilter = null;
    }
  }
  
  private void uninitFilter()
  {
    if (this.mSzCombineFilter != null)
    {
      int i = 0;
      while (i < this.mSzCombineFilter.length)
      {
        if (this.mSzCombineFilter[i] != null)
        {
          this.mSzCombineFilter[i].destroy();
          this.mSzCombineFilter[i] = null;
        }
        i += 1;
      }
      this.mSzCombineFilter = null;
    }
  }
  
  public int combineFrame(TXCCombineFrame[] paramArrayOfTXCCombineFrame, int paramInt)
  {
    int m;
    if ((paramArrayOfTXCCombineFrame == null) || (this.mCanvaceWidth <= 0) || (this.mCanvaceHeight <= 0))
    {
      m = -1;
      return m;
    }
    initFilter(paramArrayOfTXCCombineFrame);
    GLES20.glBindFramebuffer(36160, this.mFrameBuffer[0]);
    int i = 0;
    while (i < paramArrayOfTXCCombineFrame.length)
    {
      GLES20.glViewport(paramArrayOfTXCCombineFrame[i].posision.xOffset, paramArrayOfTXCCombineFrame[i].posision.yOffset, paramArrayOfTXCCombineFrame[i].posision.cropWidth, paramArrayOfTXCCombineFrame[i].posision.cropHeight);
      this.mSzCombineFilter[i].onDrawFrame(paramArrayOfTXCCombineFrame[i].texture);
      i += 1;
    }
    GLES20.glBindFramebuffer(36160, 0);
    i = this.mFrameBufferTexture[0];
    int j = this.mCanvaceWidth;
    int k = this.mCanvaceHeight;
    if (this.mOutputFilter != null)
    {
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      i = this.mOutputFilter.onDrawToTexture(i);
      j = this.mOutputWidth;
      k = this.mOutputHeight;
    }
    for (;;)
    {
      m = i;
      if (this.mCombineProcessListen == null) {
        break;
      }
      this.mCombineProcessListen.didProcessFrame(i, j, k, paramInt);
      return i;
    }
  }
  
  public void release()
  {
    releaseFrameBuffer();
    uninitFilter();
    releaseOutputFilter();
  }
  
  public void setCanvasSize(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0) && ((paramInt1 != this.mCanvaceWidth) || (paramInt2 != this.mCanvaceHeight))) {
      releaseFrameBuffer();
    }
    this.mCanvaceWidth = paramInt1;
    this.mCanvaceHeight = paramInt2;
  }
  
  public void setListen(TXIVideoPreprocessorListener paramTXIVideoPreprocessorListener)
  {
    this.mCombineProcessListen = paramTXIVideoPreprocessorListener;
  }
  
  public void setOutputSize(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0) && ((paramInt1 != this.mOutputWidth) || (paramInt2 != this.mOutputHeight))) {
      releaseOutputFilter();
    }
    this.mOutputWidth = paramInt1;
    this.mOutputHeight = paramInt2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\liteav\videocombine\TXCCombineVideoFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
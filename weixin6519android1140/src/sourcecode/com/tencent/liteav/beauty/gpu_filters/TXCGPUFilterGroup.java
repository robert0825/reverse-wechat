package com.tencent.liteav.beauty.gpu_filters;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCGPUFilter;
import com.tencent.liteav.basic.opengl.TXCRotation;
import com.tencent.liteav.basic.opengl.TXCTextureRotationUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TXCGPUFilterGroup
  extends TXCGPUFilter
{
  private TXCGPUFilter mExtraFilter = new TXCGPUFilter();
  protected List<TXCGPUFilter> mFilters;
  private int[] mFrameBufferTextures;
  private int[] mFrameBuffers;
  private final FloatBuffer mGLCubeBuffer;
  private final FloatBuffer mGLTextureBuffer;
  private final FloatBuffer mGLTextureFlipBuffer;
  protected List<TXCGPUFilter> mMergedFilters;
  
  public TXCGPUFilterGroup()
  {
    this(null);
    this.mHasFrameBuffer = true;
  }
  
  public TXCGPUFilterGroup(List<TXCGPUFilter> paramList)
  {
    this.mHasFrameBuffer = true;
    this.mFilters = paramList;
    if (this.mFilters == null) {
      this.mFilters = new ArrayList();
    }
    for (;;)
    {
      this.mGLCubeBuffer = ByteBuffer.allocateDirect(TXCGPURenderer.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.mGLCubeBuffer.put(TXCGPURenderer.CUBE).position(0);
      this.mGLTextureBuffer = ByteBuffer.allocateDirect(TXCTextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.mGLTextureBuffer.put(TXCTextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
      paramList = TXCTextureRotationUtil.getRotation(TXCRotation.NORMAL, false, true);
      this.mGLTextureFlipBuffer = ByteBuffer.allocateDirect(paramList.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      this.mGLTextureFlipBuffer.put(paramList).position(0);
      return;
      updateMergedFilters();
    }
  }
  
  public void addFilter(TXCGPUFilter paramTXCGPUFilter)
  {
    if (paramTXCGPUFilter == null) {
      return;
    }
    this.mFilters.add(paramTXCGPUFilter);
    updateMergedFilters();
  }
  
  public void destroyFramebuffers()
  {
    super.destroyFramebuffers();
    if (this.mFrameBufferTextures != null)
    {
      GLES20.glDeleteTextures(2, this.mFrameBufferTextures, 0);
      this.mFrameBufferTextures = null;
    }
    if (this.mFrameBuffers != null)
    {
      GLES20.glDeleteFramebuffers(2, this.mFrameBuffers, 0);
      this.mFrameBuffers = null;
    }
  }
  
  public List<TXCGPUFilter> getFilters()
  {
    return this.mFilters;
  }
  
  public List<TXCGPUFilter> getMergedFilters()
  {
    return this.mMergedFilters;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.mFilters.iterator();
    while (localIterator.hasNext()) {
      ((TXCGPUFilter)localIterator.next()).destroy();
    }
  }
  
  public int onDrawToTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    int k = this.mMergedFilters.size();
    runPendingOnDrawTasks();
    int j = 0;
    int i = 0;
    if (j < k)
    {
      TXCGPUFilter localTXCGPUFilter = (TXCGPUFilter)this.mMergedFilters.get(j);
      if (i != 0)
      {
        paramInt1 = localTXCGPUFilter.onDrawToTexture(paramInt1, paramInt2, paramInt3);
        label58:
        if (i == 0) {
          break label97;
        }
      }
      label97:
      for (i = 0;; i = 1)
      {
        j += 1;
        break;
        paramInt1 = localTXCGPUFilter.onDrawToTexture(paramInt1, this.mFrameBuffers[0], this.mFrameBufferTextures[0]);
        break label58;
      }
    }
    if (i != 0) {
      this.mExtraFilter.onDrawToTexture(paramInt1, paramInt2, paramInt3);
    }
    return paramInt3;
  }
  
  public boolean onInit()
  {
    boolean bool2 = super.onInit();
    boolean bool1 = bool2;
    if (bool2)
    {
      Iterator localIterator = this.mFilters.iterator();
      TXCGPUFilter localTXCGPUFilter;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localTXCGPUFilter = (TXCGPUFilter)localIterator.next();
        localTXCGPUFilter.init();
      } while (localTXCGPUFilter.isInitialized());
      bool1 = this.mExtraFilter.init();
    }
    return (bool1) && (GLES20.glGetError() == 0);
  }
  
  public void onOutputSizeChanged(int paramInt1, int paramInt2)
  {
    if ((this.mOutputWidth == paramInt1) && (this.mOutputHeight == paramInt2)) {}
    for (;;)
    {
      return;
      if (this.mFrameBuffers != null) {
        destroyFramebuffers();
      }
      super.onOutputSizeChanged(paramInt1, paramInt2);
      int j = this.mMergedFilters.size();
      int i = 0;
      while (i < j)
      {
        ((TXCGPUFilter)this.mMergedFilters.get(i)).onOutputSizeChanged(paramInt1, paramInt2);
        i += 1;
      }
      this.mExtraFilter.onOutputSizeChanged(paramInt1, paramInt2);
      if ((this.mMergedFilters != null) && (this.mMergedFilters.size() > 0))
      {
        this.mMergedFilters.size();
        this.mFrameBuffers = new int[2];
        this.mFrameBufferTextures = new int[2];
        i = 0;
        while (i < 2)
        {
          GLES20.glGenFramebuffers(1, this.mFrameBuffers, i);
          GLES20.glGenTextures(1, this.mFrameBufferTextures, i);
          GLES20.glBindTexture(3553, this.mFrameBufferTextures[i]);
          GLES20.glTexImage2D(3553, 0, 6408, paramInt1, paramInt2, 0, 6408, 5121, null);
          GLES20.glTexParameterf(3553, 10240, 9729.0F);
          GLES20.glTexParameterf(3553, 10241, 9729.0F);
          GLES20.glTexParameterf(3553, 10242, 33071.0F);
          GLES20.glTexParameterf(3553, 10243, 33071.0F);
          GLES20.glBindFramebuffer(36160, this.mFrameBuffers[i]);
          GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTextures[i], 0);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindFramebuffer(36160, 0);
          i += 1;
        }
      }
    }
  }
  
  public void updateMergedFilters()
  {
    if (this.mFilters == null) {}
    label128:
    for (;;)
    {
      return;
      Iterator localIterator;
      if (this.mMergedFilters == null)
      {
        this.mMergedFilters = new ArrayList();
        localIterator = this.mFilters.iterator();
      }
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label128;
        }
        Object localObject = (TXCGPUFilter)localIterator.next();
        if ((localObject instanceof TXCGPUFilterGroup))
        {
          ((TXCGPUFilterGroup)localObject).updateMergedFilters();
          localObject = ((TXCGPUFilterGroup)localObject).getMergedFilters();
          if ((localObject == null) || (((List)localObject).isEmpty())) {
            continue;
          }
          this.mMergedFilters.addAll((Collection)localObject);
          continue;
          this.mMergedFilters.clear();
          break;
        }
        this.mMergedFilters.add(localObject);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUFilterGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
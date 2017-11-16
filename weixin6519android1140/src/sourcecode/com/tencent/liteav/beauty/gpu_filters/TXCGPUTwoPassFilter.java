package com.tencent.liteav.beauty.gpu_filters;

import com.tencent.liteav.basic.opengl.TXCGPUFilter;

public class TXCGPUTwoPassFilter
  extends TXCGPUFilterGroup
{
  public TXCGPUTwoPassFilter(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(null);
    addFilter(new TXCGPUFilter(paramString1, paramString2));
    addFilter(new TXCGPUFilter(paramString3, paramString4));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\beauty\gpu_filters\TXCGPUTwoPassFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
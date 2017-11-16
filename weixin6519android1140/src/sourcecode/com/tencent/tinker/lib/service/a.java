package com.tencent.tinker.lib.service;

import java.io.Serializable;

public final class a
  implements Serializable
{
  public boolean eFN;
  public long iyA;
  public Throwable xPC;
  public String ygk;
  public String ygl;
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("\nPatchResult: \n");
    localStringBuffer.append("isSuccess:" + this.eFN + "\n");
    localStringBuffer.append("rawPatchFilePath:" + this.ygk + "\n");
    localStringBuffer.append("costTime:" + this.iyA + "\n");
    if (this.ygl != null) {
      localStringBuffer.append("patchVersion:" + this.ygl + "\n");
    }
    if (this.xPC != null) {
      localStringBuffer.append("Throwable:" + this.xPC.getMessage() + "\n");
    }
    return localStringBuffer.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\service\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
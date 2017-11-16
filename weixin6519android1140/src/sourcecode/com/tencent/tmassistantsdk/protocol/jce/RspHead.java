package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.tencent.mm.sdk.platformtools.w;

public final class RspHead
  extends JceStruct
  implements Cloneable
{
  private static final String TAG = "RspHead";
  public int cmdId = 0;
  public byte encryptWithPack = 0;
  public String phoneGuid = "";
  public int requestId = 0;
  public int ret = 0;
  
  static
  {
    if (!RspHead.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public RspHead() {}
  
  public RspHead(int paramInt1, int paramInt2, int paramInt3, byte paramByte, String paramString)
  {
    this.requestId = paramInt1;
    this.cmdId = paramInt2;
    this.ret = paramInt3;
    this.encryptWithPack = paramByte;
    this.phoneGuid = paramString;
  }
  
  public final String className()
  {
    return "jce.RspHead";
  }
  
  public final Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while ($assertionsDisabled) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public final void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.requestId, "requestId");
    paramStringBuilder.display(this.cmdId, "cmdId");
    paramStringBuilder.display(this.ret, "ret");
    paramStringBuilder.display(this.encryptWithPack, "encryptWithPack");
    paramStringBuilder.display(this.phoneGuid, "phoneGuid");
  }
  
  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.requestId, true);
    paramStringBuilder.displaySimple(this.cmdId, true);
    paramStringBuilder.displaySimple(this.ret, true);
    paramStringBuilder.displaySimple(this.encryptWithPack, true);
    paramStringBuilder.displaySimple(this.phoneGuid, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (RspHead)paramObject;
    } while ((!JceUtil.equals(this.requestId, ((RspHead)paramObject).requestId)) || (!JceUtil.equals(this.cmdId, ((RspHead)paramObject).cmdId)) || (!JceUtil.equals(this.ret, ((RspHead)paramObject).ret)) || (!JceUtil.equals(this.encryptWithPack, ((RspHead)paramObject).encryptWithPack)) || (!JceUtil.equals(this.phoneGuid, ((RspHead)paramObject).phoneGuid)));
    return true;
  }
  
  public final String fullClassName()
  {
    return "com.tencent.tmassistantsdk.protocol.jce.RspHead";
  }
  
  public final int getCmdId()
  {
    return this.cmdId;
  }
  
  public final byte getEncryptWithPack()
  {
    return this.encryptWithPack;
  }
  
  public final String getPhoneGuid()
  {
    return this.phoneGuid;
  }
  
  public final int getRequestId()
  {
    return this.requestId;
  }
  
  public final int getRet()
  {
    return this.ret;
  }
  
  public final int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("RspHead", localException, "", new Object[0]);
    }
    return 0;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.requestId = paramJceInputStream.read(this.requestId, 0, true);
    this.cmdId = paramJceInputStream.read(this.cmdId, 1, true);
    this.ret = paramJceInputStream.read(this.ret, 2, true);
    this.encryptWithPack = paramJceInputStream.read(this.encryptWithPack, 3, false);
    this.phoneGuid = paramJceInputStream.readString(4, false);
  }
  
  public final void setCmdId(int paramInt)
  {
    this.cmdId = paramInt;
  }
  
  public final void setEncryptWithPack(byte paramByte)
  {
    this.encryptWithPack = paramByte;
  }
  
  public final void setPhoneGuid(String paramString)
  {
    this.phoneGuid = paramString;
  }
  
  public final void setRequestId(int paramInt)
  {
    this.requestId = paramInt;
  }
  
  public final void setRet(int paramInt)
  {
    this.ret = paramInt;
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.requestId, 0);
    paramJceOutputStream.write(this.cmdId, 1);
    paramJceOutputStream.write(this.ret, 2);
    paramJceOutputStream.write(this.encryptWithPack, 3);
    if (this.phoneGuid != null) {
      paramJceOutputStream.write(this.phoneGuid, 4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\protocol\jce\RspHead.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
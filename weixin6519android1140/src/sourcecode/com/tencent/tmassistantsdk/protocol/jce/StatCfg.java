package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import com.tencent.mm.sdk.platformtools.w;

public final class StatCfg
  extends JceStruct
  implements Cloneable
{
  private static final String TAG = "StatCfg";
  public int internal = 0;
  public short lineNum = 0;
  public byte netType = 0;
  public byte type = 0;
  
  static
  {
    if (!StatCfg.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public StatCfg() {}
  
  public StatCfg(byte paramByte1, byte paramByte2, short paramShort, int paramInt)
  {
    this.type = paramByte1;
    this.netType = paramByte2;
    this.lineNum = paramShort;
    this.internal = paramInt;
  }
  
  public final String className()
  {
    return "jce.StatCfg";
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
    paramStringBuilder.display(this.type, "type");
    paramStringBuilder.display(this.netType, "netType");
    paramStringBuilder.display(this.lineNum, "lineNum");
    paramStringBuilder.display(this.internal, "internal");
  }
  
  public final void displaySimple(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.displaySimple(this.type, true);
    paramStringBuilder.displaySimple(this.netType, true);
    paramStringBuilder.displaySimple(this.lineNum, true);
    paramStringBuilder.displaySimple(this.internal, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (StatCfg)paramObject;
    } while ((!JceUtil.equals(this.type, ((StatCfg)paramObject).type)) || (!JceUtil.equals(this.netType, ((StatCfg)paramObject).netType)) || (!JceUtil.equals(this.lineNum, ((StatCfg)paramObject).lineNum)) || (!JceUtil.equals(this.internal, ((StatCfg)paramObject).internal)));
    return true;
  }
  
  public final String fullClassName()
  {
    return "com.tencent.tmassistantsdk.protocol.jce.StatCfg";
  }
  
  public final int getInternal()
  {
    return this.internal;
  }
  
  public final short getLineNum()
  {
    return this.lineNum;
  }
  
  public final byte getNetType()
  {
    return this.netType;
  }
  
  public final byte getType()
  {
    return this.type;
  }
  
  public final int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("StatCfg", localException, "", new Object[0]);
    }
    return 0;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.type = paramJceInputStream.read(this.type, 0, true);
    this.netType = paramJceInputStream.read(this.netType, 1, true);
    this.lineNum = paramJceInputStream.read(this.lineNum, 2, false);
    this.internal = paramJceInputStream.read(this.internal, 3, false);
  }
  
  public final void setInternal(int paramInt)
  {
    this.internal = paramInt;
  }
  
  public final void setLineNum(short paramShort)
  {
    this.lineNum = paramShort;
  }
  
  public final void setNetType(byte paramByte)
  {
    this.netType = paramByte;
  }
  
  public final void setType(byte paramByte)
  {
    this.type = paramByte;
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.type, 0);
    paramJceOutputStream.write(this.netType, 1);
    paramJceOutputStream.write(this.lineNum, 2);
    paramJceOutputStream.write(this.internal, 3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\protocol\jce\StatCfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
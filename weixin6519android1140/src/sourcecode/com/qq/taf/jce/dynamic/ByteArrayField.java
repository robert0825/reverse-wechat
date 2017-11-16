package com.qq.taf.jce.dynamic;

public class ByteArrayField
  extends JceField
{
  private byte[] data;
  
  ByteArrayField(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfByte;
  }
  
  public byte[] get()
  {
    return this.data;
  }
  
  public void set(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\qq\taf\jce\dynamic\ByteArrayField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
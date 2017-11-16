package com.qq.taf.jce.dynamic;

public class StringField
  extends JceField
{
  private String data;
  
  StringField(String paramString, int paramInt)
  {
    super(paramInt);
    this.data = paramString;
  }
  
  public String get()
  {
    return this.data;
  }
  
  public void set(String paramString)
  {
    this.data = paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\qq\taf\jce\dynamic\StringField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
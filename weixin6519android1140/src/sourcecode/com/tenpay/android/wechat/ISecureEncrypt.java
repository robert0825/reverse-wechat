package com.tenpay.android.wechat;

public abstract interface ISecureEncrypt
{
  public abstract String desedeEncode(String paramString1, String paramString2);
  
  public abstract String desedeVerifyCode(String paramString1, String paramString2);
  
  public abstract String encryptPasswd(boolean paramBoolean, String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tenpay\android\wechat\ISecureEncrypt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
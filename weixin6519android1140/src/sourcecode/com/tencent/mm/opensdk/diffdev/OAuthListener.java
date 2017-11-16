package com.tencent.mm.opensdk.diffdev;

public abstract interface OAuthListener
{
  public abstract void onAuthFinish(OAuthErrCode paramOAuthErrCode, String paramString);
  
  public abstract void onAuthGotQrcode(String paramString, byte[] paramArrayOfByte);
  
  public abstract void onQrcodeScanned();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\OAuthListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.samsung.android.sdk.look.smartclip;

public class SlookSmartClipMetaTag
{
  public static final String TAG_TYPE_APP_DEEP_LINK = "app_deep_link";
  public static final String TAG_TYPE_PLAIN_TEXT = "plain_text";
  public static final String TAG_TYPE_TITLE = "title";
  public static final String TAG_TYPE_URL = "url";
  private String mType = null;
  private String mValue = null;
  
  public SlookSmartClipMetaTag(String paramString1, String paramString2)
  {
    this.mType = paramString1;
    this.mValue = paramString2;
  }
  
  public String getType()
  {
    return this.mType;
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public void setType(String paramString)
  {
    this.mType = paramString;
  }
  
  public void setValue(String paramString)
  {
    this.mValue = paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\smartclip\SlookSmartClipMetaTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
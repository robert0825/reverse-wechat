package com.tenpay.android.jni;

public class Encrypt
{
  private static final String CHARSET = "UTF-8";
  private static final String TAG = "Encrypt";
  private byte[] dec_buf;
  private byte[] enc_buf;
  private byte[] enc_passwd;
  private byte[] key_buf;
  private byte[] raw_buf;
  private byte[] raw_passwd;
  private String server_time_stamp = "0";
  private int time_stamp;
  
  static
  {
    try
    {
      System.loadLibrary("tenpay_utils");
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private String bcd2string(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      localStringBuilder.append((paramArrayOfByte[i] & 0xFF) >> 4);
      localStringBuilder.append(paramArrayOfByte[i] & 0xF);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private native boolean decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  private native boolean encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  private native boolean encryptPasswd(byte[] paramArrayOfByte);
  
  private native boolean encryptVerifyCode(byte[] paramArrayOfByte);
  
  private native byte[] getRandom();
  
  public String desedeDecode(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null) && (paramString1.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.raw_buf = paramString1.getBytes("UTF-8");
        this.key_buf = paramString2.getBytes("UTF-8");
        decrypt(this.key_buf, this.raw_buf);
        if (this.dec_buf == null) {
          return null;
        }
        try
        {
          paramString1 = new String(this.dec_buf, "UTF-8");
          return paramString1;
        }
        catch (Exception paramString1)
        {
          return null;
        }
        paramString1 = null;
      }
      catch (Exception paramString1)
      {
        return null;
      }
    }
  }
  
  public String desedeEncode(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.raw_buf = paramString.getBytes("UTF-8");
        encrypt(null, this.raw_buf);
        if (this.enc_buf == null) {
          return null;
        }
        try
        {
          paramString = new String(this.enc_buf, "UTF-8");
          return paramString;
        }
        catch (Exception paramString)
        {
          return null;
        }
        paramString = null;
      }
      catch (Exception paramString)
      {
        return null;
      }
    }
  }
  
  public String desedeEncode(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null) && (paramString1.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.raw_buf = paramString1.getBytes("UTF-8");
        this.key_buf = paramString2.getBytes("UTF-8");
        encrypt(this.key_buf, this.raw_buf);
        if (this.enc_buf == null) {
          return null;
        }
        try
        {
          paramString1 = new String(this.enc_buf, "UTF-8");
          return paramString1;
        }
        catch (Exception paramString1)
        {
          return null;
        }
        paramString1 = null;
      }
      catch (Exception paramString1)
      {
        return null;
      }
    }
  }
  
  public String desedeVerifyCode(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.raw_buf = paramString.getBytes("UTF-8");
        encryptVerifyCode(this.raw_buf);
        if (this.enc_buf == null) {
          return null;
        }
        try
        {
          paramString = new String(this.enc_buf, "UTF-8");
          return paramString;
        }
        catch (Exception paramString)
        {
          return null;
        }
        paramString = null;
      }
      catch (Exception paramString)
      {
        return null;
      }
    }
  }
  
  public String encryptPasswd(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (;;)
    {
      try
      {
        this.raw_passwd = paramString.getBytes("UTF-8");
        encryptPasswd(this.raw_passwd);
        if (this.enc_passwd == null) {
          return null;
        }
        try
        {
          paramString = new String(this.enc_passwd, "UTF-8");
          return paramString;
        }
        catch (Exception paramString)
        {
          return null;
        }
        paramString = null;
      }
      catch (Exception paramString)
      {
        return null;
      }
    }
  }
  
  public String getPasswdTimeStamp()
  {
    return String.valueOf(this.time_stamp);
  }
  
  public String getRandomKey()
  {
    String str = null;
    byte[] arrayOfByte = getRandom();
    if (arrayOfByte != null) {
      str = bcd2string(arrayOfByte);
    }
    return str;
  }
  
  public void setTimeStamp(String paramString)
  {
    this.server_time_stamp = paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tenpay\android\jni\Encrypt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
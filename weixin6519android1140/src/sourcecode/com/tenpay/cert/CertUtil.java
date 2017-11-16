package com.tenpay.cert;

import android.content.Context;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import java.io.File;
import java.security.MessageDigest;

public class CertUtil
{
  public static final String TAG = CertUtil.class.getSimpleName();
  private static CertUtil instance = null;
  private String cert_dir;
  private String cert_id = null;
  private byte[] certid_buf = null;
  private byte[] cipher_buf = null;
  private byte[] csr_buf = null;
  private String deskey = null;
  private String iccid = null;
  private String imei = null;
  private String imsi = null;
  private String login_ip = null;
  private Context mContext = null;
  private String mac = null;
  private String plain_buf = null;
  private byte[] plain_buf2 = null;
  private String priv_dir;
  private String publ_dir;
  private String qq_id = null;
  private byte[] sig_buf = null;
  private String sig_raw_buf = null;
  private String softid = null;
  private String svr_cert = null;
  private String token = null;
  private byte[] token_buf = null;
  private String token_dir;
  private int token_len = 0;
  
  private void checkDir(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
    while (paramString.isDirectory()) {
      return;
    }
    paramString.delete();
    paramString.mkdirs();
  }
  
  private boolean create_dir(String paramString)
  {
    try
    {
      paramString = new File(paramString);
      if (!paramString.exists())
      {
        boolean bool = paramString.mkdirs();
        return bool;
      }
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private boolean del_all_files(String paramString)
  {
    int i = 0;
    File localFile = new File(paramString);
    if (!localFile.exists()) {}
    while (!localFile.isDirectory()) {
      return false;
    }
    String[] arrayOfString = localFile.list();
    boolean bool = false;
    if (i >= arrayOfString.length) {
      return bool;
    }
    if (paramString.endsWith(File.separator))
    {
      localFile = new File(paramString + arrayOfString[i]);
      label88:
      if (!localFile.isFile()) {
        break label148;
      }
      localFile.delete();
    }
    for (;;)
    {
      i += 1;
      break;
      localFile = new File(paramString + File.separator + arrayOfString[i]);
      break label88;
      label148:
      if (localFile.isDirectory())
      {
        del_all_files(paramString + File.separator + arrayOfString[i]);
        del_dir(paramString + File.separator + arrayOfString[i], true);
        bool = true;
      }
    }
  }
  
  private void del_dir(String paramString, boolean paramBoolean)
  {
    try
    {
      del_all_files(paramString);
      if (paramBoolean) {
        new File(paramString.toString()).delete();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private native boolean encrypt();
  
  private native boolean gen_cert_apply_csr();
  
  private native boolean gen_qrcode();
  
  private String getCertDir()
  {
    return this.mContext.getFilesDir().getParentFile().getAbsolutePath() + "/cert";
  }
  
  public static CertUtil getInstance()
  {
    if (instance == null) {
      instance = new CertUtil();
    }
    return instance;
  }
  
  private native boolean get_certid();
  
  private native int get_last_error();
  
  private native boolean get_token();
  
  private native int get_token_count(boolean paramBoolean);
  
  private String hexdigest(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return "";
    }
    char[] arrayOfChar = new char[16];
    char[] tmp17_15 = arrayOfChar;
    tmp17_15[0] = 48;
    char[] tmp22_17 = tmp17_15;
    tmp22_17[1] = 49;
    char[] tmp27_22 = tmp22_17;
    tmp27_22[2] = 50;
    char[] tmp32_27 = tmp27_22;
    tmp32_27[3] = 51;
    char[] tmp37_32 = tmp32_27;
    tmp37_32[4] = 52;
    char[] tmp42_37 = tmp37_32;
    tmp42_37[5] = 53;
    char[] tmp47_42 = tmp42_37;
    tmp47_42[6] = 54;
    char[] tmp53_47 = tmp47_42;
    tmp53_47[7] = 55;
    char[] tmp59_53 = tmp53_47;
    tmp59_53[8] = 56;
    char[] tmp65_59 = tmp59_53;
    tmp65_59[9] = 57;
    char[] tmp71_65 = tmp65_59;
    tmp71_65[10] = 65;
    char[] tmp77_71 = tmp71_65;
    tmp77_71[11] = 66;
    char[] tmp83_77 = tmp77_71;
    tmp83_77[12] = 67;
    char[] tmp89_83 = tmp83_77;
    tmp89_83[13] = 68;
    char[] tmp95_89 = tmp89_83;
    tmp95_89[14] = 69;
    char[] tmp101_95 = tmp95_89;
    tmp101_95[15] = 70;
    tmp101_95;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      paramString = ((MessageDigest)localObject).digest();
      localObject = new char[32];
      int j = 0;
      for (;;)
      {
        if (i >= 16) {
          return new String((char[])localObject);
        }
        int k = paramString[i];
        int m = j + 1;
        localObject[j] = arrayOfChar[(k >>> 4 & 0xF)];
        j = m + 1;
        localObject[m] = arrayOfChar[(k & 0xF)];
        i += 1;
      }
      return null;
    }
    catch (Exception paramString) {}
  }
  
  private native boolean import_cert();
  
  private boolean isNotEmptyDir(String paramString)
  {
    boolean bool = true;
    paramString = new File(paramString);
    if ((!paramString.exists()) || (!paramString.isDirectory()) || (paramString.listFiles() == null)) {
      bool = false;
    }
    return bool;
  }
  
  private boolean isNullOrEmpty(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  private boolean isValidDir(String paramString)
  {
    boolean bool = true;
    paramString = new File(paramString);
    if ((!paramString.exists()) || (!paramString.isDirectory())) {
      bool = false;
    }
    return bool;
  }
  
  private native boolean is_cert_exist();
  
  private void setAndCheckDir(String paramString)
  {
    String str = getCertDir();
    paramString = str + "/" + hexdigest(new StringBuilder(String.valueOf(paramString)).append(this.imei).toString());
    this.cert_dir = (paramString + "/cert");
    this.priv_dir = (paramString + "/priv");
    this.publ_dir = (paramString + "/publ");
    this.token_dir = (paramString + "/auth");
    checkDir(str);
    checkDir(this.token_dir);
  }
  
  private void setDir(String paramString)
  {
    paramString = getCertDir() + "/" + hexdigest(new StringBuilder(String.valueOf(paramString)).append(this.imei).toString());
    this.cert_dir = (paramString + "/cert");
    this.priv_dir = (paramString + "/priv");
    this.publ_dir = (paramString + "/publ");
    this.token_dir = (paramString + "/auth");
  }
  
  private native boolean set_token();
  
  private native boolean usr_sig();
  
  public void clearAllCert()
  {
    del_dir(getCertDir(), true);
  }
  
  public void clearCert(String paramString)
  {
    del_dir(getCertDir() + "/" + hexdigest(new StringBuilder(String.valueOf(paramString)).append(this.imei).toString()), true);
  }
  
  public void clearToken(String paramString)
  {
    if (isNullOrEmpty(paramString)) {
      return;
    }
    setDir(paramString);
    del_dir(this.token_dir, true);
  }
  
  public String encrypt(String paramString1, String paramString2)
  {
    if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2))) {}
    do
    {
      return null;
      setAndCheckDir(paramString1);
    } while ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)));
    this.cert_id = paramString1;
    this.plain_buf = paramString2;
    this.cipher_buf = null;
    if ((encrypt()) && (this.cipher_buf != null)) {}
    for (;;)
    {
      try
      {
        paramString1 = new String(this.cipher_buf, "UTF-8");
        return paramString1;
      }
      catch (Exception paramString1)
      {
        return null;
      }
      paramString1 = null;
    }
  }
  
  public byte[] genQrcode(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2)) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {}
    do
    {
      do
      {
        return null;
        setAndCheckDir(paramString1);
      } while ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)));
      this.cert_id = paramString1;
      this.plain_buf2 = paramArrayOfByte;
      this.cipher_buf = null;
      this.token = paramString2;
    } while ((!gen_qrcode()) || (this.cipher_buf == null));
    try
    {
      paramString1 = this.cipher_buf;
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  public String genUserSig(String paramString1, String paramString2)
  {
    if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2))) {}
    do
    {
      return null;
      setAndCheckDir(paramString1);
    } while ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)) || (paramString1 == null) || (paramString2 == null) || (paramString1.length() <= 0) || (paramString2.length() <= 0));
    this.cert_id = paramString1;
    this.sig_raw_buf = paramString2;
    this.sig_buf = null;
    if ((usr_sig()) && (this.sig_buf != null)) {}
    for (;;)
    {
      try
      {
        paramString1 = new String(this.sig_buf, "UTF-8");
        return paramString1;
      }
      catch (Exception paramString1)
      {
        return null;
      }
      paramString1 = null;
    }
  }
  
  public String getCertApplyCSR(String paramString)
  {
    this.qq_id = paramString;
    this.csr_buf = null;
    if ((gen_cert_apply_csr()) && (this.csr_buf != null)) {}
    for (;;)
    {
      try
      {
        paramString = new String(this.csr_buf, "ASCII");
        return paramString;
      }
      catch (Exception paramString)
      {
        return null;
      }
      paramString = null;
    }
  }
  
  public int getLastError()
  {
    return get_last_error();
  }
  
  public String getToken(String paramString)
  {
    if (isNullOrEmpty(paramString)) {}
    do
    {
      return null;
      setAndCheckDir(paramString);
    } while (!isNotEmptyDir(this.token_dir));
    this.cert_id = paramString;
    if ((get_token()) && (this.token_buf != null)) {}
    for (;;)
    {
      try
      {
        paramString = new String(this.token_buf, "UTF-8");
        return paramString;
      }
      catch (Exception paramString)
      {
        return null;
      }
      paramString = null;
    }
  }
  
  public int getTokenCount(String paramString, boolean paramBoolean)
  {
    if (isNullOrEmpty(paramString)) {
      return 0;
    }
    setDir(paramString);
    this.cert_id = paramString;
    return get_token_count(paramBoolean);
  }
  
  public boolean importCert(String paramString1, String paramString2)
  {
    if (paramString2.length() <= 0) {
      return false;
    }
    try
    {
      this.svr_cert = new String(paramString2.getBytes(), "ASCII");
      setAndCheckDir(paramString1);
      del_dir(this.cert_dir, true);
      create_dir(this.cert_dir);
      del_dir(this.priv_dir, true);
      create_dir(this.priv_dir);
      del_dir(this.publ_dir, true);
      create_dir(this.publ_dir);
      return import_cert();
    }
    catch (Exception paramString2)
    {
      for (;;) {}
    }
  }
  
  public void init(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    try
    {
      this.imsi = localTelephonyManager.getSubscriberId();
      this.iccid = localTelephonyManager.getSimSerialNumber();
      this.imei = localTelephonyManager.getDeviceId();
      this.softid = Settings.System.getString(paramContext.getContentResolver(), "android_id");
      this.deskey = this.imei;
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public boolean isCertExist(String paramString)
  {
    if (isNullOrEmpty(paramString)) {}
    do
    {
      return false;
      setDir(paramString);
    } while ((!isNotEmptyDir(this.cert_dir)) || (!isNotEmptyDir(this.publ_dir)) || (!isNotEmptyDir(this.priv_dir)));
    this.cert_id = paramString;
    return is_cert_exist();
  }
  
  public boolean setTokens(String paramString1, String paramString2)
  {
    if ((isNullOrEmpty(paramString1)) || (isNullOrEmpty(paramString2))) {}
    do
    {
      return false;
      setAndCheckDir(paramString1);
    } while ((!isValidDir(this.cert_dir)) || (!isValidDir(this.token_dir)));
    this.cert_id = paramString1;
    this.token = paramString2;
    this.token_len = this.token.length();
    return set_token();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tenpay\cert\CertUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
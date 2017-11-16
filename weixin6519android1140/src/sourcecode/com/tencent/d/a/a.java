package com.tencent.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.d.a.c.d;
import com.tencent.d.a.c.e;
import com.tencent.d.a.c.f;
import com.tencent.d.a.c.g;
import com.tencent.d.a.c.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.UnrecoverableEntryException;

public final class a
  implements com.tencent.d.a.c.a
{
  private static boolean xZy = false;
  
  public static e Yr(String paramString)
  {
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      return new e(1, "no authKeyName");
    }
    if (cpw())
    {
      try
      {
        if (!cpz())
        {
          paramString = new e(3, "app secure key not exist");
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: generate auth key failed: " + paramString.toString(), new Object[0]);
        return new e(5, paramString.toString());
      }
      KeyStore.getInstance("AndroidKeyStore").load(null);
      KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
      try
      {
        localKeyPairGenerator.initialize(com.tencent.d.a.b.a.Yx(paramString + String.format(".addcounter.auto_signed_when_get_pubkey(%s).secmsg_and_counter_signed_when_sign", new Object[] { d.cpF().yae })).K(new String[] { "SHA-256" }).cpE().L(new String[] { "PSS" }).cpD());
        long l = System.nanoTime();
        localKeyPairGenerator.generateKeyPair();
        com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: generate successfully, cost: %d ms", new Object[] { Long.valueOf(f.ft(l)) });
        paramString = new e(0);
        return paramString;
      }
      catch (Exception paramString)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: cause exception. maybe reflection exception: " + paramString.toString(), new Object[0]);
        paramString = new e(5, paramString.toString());
        return paramString;
      }
    }
    com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter", new Object[0]);
    return new e(2);
  }
  
  public static boolean Ys(String paramString)
  {
    if (f.nm(paramString)) {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: authkey name not correct", new Object[0]);
    }
    for (;;)
    {
      return false;
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
        localKeyStore.load(null);
        paramString = localKeyStore.getCertificate(paramString);
        if (paramString != null) {
          return true;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: hasAppGlobalSecureKey exception: " + paramString.toString(), new Object[0]);
      }
    }
    return false;
  }
  
  public static boolean Yt(String paramString)
  {
    com.tencent.d.a.c.c.i("Soter.SoterCore", String.format("soter: checking key valid: auth key name: %s, autoDelIfNotValid: %b ", new Object[] { paramString, Boolean.valueOf(true) }), new Object[0]);
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: checking key valid: authkey name not correct", new Object[0]);
      return false;
    }
    try
    {
      Yw(paramString);
      com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: key valid", new Object[0]);
      return true;
    }
    catch (UnrecoverableEntryException localUnrecoverableEntryException)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: key invalid.", new Object[0]);
      bk(paramString, false);
      return false;
    }
    catch (Exception paramString)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: occurs other exceptions: %s", new Object[] { paramString.toString() });
      com.tencent.d.a.c.c.a("Soter.SoterCore", paramString, "soter: occurs other exceptions");
      return false;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      for (;;) {}
    }
  }
  
  public static g Yu(String paramString)
  {
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      return null;
    }
    if (cpw()) {
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance("SoterKeyStore");
        localKeyStore.load(null);
        try
        {
          paramString = localKeyStore.getKey(paramString, "from_soter_ui".toCharArray());
          if (paramString != null) {
            return bJ(paramString.getEncoded());
          }
          com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: key can not be retrieved", new Object[0]);
          return null;
        }
        catch (ClassCastException paramString)
        {
          com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: cast error: " + paramString.toString(), new Object[0]);
          return null;
        }
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter AndroidKeyStore", new Object[0]);
      }
      catch (Exception paramString)
      {
        com.tencent.d.a.c.c.a("Soter.SoterCore", paramString, "soter: error in get auth key model");
        return null;
      }
    }
    return null;
  }
  
  public static Signature Yv(String paramString)
  {
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      return null;
    }
    if (cpw()) {}
    try
    {
      paramString = Yw(paramString);
      return paramString;
    }
    catch (UnrecoverableEntryException paramString)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: key invalid. Advice remove the key", new Object[0]);
      return null;
    }
    catch (Exception paramString)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: exception when getSignatureResult: " + paramString.toString(), new Object[0]);
      com.tencent.d.a.c.c.a("Soter.SoterCore", paramString, "soter: exception when getSignatureResult");
      return null;
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soterAndroidKeyStore", new Object[0]);
      return null;
    }
    catch (InvalidKeyException paramString)
    {
      for (;;) {}
    }
  }
  
  private static Signature Yw(String paramString)
  {
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      return null;
    }
    Signature localSignature = Signature.getInstance("SHA256withRSA/PSS", "AndroidKeyStoreBCWorkaround");
    KeyStore localKeyStore = KeyStore.getInstance("SoterKeyStore");
    localKeyStore.load(null);
    paramString = (KeyStore.PrivateKeyEntry)localKeyStore.getEntry(paramString, null);
    if (paramString != null)
    {
      localSignature.initSign(paramString.getPrivateKey());
      return localSignature;
    }
    com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: entry not exists", new Object[0]);
    return null;
  }
  
  public static h bH(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      i = 1;
      if (i == 0) {
        break label38;
      }
      com.tencent.d.a.c.c.e("Soter.SoterCore", "origin is null or nil. abort", new Object[0]);
      paramArrayOfByte = (byte[])localObject;
    }
    label38:
    byte[] arrayOfByte;
    do
    {
      return paramArrayOfByte;
      i = 0;
      break;
      if (paramArrayOfByte.length < 4)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: length not correct 1", new Object[0]);
        return null;
      }
      localObject = new byte[4];
      System.arraycopy(paramArrayOfByte, 0, localObject, 0, 4);
      i = bI((byte[])localObject);
      com.tencent.d.a.c.c.d("Soter", "parsed raw length: " + i, new Object[0]);
      localObject = new byte[i];
      if (paramArrayOfByte.length <= i + 4)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: length not correct 2", new Object[0]);
        return null;
      }
      System.arraycopy(paramArrayOfByte, 4, localObject, 0, i);
      localObject = h.Yy(new String((byte[])localObject));
      int j = paramArrayOfByte.length - (i + 4);
      com.tencent.d.a.c.c.d("Soter.SoterCore", "soter: signature length: " + j, new Object[0]);
      arrayOfByte = new byte[j];
      System.arraycopy(paramArrayOfByte, i + 4, arrayOfByte, 0, j);
      paramArrayOfByte = (byte[])localObject;
    } while (localObject == null);
    ((h)localObject).signature = Base64.encodeToString(arrayOfByte, 2);
    return (h)localObject;
  }
  
  private static int bI(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    while (i < 4)
    {
      j += ((paramArrayOfByte[i] & 0xFF) << i * 8);
      i += 1;
    }
    return j;
  }
  
  private static g bJ(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: raw data is null", new Object[0]);
      return null;
    }
    if (paramArrayOfByte.length < 4) {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: raw data length smaller than RAW_LENGTH_PREFIX", new Object[0]);
    }
    Object localObject = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, localObject, 0, 4);
    int i = bI((byte[])localObject);
    com.tencent.d.a.c.c.d("Soter.SoterCore", "soter: parsed raw length: " + i, new Object[0]);
    localObject = new byte[i];
    if (paramArrayOfByte.length <= i + 4)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "length not correct 2", new Object[0]);
      return null;
    }
    System.arraycopy(paramArrayOfByte, 4, localObject, 0, i);
    localObject = new String((byte[])localObject);
    com.tencent.d.a.c.c.d("Soter.SoterCore", "soter: to convert json: " + (String)localObject, new Object[0]);
    localObject = new g((String)localObject, "");
    int j = paramArrayOfByte.length - (i + 4);
    com.tencent.d.a.c.c.d("Soter.SoterCore", "soter: signature length: " + j, new Object[0]);
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(paramArrayOfByte, i + 4, arrayOfByte, 0, j);
    ((g)localObject).signature = Base64.encodeToString(arrayOfByte, 2);
    return (g)localObject;
  }
  
  public static e bk(String paramString, boolean paramBoolean)
  {
    if (f.nm(paramString))
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: auth key name is null or nil. abort.", new Object[0]);
      return new e(1, "no authKeyName");
    }
    com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: start remove key: " + paramString, new Object[0]);
    if (cpw()) {
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance("SoterKeyStore");
        localKeyStore.load(null);
        localKeyStore.deleteEntry(paramString);
        if (paramBoolean)
        {
          com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: auto delete ask", new Object[0]);
          if (cpz()) {
            cpy();
          }
        }
        paramString = new e(0);
        return paramString;
      }
      catch (Exception paramString)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: removeAuthKey " + paramString.toString(), new Object[0]);
        return new e(6, paramString.toString());
      }
    }
    com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter", new Object[0]);
    return new e(2);
  }
  
  public static g cpA()
  {
    com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: start get app global secure key pub", new Object[0]);
    if (cpw()) {
      try
      {
        Object localObject = KeyStore.getInstance("SoterKeyStore");
        ((KeyStore)localObject).load(null);
        try
        {
          localObject = ((KeyStore)localObject).getKey(d.cpF().yae, "from_soter_ui".toCharArray());
          if (localObject != null) {
            return bJ(((Key)localObject).getEncoded());
          }
          com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: key can not be retrieved", new Object[0]);
          return null;
        }
        catch (ClassCastException localClassCastException)
        {
          com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: cast error: " + localClassCastException.toString(), new Object[0]);
          return null;
        }
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter", new Object[0]);
      }
      catch (Exception localException)
      {
        com.tencent.d.a.c.c.a("Soter.SoterCore", localException, "soter: error when get ask");
        return null;
      }
    }
    return null;
  }
  
  public static String cpB()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<deviceinfo>");
    localStringBuilder.append("<MANUFACTURER name=\"");
    localStringBuilder.append(Build.MANUFACTURER);
    localStringBuilder.append("\">");
    localStringBuilder.append("<MODEL name=\"");
    localStringBuilder.append(Build.MODEL);
    localStringBuilder.append("\">");
    localStringBuilder.append("<VERSION_RELEASE name=\"");
    localStringBuilder.append(Build.VERSION.RELEASE);
    localStringBuilder.append("\">");
    localStringBuilder.append("<VERSION_INCREMENTAL name=\"");
    localStringBuilder.append(Build.VERSION.INCREMENTAL);
    localStringBuilder.append("\">");
    localStringBuilder.append("<DISPLAY name=\"");
    localStringBuilder.append(Build.DISPLAY);
    localStringBuilder.append("\">");
    localStringBuilder.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
    com.tencent.d.a.c.c.d("Soter.SoterCore", "soter: getFingerprint  " + localStringBuilder.toString(), new Object[0]);
    return localStringBuilder.toString();
  }
  
  public static boolean cpw()
  {
    if (!xZy) {
      setUp();
    }
    Provider[] arrayOfProvider = Security.getProviders();
    if (arrayOfProvider == null)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: no provider supported", new Object[0]);
      return false;
    }
    int j = arrayOfProvider.length;
    int i = 0;
    while (i < j)
    {
      if ("SoterKeyStore".equals(arrayOfProvider[i].getName()))
      {
        com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: found soter provider", new Object[0]);
        return true;
      }
      i += 1;
    }
    com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: soter provider not found", new Object[0]);
    return false;
  }
  
  public static e cpx()
  {
    com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: start generate ask", new Object[0]);
    if (cpw()) {
      try
      {
        KeyStore.getInstance("AndroidKeyStore").load(null);
        Object localObject = KeyPairGenerator.getInstance("RSA", "SoterKeyStore");
        ((KeyPairGenerator)localObject).initialize(com.tencent.d.a.b.a.Yx(d.cpF().yae + ".addcounter.auto_signed_when_get_pubkey_attk").K(new String[] { "SHA-256" }).L(new String[] { "PSS" }).cpD());
        long l = System.nanoTime();
        ((KeyPairGenerator)localObject).generateKeyPair();
        com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: generate successfully. cost: %d ms", new Object[] { Long.valueOf(f.ft(l)) });
        localObject = new e(0);
        return (e)localObject;
      }
      catch (Exception localException)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: generateAppGlobalSecureKey " + localException.toString(), new Object[0]);
        com.tencent.d.a.c.c.a("Soter.SoterCore", localException, "soter: generateAppGlobalSecureKey error");
        return new e(4, localException.toString());
      }
    }
    com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter", new Object[0]);
    return new e(2);
  }
  
  public static e cpy()
  {
    com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: start remove app global secure key", new Object[0]);
    if (cpw()) {
      try
      {
        Object localObject = KeyStore.getInstance("SoterKeyStore");
        ((KeyStore)localObject).load(null);
        ((KeyStore)localObject).deleteEntry(d.cpF().yae);
        localObject = new e(0);
        return (e)localObject;
      }
      catch (Exception localException)
      {
        com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: removeAppGlobalSecureKey " + localException.toString(), new Object[0]);
        return new e(5, localException.toString());
      }
    }
    com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: not support soter", new Object[0]);
    return new e(2);
  }
  
  public static boolean cpz()
  {
    boolean bool = false;
    try
    {
      Object localObject = KeyStore.getInstance("AndroidKeyStore");
      ((KeyStore)localObject).load(null);
      localObject = ((KeyStore)localObject).getCertificate(d.cpF().yae);
      if (localObject != null) {
        bool = true;
      }
      return bool;
    }
    catch (Exception localException)
    {
      com.tencent.d.a.c.c.e("Soter.SoterCore", "soter: hasAppGlobalSecureKey exception: " + localException.toString(), new Object[0]);
    }
    return false;
  }
  
  public static boolean hD(Context paramContext)
  {
    return com.tencent.d.a.a.a.hG(paramContext).isHardwareDetected();
  }
  
  public static boolean hE(Context paramContext)
  {
    return com.tencent.d.a.a.a.hG(paramContext).hasEnrolledFingerprints();
  }
  
  public static boolean hF(Context paramContext)
  {
    return (!com.tencent.d.a.a.c.hO(paramContext)) && (!com.tencent.d.a.a.c.hN(paramContext));
  }
  
  @SuppressLint({"PrivateApi"})
  public static void setUp()
  {
    try
    {
      Method localMethod = Class.forName("android.security.keystore.SoterKeyStoreProvider").getMethod("install", new Class[0]);
      localMethod.setAccessible(true);
      localMethod.invoke(null, new Object[0]);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: no SoterProvider found", new Object[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: function not found", new Object[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: cannot access", new Object[0]);
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      com.tencent.d.a.c.c.i("Soter.SoterCore", "soter: InvocationTargetException", new Object[0]);
      return;
    }
    finally
    {
      xZy = true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
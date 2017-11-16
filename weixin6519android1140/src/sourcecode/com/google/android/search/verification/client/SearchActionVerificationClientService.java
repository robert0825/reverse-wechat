package com.google.android.search.verification.client;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.search.verification.a.a;
import com.google.android.search.verification.a.a.a;
import java.util.Iterator;
import java.util.Set;

public abstract class SearchActionVerificationClientService
  extends IntentService
{
  private final long aCA = 1000L;
  private final Intent aCB = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
  private a aCC;
  private a aCD = null;
  private final boolean aCz = ng();
  
  public SearchActionVerificationClientService()
  {
    super("SearchActionVerificationClientService");
  }
  
  private static void i(Intent paramIntent)
  {
    Object localObject = String.valueOf(paramIntent);
    new StringBuilder(String.valueOf(localObject).length() + 1).append("\t").append((String)localObject);
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null)
    {
      localObject = paramIntent.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        String.format("\t%s: %s", new Object[] { str, paramIntent.get(str) });
      }
    }
  }
  
  private boolean isConnected()
  {
    return this.aCD != null;
  }
  
  private static boolean ng()
  {
    return !"user".equals(Build.TYPE);
  }
  
  private boolean nh()
  {
    try
    {
      PackageInfo localPackageInfo = getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
      if (localPackageInfo.signatures != null)
      {
        if (localPackageInfo.signatures.length != 1) {
          return false;
        }
        boolean bool = Base64.encodeToString(localPackageInfo.signatures[0].toByteArray(), 2).equals("MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK");
        return bool;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (this.aCz)
      {
        String str = String.valueOf(localNameNotFoundException);
        new StringBuilder(String.valueOf(str).length() + 34).append("Unexpected NameNotFoundException: ").append(str);
      }
    }
    return false;
  }
  
  public abstract boolean a(Intent paramIntent, boolean paramBoolean);
  
  public final void onCreate()
  {
    super.onCreate();
    this.aCC = new a();
    bindService(this.aCB, this.aCC, 1);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    unbindService(this.aCC);
  }
  
  protected final void onHandleIntent(Intent paramIntent)
  {
    boolean bool = true;
    if (paramIntent == null) {}
    do
    {
      return;
      if ((ng()) || (nh())) {}
      Object localObject;
      for (int i = 1;; i = 0)
      {
        long l = System.nanoTime();
        while ((!isConnected()) && (System.nanoTime() - l < this.aCA * 1000000L))
        {
          try
          {
            Thread.sleep(50L);
          }
          catch (InterruptedException localInterruptedException) {}
          if (this.aCz)
          {
            localObject = String.valueOf(localInterruptedException);
            new StringBuilder(String.valueOf(localObject).length() + 33).append("Unexpected InterruptedException: ").append((String)localObject);
          }
        }
      }
      if (!isConnected()) {
        break;
      }
      if (paramIntent.hasExtra("SearchActionVerificationClientExtraIntent"))
      {
        paramIntent = (Intent)paramIntent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
        if (this.aCz) {
          i(paramIntent);
        }
        try
        {
          int j = this.aCD.getVersion();
          new StringBuilder(24).append("API version: ").append(j);
          localObject = new Bundle();
          if ((i == 0) || (!this.aCD.a(paramIntent, (Bundle)localObject))) {
            continue;
          }
        }
        catch (RemoteException paramIntent)
        {
          for (;;)
          {
            paramIntent = String.valueOf(paramIntent.getMessage());
            if (paramIntent.length() == 0) {
              break;
            }
            "Remote exception: ".concat(paramIntent);
            return;
            bool = false;
          }
          new String("Remote exception: ");
          return;
        }
        a(paramIntent, bool);
        return;
      }
    } while (!this.aCz);
    paramIntent = String.valueOf(paramIntent);
    new StringBuilder(String.valueOf(paramIntent).length() + 28).append("No extra, nothing to check: ").append(paramIntent);
    return;
    paramIntent = String.valueOf(paramIntent);
    new StringBuilder(String.valueOf(paramIntent).length() + 62).append("VerificationService is not connected, unable to check intent: ").append(paramIntent);
  }
  
  final class a
    implements ServiceConnection
  {
    a() {}
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      SearchActionVerificationClientService.a(SearchActionVerificationClientService.this, a.a.v(paramIBinder));
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      SearchActionVerificationClientService.a(SearchActionVerificationClientService.this, null);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\search\verification\client\SearchActionVerificationClientService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
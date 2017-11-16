package com.tencent.mm.plugin.gms;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import com.google.android.gms.auth.c;
import com.google.android.gms.auth.d;
import com.google.android.gms.common.e;
import com.tencent.gmtrace.GMTrace;
import java.io.IOException;

public class MMGoogleAuthUtil
  extends Activity
{
  private String ibH;
  private String mToken;
  private String mfZ;
  public int mga;
  
  public MMGoogleAuthUtil()
  {
    GMTrace.i(5213284990976L, 38842);
    this.mga = 0;
    GMTrace.o(5213284990976L, 38842);
  }
  
  private void cA(String paramString1, String paramString2)
  {
    GMTrace.i(5213687644160L, 38845);
    new a(this, paramString1, paramString2).execute(new Void[0]);
    GMTrace.o(5213687644160L, 38845);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5213553426432L, 38844);
    if (paramInt2 == -1)
    {
      switch (paramInt1)
      {
      }
      for (;;)
      {
        GMTrace.o(5213553426432L, 38844);
        return;
        paramIntent = paramIntent.getStringExtra("authAccount");
        Intent localIntent = new Intent();
        localIntent.putExtra("error_code", 0);
        localIntent.putExtra("account", paramIntent);
        setResult(-1, localIntent);
        finish();
        GMTrace.o(5213553426432L, 38844);
        return;
        cA(this.mfZ, this.ibH);
      }
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5213553426432L, 38844);
      return;
      paramIntent = new Intent();
      paramIntent.putExtra("error_code", -1);
      paramIntent.putExtra("error_msg", "User Cancel.");
      setResult(paramInt2, paramIntent);
      finish();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(5213419208704L, 38843);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    paramBundle = getIntent();
    Intent localIntent = new Intent();
    if (paramBundle != null)
    {
      String str = paramBundle.getAction();
      if (!TextUtils.isEmpty(str))
      {
        if (str.equals("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"))
        {
          paramBundle = new Intent();
          paramBundle.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
          paramBundle.setPackage("com.google.android.gms");
          paramBundle.putExtra("allowableAccounts", null);
          paramBundle.putExtra("allowableAccountTypes", new String[] { "com.google" });
          paramBundle.putExtra("addAccountOptions", null);
          paramBundle.putExtra("selectedAccount", null);
          paramBundle.putExtra("alwaysPromptForAccount", false);
          paramBundle.putExtra("descriptionTextOverride", null);
          paramBundle.putExtra("authTokenType", null);
          paramBundle.putExtra("addAccountRequiredFeatures", null);
          paramBundle.putExtra("setGmsCoreAccount", false);
          paramBundle.putExtra("overrideTheme", 0);
          paramBundle.putExtra("overrideCustomTheme", 0);
          startActivityForResult(paramBundle, 2001);
          GMTrace.o(5213419208704L, 38843);
          return;
        }
        if (str.equals("com.tencent.mm.gms.ACTION_GET_TOKEN"))
        {
          this.mfZ = paramBundle.getStringExtra("gmail");
          this.ibH = paramBundle.getStringExtra("scope");
          cA(this.mfZ, this.ibH);
          GMTrace.o(5213419208704L, 38843);
          return;
        }
        if (str.equals("com.tencent.mm.gms.CHECK_GP_SERVICES"))
        {
          int i = e.x(this);
          new StringBuilder().append(i);
          if (i != 0) {
            break label330;
          }
        }
      }
    }
    for (;;)
    {
      localIntent.putExtra("gpservices", bool);
      setResult(-1, localIntent);
      finish();
      localIntent.putExtra("error_msg", "null intent or action.");
      setResult(-1, localIntent);
      finish();
      GMTrace.o(5213419208704L, 38843);
      return;
      label330:
      bool = false;
    }
  }
  
  final class a
    extends AsyncTask<Void, Void, Void>
  {
    private String hZP;
    private String ibH;
    private Context mContext;
    private int mErrorCode;
    private boolean mgb;
    private boolean mgc;
    private String mgd;
    
    public a(Context paramContext, String paramString1, String paramString2)
    {
      GMTrace.i(5212613902336L, 38837);
      this.mgb = false;
      this.mContext = paramContext;
      this.mgd = paramString1;
      this.ibH = paramString2;
      this.mgb = false;
      GMTrace.o(5212613902336L, 38837);
    }
    
    private Void aHf()
    {
      GMTrace.i(5212882337792L, 38839);
      try
      {
        MMGoogleAuthUtil.a(MMGoogleAuthUtil.this, b.d(this.mContext, this.mgd, this.ibH));
        this.mgc = true;
        this.mErrorCode = 0;
        GMTrace.o(5212882337792L, 38839);
        return null;
      }
      catch (c localc)
      {
        for (;;)
        {
          this.hZP = localc.getMessage();
          this.mErrorCode = -2;
        }
      }
      catch (d locald)
      {
        do
        {
          this.hZP = locald.getMessage();
          this.mErrorCode = -3;
        } while (MMGoogleAuthUtil.this.mga >= 4);
        MMGoogleAuthUtil localMMGoogleAuthUtil = MMGoogleAuthUtil.this;
        localMMGoogleAuthUtil.mga += 1;
        this.mgb = true;
        localMMGoogleAuthUtil = MMGoogleAuthUtil.this;
        if (locald.Jt == null) {}
        for (Intent localIntent = null;; localIntent = new Intent(localIntent.Jt))
        {
          localMMGoogleAuthUtil.startActivityForResult(localIntent, 2002);
          break;
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.hZP = localIOException.getMessage();
          this.mErrorCode = -4;
        }
      }
      catch (a locala)
      {
        for (;;)
        {
          this.hZP = locala.getMessage();
          this.mErrorCode = -5;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.hZP = localException.getMessage();
          this.mErrorCode = -1;
        }
      }
    }
    
    protected final void onPreExecute()
    {
      GMTrace.i(5212748120064L, 38838);
      super.onPreExecute();
      this.mgc = false;
      GMTrace.o(5212748120064L, 38838);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gms\MMGoogleAuthUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
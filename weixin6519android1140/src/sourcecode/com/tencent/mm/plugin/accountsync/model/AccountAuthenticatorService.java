package com.tencent.mm.plugin.accountsync.model;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.accountsync.ui.ContactsSyncUI;
import com.tencent.mm.sdk.platformtools.w;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class AccountAuthenticatorService
  extends Service
{
  private static a htm;
  
  static
  {
    GMTrace.i(7834557218816L, 58372);
    htm = null;
    GMTrace.o(7834557218816L, 58372);
  }
  
  public AccountAuthenticatorService()
  {
    GMTrace.i(7834288783360L, 58370);
    GMTrace.o(7834288783360L, 58370);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(7834423001088L, 58371);
    if (paramIntent == null)
    {
      GMTrace.o(7834423001088L, 58371);
      return null;
    }
    if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.accounts.AccountAuthenticator")))
    {
      if (htm == null) {
        htm = new a(this);
      }
      paramIntent = htm.getIBinder();
      GMTrace.o(7834423001088L, 58371);
      return paramIntent;
    }
    GMTrace.o(7834423001088L, 58371);
    return null;
  }
  
  private static final class a
    extends AbstractAccountAuthenticator
  {
    private Context mContext;
    
    public a(Context paramContext)
    {
      super();
      GMTrace.i(7833215041536L, 58362);
      this.mContext = paramContext;
      GMTrace.o(7833215041536L, 58362);
    }
    
    public final Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
    {
      GMTrace.i(7833349259264L, 58363);
      paramString1 = new Bundle();
      paramString2 = new Intent(this.mContext, ContactsSyncUI.class);
      paramString2.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
      paramString2.putExtra("contact_sync_scene", 1);
      paramString1.putParcelable("intent", paramString2);
      GMTrace.o(7833349259264L, 58363);
      return paramString1;
    }
    
    public final Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
    {
      GMTrace.i(7833483476992L, 58364);
      w.i("MicroMsg.AccountAuthenticatorService", "confirmCredentials");
      GMTrace.o(7833483476992L, 58364);
      return null;
    }
    
    public final Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
    {
      GMTrace.i(7833617694720L, 58365);
      w.i("MicroMsg.AccountAuthenticatorService", "editProperties");
      GMTrace.o(7833617694720L, 58365);
      return null;
    }
    
    public final Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
    {
      GMTrace.i(7833751912448L, 58366);
      w.i("MicroMsg.AccountAuthenticatorService", "getAuthToken");
      GMTrace.o(7833751912448L, 58366);
      return null;
    }
    
    public final String getAuthTokenLabel(String paramString)
    {
      GMTrace.i(7833886130176L, 58367);
      w.i("MicroMsg.AccountAuthenticatorService", "getAuthTokenLabel");
      GMTrace.o(7833886130176L, 58367);
      return null;
    }
    
    public final Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
    {
      GMTrace.i(7834020347904L, 58368);
      w.i("MicroMsg.AccountAuthenticatorService", "hasFeatures: " + paramArrayOfString);
      GMTrace.o(7834020347904L, 58368);
      return null;
    }
    
    public final Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
    {
      GMTrace.i(7834154565632L, 58369);
      w.i("MicroMsg.AccountAuthenticatorService", "updateCredentials");
      GMTrace.o(7834154565632L, 58369);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\model\AccountAuthenticatorService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
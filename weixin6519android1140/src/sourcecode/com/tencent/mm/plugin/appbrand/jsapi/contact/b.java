package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.a.a;
import android.telephony.PhoneNumberUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 72;
  public static final String NAME = "chooseContact";
  
  public b()
  {
    GMTrace.i(19805973250048L, 147566);
    GMTrace.o(19805973250048L, 147566);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    int i = 0;
    GMTrace.i(19806107467776L, 147567);
    final MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiChooseContact", "getPageContext failed, appid is %s", new Object[] { paramj.hyD });
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19806107467776L, 147567);
      return;
    }
    com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19804765290496L, 147557);
        if (paramAnonymousInt != 48)
        {
          GMTrace.o(19804765290496L, 147557);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          b.this.a(paramj, paramJSONObject, paramInt);
          GMTrace.o(19804765290496L, 147557);
          return;
        }
        paramj.v(paramInt, b.this.d("permission_denied", null));
        GMTrace.o(19804765290496L, 147557);
      }
    });
    paramJSONObject = a(paramj);
    if (paramJSONObject == null) {
      paramj.v(paramInt, d("fail", null));
    }
    while (i == 0)
    {
      w.i("MicroMsg.JsApiChooseContact", "check permission");
      GMTrace.o(19806107467776L, 147567);
      return;
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(paramJSONObject, "android.permission.READ_CONTACTS", 48, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        i = bool;
      }
    }
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(19806375903232L, 147569);
        if (100 != paramAnonymousInt1)
        {
          w.e("MicroMsg.JsApiChooseContact", "requestcode not equal, requestCode = %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          paramj.v(paramInt, b.this.d("fail", null));
          GMTrace.o(19806375903232L, 147569);
          return;
        }
        if ((paramAnonymousInt2 == 0) || (paramAnonymousInt2 == 1))
        {
          paramj.v(paramInt, b.this.d("cancel", null));
          GMTrace.o(19806375903232L, 147569);
          return;
        }
        String str;
        Object localObject1;
        Object localObject2;
        Cursor localCursor1;
        Cursor localCursor2;
        if (paramAnonymousInt2 == -1)
        {
          str = null;
          localObject1 = null;
          localObject2 = null;
          paramAnonymousIntent = paramAnonymousIntent.getData();
          if (paramAnonymousIntent == null)
          {
            w.e("MicroMsg.JsApiChooseContact", "onActivityResult, uri == null");
            paramj.v(paramInt, b.this.d("fail", null));
            GMTrace.o(19806375903232L, 147569);
            return;
          }
          if (!com.tencent.mm.pluginsdk.h.a.aS(localMMActivity, "android.permission.READ_CONTACTS"))
          {
            w.e("MicroMsg.JsApiChooseContact", "onActivityResult, no contact permission");
            paramj.v(paramInt, b.this.d("fail:system permission denied", null));
            GMTrace.o(19806375903232L, 147569);
            return;
          }
          try
          {
            localCursor1 = localMMActivity.getContentResolver().query(paramAnonymousIntent, null, null, null, null);
            if ((localCursor1 == null) || (localCursor1.getCount() <= 0)) {
              break label874;
            }
            localCursor1.moveToFirst();
            paramAnonymousInt1 = localCursor1.getColumnIndex("has_phone_number");
            if ((paramAnonymousInt1 > 0) && (localCursor1.getInt(paramAnonymousInt1) <= 0)) {
              break label874;
            }
            paramAnonymousIntent = localCursor1.getString(localCursor1.getColumnIndex("_id"));
            localCursor2 = localMMActivity.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + paramAnonymousIntent, null, null);
            w.i("MicroMsg.JsApiChooseContact", "onActivityResult, queried cursor = %s", new Object[] { localCursor1 });
            if (localCursor2 == null)
            {
              paramj.v(paramInt, b.this.d("fail", null));
              GMTrace.o(19806375903232L, 147569);
              return;
            }
          }
          catch (SecurityException paramAnonymousIntent)
          {
            w.e("MicroMsg.JsApiChooseContact", "onActivityResult, permission denied: %s", new Object[] { paramAnonymousIntent.toString() });
            h.b(localMMActivity, ab.getResources().getString(o.i.hGs), "", true);
            paramj.v(paramInt, b.this.d("fail:system permission denied", null));
            GMTrace.o(19806375903232L, 147569);
            return;
          }
          paramAnonymousIntent = (Intent)localObject2;
          if (localCursor2.moveToFirst())
          {
            localObject1 = null;
            paramAnonymousIntent = null;
            if (!localCursor2.isAfterLast())
            {
              paramAnonymousInt1 = localCursor2.getColumnIndex("data1");
              paramAnonymousInt2 = localCursor2.getColumnIndex("display_name");
              localObject1 = localCursor2.getString(paramAnonymousInt1);
              localObject2 = localCursor2.getString(paramAnonymousInt2);
              w.d("MicroMsg.JsApiChooseContact", "onActivityResult, username : " + (String)localObject2);
              if (localObject1 == null) {
                break label868;
              }
              w.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : " + (String)localObject1);
              if (localObject1 == null) {
                localObject1 = null;
              }
              for (;;)
              {
                w.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : " + (String)localObject1);
                if ((!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1)) || (((String)localObject1).length() != 11)) {
                  break label862;
                }
                w.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneResult : " + (String)localObject1);
                label633:
                localCursor2.moveToNext();
                paramAnonymousIntent = (Intent)localObject1;
                localObject1 = localObject2;
                break;
                str = ((String)localObject1).replaceAll("\\D", "");
                localObject1 = str;
                if (str.startsWith("86")) {
                  localObject1 = str.substring(2);
                }
              }
            }
            localObject2 = localObject1;
            localObject1 = paramAnonymousIntent;
            paramAnonymousIntent = (Intent)localObject2;
          }
        }
        for (;;)
        {
          try
          {
            localCursor2.close();
            if ((localCursor1 != null) && (!localCursor1.isClosed())) {
              localCursor1.close();
            }
            if (!bg.nm((String)localObject1))
            {
              localObject2 = new HashMap(1);
              ((Map)localObject2).put("phoneNumber", localObject1);
              localObject1 = paramAnonymousIntent;
              if (paramAnonymousIntent == null) {
                localObject1 = "";
              }
              ((Map)localObject2).put("displayName", localObject1);
              paramj.v(paramInt, b.this.d("ok", (Map)localObject2));
              GMTrace.o(19806375903232L, 147569);
              return;
            }
          }
          catch (Exception localException)
          {
            continue;
            paramj.v(paramInt, b.this.d("fail", null));
            Toast.makeText(localMMActivity, o.i.hGh, 0).show();
          }
          GMTrace.o(19806375903232L, 147569);
          return;
          label862:
          localObject1 = paramAnonymousIntent;
          break;
          label868:
          localObject1 = paramAnonymousIntent;
          break label633;
          label874:
          paramAnonymousIntent = null;
          localObject1 = str;
        }
      }
    };
    localMMActivity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 100);
    GMTrace.o(19806107467776L, 147567);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\contact\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
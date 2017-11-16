package com.tencent.mm.pluginsdk.ui.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.PlatformComm.C2Java;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i.c;
import com.tencent.mm.protocal.c.apf;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class j
{
  static String tEd;
  
  private static void a(Activity paramActivity, x paramx, String paramString, ArrayList<String> paramArrayList)
  {
    GMTrace.i(1210241253376L, 9017);
    Object localObject = new apf();
    ((apf)localObject).uEJ = paramString;
    atq localatq = new atq();
    localatq.jhc = paramArrayList.size();
    localatq.uJi = new LinkedList();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      atp localatp = new atp();
      localatp.uJh = str;
      localatq.uJi.add(localatp);
    }
    ((apf)localObject).uEF = localatq;
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(60, (com.tencent.mm.bm.a)localObject));
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
    if ((paramString != null) && ((int)paramString.fTq > 0) && (com.tencent.mm.l.a.eE(paramString.field_type)))
    {
      paramArrayList = paramArrayList.iterator();
      for (paramString = ""; paramArrayList.hasNext(); paramString = paramString + ",")
      {
        localObject = (String)paramArrayList.next();
        paramString = paramString + (String)localObject;
      }
      paramx.cL(paramString);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Q(paramx);
    }
    Toast.makeText(paramActivity, paramActivity.getString(R.l.edB), 0).show();
    GMTrace.o(1210241253376L, 9017);
  }
  
  public static void a(Activity paramActivity, String paramString, Bundle paramBundle)
  {
    GMTrace.i(16012309168128L, 119301);
    String str = bg.nl(paramBundle.getString("Contact_User"));
    if (str == null)
    {
      w.e("MicroMsg.MailPhoneMenuHelper", "username is null");
      GMTrace.o(16012309168128L, 119301);
      return;
    }
    x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
    if (localx == null)
    {
      w.e("MicroMsg.MailPhoneMenuHelper", "contact is null");
      GMTrace.o(16012309168128L, 119301);
      return;
    }
    Object localObject = paramBundle.getString("Contact_Mobile_MD5");
    paramBundle = localx.fjz;
    int i;
    if (!bg.nm((String)localObject)) {
      if (localObject == paramString) {
        i = 0;
      }
    }
    for (;;)
    {
      localObject = new ArrayList();
      if (!bg.nm(paramBundle))
      {
        paramBundle = paramBundle.split(",");
        int j = 0;
        for (;;)
        {
          if (j < paramBundle.length)
          {
            ((ArrayList)localObject).add(paramBundle[j]);
            j += 1;
            continue;
            if (localx.vg()) {
              break label303;
            }
            i = 1;
            break;
          }
        }
        if (((ArrayList)localObject).contains(paramString)) {
          ((ArrayList)localObject).remove(paramString);
        }
      }
      ((ArrayList)localObject).add(paramString);
      if (((ArrayList)localObject).size() + i <= 5)
      {
        a(paramActivity, localx, str, (ArrayList)localObject);
        g.ork.i(12040, new Object[] { localx.field_username, Integer.valueOf(4), Integer.valueOf(i), Integer.valueOf(i + ((ArrayList)localObject).size()) });
        GMTrace.o(16012309168128L, 119301);
        return;
      }
      Toast.makeText(paramActivity, paramActivity.getString(R.l.dJi), 0).show();
      GMTrace.o(16012309168128L, 119301);
      return;
      label303:
      i = 0;
    }
  }
  
  public static void a(final Context paramContext, String paramString, final DialogInterface.OnDismissListener paramOnDismissListener, final Bundle paramBundle)
  {
    GMTrace.i(1209838600192L, 9014);
    if (!(paramContext instanceof Activity)) {
      w.w("MicroMsg.MailPhoneMenuHelper", "context should be Activity, %s", new Object[] { bg.bQW() });
    }
    if (com.tencent.mm.kernel.h.xw().wL()) {}
    for (boolean bool = ((Boolean)com.tencent.mm.kernel.h.xy().xh().get(w.a.vsi, Boolean.valueOf(false))).booleanValue();; bool = false)
    {
      final int i;
      int j;
      if (paramBundle != null)
      {
        i = paramBundle.getInt("fromScene");
        if ((!bNc()) && (!bNd())) {
          break label482;
        }
        j = 1;
        label95:
        if (j == 0) {
          break label751;
        }
        if (paramBundle != null) {
          break label488;
        }
        localObject = "";
        label108:
        localObject = bg.nl((String)localObject);
        if ((localObject != null) && (localObject != "") && (!((String)localObject).endsWith("@chatroom")) && (!q.fp((String)localObject))) {
          break label550;
        }
        if (!bool) {
          break label499;
        }
        localObject = new String[4];
        localObject[0] = paramContext.getResources().getString(R.l.dgR);
        localObject[1] = paramContext.getResources().getString(R.l.dgS);
        localObject[2] = paramContext.getResources().getString(R.l.dgM);
        localObject[3] = paramContext.getResources().getString(R.l.dgK);
      }
      label213:
      label482:
      label488:
      label499:
      label550:
      label751:
      for (final Object localObject = bg.g((String[])localObject);; localObject = bg.g(new String[] { paramContext.getResources().getString(R.l.dgR), paramContext.getResources().getString(R.l.dgM) }))
      {
        g.ork.i(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
        if (o.pw())
        {
          ((List)localObject).add(paramContext.getResources().getString(R.l.dgN));
          g.ork.i(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(3) });
          if (PlatformComm.C2Java.isNetworkConnected())
          {
            j = bg.a((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqK, null), 3);
            w.v("MicroMsg.WxPhoneBookHelper", "hy: minus pb counter, ori counter = %d", new Object[] { Integer.valueOf(j) });
            com.tencent.mm.kernel.h.xy().xh().a(w.a.vqK, Integer.valueOf(j - 1));
          }
        }
        final m localm = new m(paramContext);
        localm.setTitle(paramString);
        a locala = new a((List)localObject, paramContext, paramOnDismissListener, paramBundle);
        locala.tEl = new j.a.a()
        {
          public final void fw(boolean paramAnonymousBoolean)
          {
            GMTrace.i(1214670438400L, 9050);
            if (paramAnonymousBoolean)
            {
              this.tEh.dismiss();
              if (paramOnDismissListener != null) {
                paramOnDismissListener.onDismiss(null);
              }
            }
            GMTrace.o(1214670438400L, 9050);
          }
        };
        localm.jDh = locala;
        com.tencent.mm.ui.base.h.a(paramContext, localm);
        localm.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1209570164736L, 9012);
            if (this.tEe != null) {
              this.tEe.onDismiss(null);
            }
            GMTrace.o(1209570164736L, 9012);
          }
        });
        localm.tFM = new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, final View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(1208093769728L, 9001);
            paramAnonymousView = this.mtS.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
            paramAnonymousAdapterView = (String)localObject.get(paramAnonymousInt);
            w.i("MicroMsg.MailPhoneMenuHelper", paramAnonymousAdapterView);
            if (paramContext.getString(R.l.dgR).equals(paramAnonymousAdapterView))
            {
              paramAnonymousAdapterView = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramAnonymousView));
              paramAnonymousAdapterView.addFlags(268435456);
              if (bg.j(paramContext, paramAnonymousAdapterView)) {
                paramContext.startActivity(paramAnonymousAdapterView);
              }
              g.ork.A(10112, "1");
              localm.dismiss();
              if (paramOnDismissListener != null) {
                paramOnDismissListener.onDismiss(null);
              }
              GMTrace.o(1208093769728L, 9001);
              return;
            }
            if (paramContext.getString(R.l.dgS).equals(paramAnonymousAdapterView))
            {
              g.ork.i(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
              paramAnonymousAdapterView = new Intent();
              paramAnonymousAdapterView.putExtra("IPCallTalkUI_phoneNumber", paramAnonymousView);
              com.tencent.mm.bj.d.b(paramContext, "ipcall", ".ui.IPCallDialUI", paramAnonymousAdapterView);
              localm.dismiss();
              if (paramOnDismissListener != null) {
                paramOnDismissListener.onDismiss(null);
              }
              GMTrace.o(1208093769728L, 9001);
              return;
            }
            if (paramContext.getString(R.l.dgK).equals(paramAnonymousAdapterView))
            {
              if ((j.bNc()) && (j.bNd())) {
                paramAnonymousAdapterView = paramContext.getResources().getStringArray(R.c.aMt);
              }
              for (;;)
              {
                paramContext.getResources().getString(R.l.dgP);
                com.tencent.mm.ui.base.h.a(paramContext, this.mtS, paramAnonymousAdapterView, "", new h.c()new DialogInterface.OnCancelListener
                {
                  public final void hQ(int paramAnonymous2Int)
                  {
                    GMTrace.i(1206214721536L, 8987);
                    if (j.7.this.tEe != null) {
                      j.7.this.tEe.onDismiss(null);
                    }
                    switch (paramAnonymous2Int)
                    {
                    }
                    for (;;)
                    {
                      GMTrace.o(1206214721536L, 8987);
                      return;
                      if (j.bNc())
                      {
                        Context localContext = j.7.this.val$context;
                        String str = paramAnonymousView;
                        Intent localIntent = new Intent("android.intent.action.INSERT");
                        localIntent.setType("vnd.android.cursor.dir/contact");
                        localIntent.putExtra("phone", str);
                        localContext.startActivity(localIntent);
                        g.ork.A(10113, "1");
                        GMTrace.o(1206214721536L, 8987);
                        return;
                      }
                      j.aX(j.7.this.val$context, paramAnonymousView);
                      g.ork.A(10114, "1");
                      GMTrace.o(1206214721536L, 8987);
                      return;
                      j.aX(j.7.this.val$context, paramAnonymousView);
                      g.ork.A(10114, "1");
                    }
                  }
                }, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(1208630640640L, 9005);
                    if (j.7.this.tEe != null) {
                      j.7.this.tEe.onDismiss(null);
                    }
                    GMTrace.o(1208630640640L, 9005);
                  }
                });
                localm.dismiss();
                GMTrace.o(1208093769728L, 9001);
                return;
                if (j.bNc())
                {
                  paramAnonymousAdapterView = new String[1];
                  paramAnonymousAdapterView[0] = paramContext.getResources().getString(R.l.dgJ);
                }
                else
                {
                  paramAnonymousAdapterView = new String[1];
                  paramAnonymousAdapterView[0] = paramContext.getResources().getString(R.l.dgQ);
                }
              }
            }
            if (paramContext.getString(R.l.dgM).equals(paramAnonymousAdapterView))
            {
              c.a(paramContext, paramAnonymousView, paramAnonymousView);
              g.ork.A(10115, "1");
              if (paramOnDismissListener != null) {
                paramOnDismissListener.onDismiss(null);
              }
              localm.dismiss();
              Toast.makeText(paramContext, paramContext.getString(R.l.cSq), 1).show();
              GMTrace.o(1208093769728L, 9001);
              return;
            }
            if (paramContext.getString(R.l.dgN).equals(paramAnonymousAdapterView))
            {
              w.d("MicroMsg.MailPhoneMenuHelper", "hy: button should consume this action");
              GMTrace.o(1208093769728L, 9001);
              return;
            }
            if (j.tEd.equals(paramAnonymousAdapterView))
            {
              j.a((Activity)paramContext, this.mtS, paramBundle);
              localm.dismiss();
              if (paramOnDismissListener != null)
              {
                paramOnDismissListener.onDismiss(null);
                GMTrace.o(1208093769728L, 9001);
              }
            }
            else
            {
              w.e("MicroMsg.MailPhoneMenuHelper", "hy: error phone item clicked. should not happen");
              localm.dismiss();
              if (paramOnDismissListener != null) {
                paramOnDismissListener.onDismiss(null);
              }
            }
            GMTrace.o(1208093769728L, 9001);
          }
        };
        localm.show();
        GMTrace.o(1209838600192L, 9014);
        return;
        i = 0;
        break;
        j = 0;
        break label95;
        localObject = paramBundle.getString("Contact_User");
        break label108;
        localObject = new String[3];
        localObject[0] = paramContext.getResources().getString(R.l.dgR);
        localObject[1] = paramContext.getResources().getString(R.l.dgM);
        localObject[2] = paramContext.getResources().getString(R.l.dgK);
        break label213;
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject);
        if (localObject == null)
        {
          GMTrace.o(1209838600192L, 9014);
          return;
        }
        localObject = ((x)localObject).vk();
        tEd = paramContext.getResources().getString(R.l.dgL, new Object[] { localObject });
        if (bool)
        {
          localObject = new String[5];
          localObject[0] = paramContext.getResources().getString(R.l.dgR);
          localObject[1] = paramContext.getResources().getString(R.l.dgS);
          localObject[2] = tEd;
          localObject[3] = paramContext.getResources().getString(R.l.dgM);
          localObject[4] = paramContext.getResources().getString(R.l.dgK);
          break label213;
        }
        localObject = new String[4];
        localObject[0] = paramContext.getResources().getString(R.l.dgR);
        localObject[1] = tEd;
        localObject[2] = paramContext.getResources().getString(R.l.dgM);
        localObject[3] = paramContext.getResources().getString(R.l.dgK);
        break label213;
      }
    }
  }
  
  public static void aW(Context paramContext, String paramString)
  {
    GMTrace.i(16012040732672L, 119299);
    Intent localIntent = new Intent("android.intent.action.SENDTO");
    localIntent.setData(Uri.parse("mailto:"));
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramString });
    if (bg.j(paramContext, localIntent))
    {
      paramContext.startActivity(localIntent);
      GMTrace.o(16012040732672L, 119299);
      return;
    }
    com.tencent.mm.ui.base.h.a(paramContext, R.l.dgH, R.l.cUG, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1210912342016L, 9022);
        GMTrace.o(1210912342016L, 9022);
      }
    });
    GMTrace.o(16012040732672L, 119299);
  }
  
  public static void aX(Context paramContext, String paramString)
  {
    GMTrace.i(16012174950400L, 119300);
    Intent localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
    localIntent.setType("vnd.android.cursor.item/person");
    localIntent.putExtra("phone", paramString);
    if (bg.j(paramContext, localIntent)) {
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(16012174950400L, 119300);
  }
  
  public static void b(final Context paramContext, final String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(1209704382464L, 9013);
    if ((q.zP() & 0x1) == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      com.tencent.mm.ui.base.h.a(paramContext, paramString, paramContext.getResources().getStringArray(R.c.aMm), "", new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(1203798802432L, 8969);
          if (this.tEe != null) {
            this.tEe.onDismiss(null);
          }
          String str1 = paramString.replace(" ", "").replace("#", "@");
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(1203798802432L, 8969);
            return;
            Context localContext = paramContext;
            Intent localIntent = new Intent();
            localIntent.putExtra("composeType", 4);
            String str2 = str1.substring(0, str1.indexOf('@'));
            localIntent.putExtra("toList", new String[] { str2 + " " + str1 });
            com.tencent.mm.bj.d.b(localContext, "qqmail", ".ui.ComposeUI", localIntent);
            GMTrace.o(1203798802432L, 8969);
            return;
            j.aW(paramContext, str1);
          }
        }
      });
      GMTrace.o(1209704382464L, 9013);
      return;
    }
    String str = paramContext.getResources().getString(R.l.dfi);
    paramOnDismissListener = new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(1211583430656L, 9027);
        if (this.tEe != null) {
          this.tEe.onDismiss(null);
        }
        String str = paramString.replace(" ", "").replace("#", "@");
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(1211583430656L, 9027);
          return;
          j.aW(paramContext, str);
        }
      }
    };
    com.tencent.mm.ui.base.h.a(paramContext, paramString, new String[] { str }, "", paramOnDismissListener);
    GMTrace.o(1209704382464L, 9013);
  }
  
  public static boolean bNc()
  {
    GMTrace.i(1209972817920L, 9015);
    Context localContext = ab.getContext();
    Intent localIntent = new Intent("android.intent.action.INSERT");
    localIntent.setType("vnd.android.cursor.dir/contact");
    localIntent.putExtra("phone", "10086");
    boolean bool = bg.j(localContext, localIntent);
    GMTrace.o(1209972817920L, 9015);
    return bool;
  }
  
  public static boolean bNd()
  {
    GMTrace.i(1210107035648L, 9016);
    boolean bool = bg.j(ab.getContext(), new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI));
    GMTrace.o(1210107035648L, 9016);
    return bool;
  }
  
  private static final class a
    extends BaseAdapter
  {
    private List<String> lWy;
    private Context mContext;
    private Bundle qM;
    private DialogInterface.OnDismissListener tEk;
    a tEl;
    
    public a(List<String> paramList, Context paramContext, DialogInterface.OnDismissListener paramOnDismissListener, Bundle paramBundle)
    {
      GMTrace.i(1220441800704L, 9093);
      this.lWy = null;
      this.mContext = null;
      this.tEk = null;
      this.qM = null;
      this.tEl = null;
      if (paramContext != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.lWy = paramList;
        this.mContext = paramContext;
        this.tEk = paramOnDismissListener;
        this.qM = paramBundle;
        GMTrace.o(1220441800704L, 9093);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(1220576018432L, 9094);
      if (this.lWy == null)
      {
        GMTrace.o(1220576018432L, 9094);
        return 0;
      }
      int i = this.lWy.size();
      GMTrace.o(1220576018432L, 9094);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1220710236160L, 9095);
      Object localObject = this.lWy.get(paramInt);
      GMTrace.o(1220710236160L, 9095);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1220844453888L, 9096);
      long l = paramInt;
      GMTrace.o(1220844453888L, 9096);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(1221112889344L, 9098);
      String str = (String)this.lWy.get(paramInt);
      if (this.mContext.getString(R.l.dgN).equals(str))
      {
        GMTrace.o(1221112889344L, 9098);
        return 1;
      }
      GMTrace.o(1221112889344L, 9098);
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1221247107072L, 9099);
      String str = (String)getItem(paramInt);
      paramInt = getItemViewType(paramInt);
      Object localObject;
      if (paramView == null)
      {
        paramView = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
        if (paramInt == 1)
        {
          paramViewGroup = paramView.inflate(R.i.csG, paramViewGroup, false);
          paramView = new b();
          ((b)paramView).ikm = ((TextView)paramViewGroup.findViewById(R.h.title));
          ((b)paramView).lhI = ((Button)paramViewGroup.findViewById(R.h.buO));
          ((b)paramView).tEn = ((TextView)paramViewGroup.findViewById(R.h.chw));
          paramViewGroup.setTag(paramView);
          localObject = paramView;
          paramView = paramViewGroup;
          switch (paramInt)
          {
          default: 
            label127:
            w.e("MicroMsg.MailPhoneMenuHelper", "hy: error tag");
          }
        }
      }
      for (;;)
      {
        GMTrace.o(1221247107072L, 9099);
        return paramView;
        paramViewGroup = paramView.inflate(R.i.csH, paramViewGroup, false);
        paramView = new c();
        ((c)paramView).ikm = ((TextView)paramViewGroup.findViewById(R.h.title));
        break;
        localObject = paramView.getTag();
        break label127;
        paramViewGroup = (c)localObject;
        paramViewGroup.ikm.setText(h.b(this.mContext, bg.nl(str), paramViewGroup.ikm.getTextSize()));
        continue;
        paramViewGroup = (b)localObject;
        paramViewGroup.ikm.setText(h.b(this.mContext, bg.nl(str), paramViewGroup.ikm.getTextSize()));
        paramViewGroup.tEn.setText(this.mContext.getString(R.l.dgT));
        paramViewGroup.lhI.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(1215073091584L, 9053);
            if (!PlatformComm.C2Java.isNetworkConnected())
            {
              w.w("MicroMsg.MailPhoneMenuHelper", "hy: no network. abort download");
              u.makeText(j.a.a(j.a.this), j.a.a(j.a.this).getString(R.l.dwI), 0).show();
              if (j.a.b(j.a.this) != null)
              {
                j.a.b(j.a.this).fw(false);
                GMTrace.o(1215073091584L, 9053);
              }
            }
            else
            {
              o.d(j.a.a(j.a.this), j.a.c(j.a.this));
              if (j.a.b(j.a.this) != null) {
                j.a.b(j.a.this).fw(true);
              }
            }
            GMTrace.o(1215073091584L, 9053);
          }
        });
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(1220978671616L, 9097);
      GMTrace.o(1220978671616L, 9097);
      return 2;
    }
    
    public static abstract interface a
    {
      public abstract void fw(boolean paramBoolean);
    }
    
    private final class b
    {
      TextView ikm;
      Button lhI;
      TextView tEn;
      
      public b()
      {
        GMTrace.i(1203933020160L, 8970);
        GMTrace.o(1203933020160L, 8970);
      }
    }
    
    private final class c
    {
      TextView ikm;
      
      public c()
      {
        GMTrace.i(1206483156992L, 8989);
        GMTrace.o(1206483156992L, 8989);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
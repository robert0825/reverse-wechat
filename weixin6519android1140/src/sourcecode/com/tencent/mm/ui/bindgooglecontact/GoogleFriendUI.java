package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.an.b;
import com.tencent.mm.modelfriend.o;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.ait;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleFriendUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, d.a, e, a.a
{
  private boolean Lv;
  private HashMap<String, o> gGk;
  private int ipN;
  private ProgressDialog kgz;
  private String mToken;
  private TextView maG;
  private String mvM;
  private boolean wlJ;
  private String wlL;
  private String wmd;
  private ListView wml;
  private a wmm;
  private com.tencent.mm.an.c wmn;
  private ArrayList<o> wmo;
  
  public GoogleFriendUI()
  {
    GMTrace.i(1663091867648L, 12391);
    this.wlJ = false;
    this.Lv = false;
    this.wmo = new ArrayList();
    this.gGk = new HashMap();
    GMTrace.o(1663091867648L, 12391);
  }
  
  private void a(Cursor paramCursor, final o paramo)
  {
    GMTrace.i(1664970915840L, 12405);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    final ArrayList localArrayList3 = new ArrayList();
    if (paramCursor != null)
    {
      paramCursor.moveToFirst();
      int j = paramCursor.getCount();
      int i = 0;
      while (i < j)
      {
        localObject = new o();
        ((o)localObject).b(paramCursor);
        localArrayList1.add(((o)localObject).field_googlegmail);
        localArrayList2.add(Integer.valueOf(i));
        localArrayList3.add(localObject);
        paramCursor.moveToNext();
        i += 1;
      }
      localArrayList2.add(Integer.valueOf(-1));
    }
    paramCursor = this.vKB.vKW;
    Object localObject = getResources().getString(R.l.dBf);
    getResources().getString(R.l.cSk);
    h.a(paramCursor, (String)localObject, localArrayList1, localArrayList2, new h.d()
    {
      public final void bT(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1677050511360L, 12495);
        if (paramAnonymousInt2 != -1) {
          GoogleFriendUI.a(GoogleFriendUI.this, (o)localArrayList3.get(paramAnonymousInt2), paramo);
        }
        GMTrace.o(1677050511360L, 12495);
      }
    });
    GMTrace.o(1664970915840L, 12405);
  }
  
  private void a(o paramo1, o paramo2)
  {
    GMTrace.i(1665105133568L, 12406);
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(paramo1.field_googlegmail);
    localObject = new b((ArrayList)localObject);
    w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramo1.field_googleitemid });
    at.wS().a((k)localObject, 0);
    if (paramo2 == null)
    {
      ((b)localObject).gGe = paramo1.field_googleitemid;
      paramo1.field_googlecgistatus = 0;
      com.tencent.mm.modelfriend.af.In().b(paramo1);
    }
    for (;;)
    {
      this.wmm.QF();
      GMTrace.o(1665105133568L, 12406);
      return;
      ((b)localObject).gGe = paramo2.field_googleitemid;
      paramo2.field_googlecgistatus = 0;
      com.tencent.mm.modelfriend.af.In().b(paramo2);
    }
  }
  
  private void a(alx paramalx)
  {
    try
    {
      GMTrace.i(1665373569024L, 12408);
      w.i("MicroMsg.GoogleContact.GoogleFriendUI", "handleListGoogleContactCGIResponse Count:%d", new Object[] { Integer.valueOf(paramalx.jhc) });
      if (this.wmm != null) {
        this.wmm.QF();
      }
      GMTrace.o(1665373569024L, 12408);
      return;
    }
    finally {}
  }
  
  private void abl()
  {
    GMTrace.i(1665776222208L, 12411);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(1665776222208L, 12411);
  }
  
  private void asd()
  {
    GMTrace.i(1665642004480L, 12410);
    if ((this.kgz == null) || (!this.kgz.isShowing()))
    {
      getString(R.l.cUG);
      this.kgz = h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1669534318592L, 12439);
          GoogleFriendUI.c(GoogleFriendUI.this);
          at.wS().c(GoogleFriendUI.d(GoogleFriendUI.this));
          GMTrace.o(1669534318592L, 12439);
        }
      });
    }
    GMTrace.o(1665642004480L, 12410);
  }
  
  private void cbh()
  {
    GMTrace.i(1664299827200L, 12400);
    w.d("MicroMsg.GoogleContact.GoogleFriendUI", "updateToken");
    if (this.wlJ)
    {
      at.AR();
      this.mToken = ((String)com.tencent.mm.y.c.xh().get(208901, null));
    }
    while ((TextUtils.isEmpty(this.mToken)) || ((!this.wlJ) && (TextUtils.isEmpty(this.wmd))))
    {
      z(BindGoogleContactUI.class);
      finish();
      GMTrace.o(1664299827200L, 12400);
      return;
      at.AR();
      this.mToken = ((String)com.tencent.mm.y.c.xh().get(208902, null));
      at.AR();
      this.wmd = ((String)com.tencent.mm.y.c.xh().get(208904, null));
    }
    if (this.wlJ)
    {
      cbi();
      GMTrace.o(1664299827200L, 12400);
      return;
    }
    asd();
    new c(this.wmd).execute(new Void[0]);
    GMTrace.o(1664299827200L, 12400);
  }
  
  private void cbi()
  {
    GMTrace.i(1665239351296L, 12407);
    this.Lv = false;
    asd();
    new b(this, this.mToken, (byte)0).execute(new Void[0]);
    GMTrace.o(1665239351296L, 12407);
  }
  
  private void lR(boolean paramBoolean)
  {
    GMTrace.i(1665507786752L, 12409);
    this.maG.setVisibility(0);
    String str;
    if (!am.isConnected(this)) {
      str = getString(R.l.dBe);
    }
    for (;;)
    {
      this.maG.setText(str);
      GMTrace.o(1665507786752L, 12409);
      return;
      if (paramBoolean) {
        str = getString(R.l.dAX);
      } else {
        str = getString(R.l.dAW);
      }
    }
  }
  
  public final void Cx(int paramInt)
  {
    GMTrace.i(1664434044928L, 12401);
    if (this.wmm == null)
    {
      GMTrace.o(1664434044928L, 12401);
      return;
    }
    o localo = (o)this.wmm.getItem(paramInt);
    if (localo == null)
    {
      GMTrace.o(1664434044928L, 12401);
      return;
    }
    switch (localo.field_status)
    {
    }
    label248:
    for (;;)
    {
      GMTrace.o(1664434044928L, 12401);
      return;
      Object localObject1 = new com.tencent.mm.pluginsdk.ui.applet.a(this, new com.tencent.mm.pluginsdk.ui.applet.a.a()
      {
        public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
        {
          GMTrace.i(1681613914112L, 12529);
          w.d("MicroMsg.GoogleContact.GoogleFriendUI", "MicroMsg.AddContact ok:%b hasSentVerify:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean1), Boolean.valueOf(paramAnonymousBoolean2) });
          if ((paramAnonymousBoolean1) || (paramAnonymousBoolean2))
          {
            w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramAnonymousString2 });
            com.tencent.mm.modelfriend.af.In().C(paramAnonymousString2, 1);
          }
          for (;;)
          {
            GoogleFriendUI.a(GoogleFriendUI.this).QF();
            GMTrace.o(1681613914112L, 12529);
            return;
            com.tencent.mm.modelfriend.af.In().C(paramAnonymousString2, 2);
          }
        }
      });
      Object localObject2 = localo.field_googleitemid;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).twu = false;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).twt = true;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).twv = ((String)localObject2);
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).twu = false;
      localObject2 = new LinkedList();
      ((LinkedList)localObject2).add(Integer.valueOf(58));
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).b(localo.field_username, (LinkedList)localObject2, true);
      localo.field_googlecgistatus = 0;
      com.tencent.mm.modelfriend.af.In().b(localo);
      this.wmm.QF();
      GMTrace.o(1664434044928L, 12401);
      return;
      localObject1 = localo.field_googleid;
      localObject1 = com.tencent.mm.modelfriend.af.In().jS((String)localObject1);
      if ((localObject1 == null) || (((Cursor)localObject1).getCount() <= 1)) {
        a(localo, null);
      }
      for (;;)
      {
        if (localObject1 == null) {
          break label248;
        }
        ((Cursor)localObject1).close();
        break;
        a((Cursor)localObject1, localo);
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1663897174016L, 12397);
    oM(R.l.dAY);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1678795341824L, 12508);
        GoogleFriendUI.this.finish();
        GMTrace.o(1678795341824L, 12508);
        return true;
      }
    });
    this.maG = ((TextView)findViewById(R.h.empty));
    this.wml = ((ListView)findViewById(R.h.bFh));
    this.wml.setAdapter(this.wmm);
    this.wml.setOnItemClickListener(this);
    com.tencent.mm.ui.tools.p localp = new com.tencent.mm.ui.tools.p(true, true);
    localp.xiS = new p.b()
    {
      public final void QA()
      {
        GMTrace.i(1679869083648L, 12516);
        GMTrace.o(1679869083648L, 12516);
      }
      
      public final void QB()
      {
        GMTrace.i(16862981128192L, 125639);
        GMTrace.o(16862981128192L, 125639);
      }
      
      public final void Qy()
      {
        GMTrace.i(1679600648192L, 12514);
        GMTrace.o(1679600648192L, 12514);
      }
      
      public final void Qz()
      {
        GMTrace.i(1679734865920L, 12515);
        GMTrace.o(1679734865920L, 12515);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(1679332212736L, 12512);
        GMTrace.o(1679332212736L, 12512);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(1679466430464L, 12513);
        GoogleFriendUI.a(GoogleFriendUI.this, bg.nk(paramAnonymousString));
        if (GoogleFriendUI.a(GoogleFriendUI.this) != null) {
          GoogleFriendUI.a(GoogleFriendUI.this).Au(GoogleFriendUI.b(GoogleFriendUI.this));
        }
        GMTrace.o(1679466430464L, 12513);
      }
    };
    a(localp);
    GMTrace.o(1663897174016L, 12397);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1664568262656L, 12402);
    String str;
    int i;
    if (TextUtils.isEmpty(paramString))
    {
      str = "";
      w.i("MicroMsg.GoogleContact.GoogleFriendUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      i = paramk.getType();
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label282;
      }
      switch (i)
      {
      default: 
        w.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
      }
    }
    for (;;)
    {
      abl();
      GMTrace.o(1664568262656L, 12402);
      return;
      str = paramString;
      break;
      if (this.wmm != null)
      {
        paramString = (b)paramk;
        w.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", new Object[] { Integer.valueOf(paramString.IB().jhc) });
        paramString = paramString.gGe;
        w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
        com.tencent.mm.modelfriend.af.In().C(paramString, 1);
        this.wmm.QF();
        continue;
        if (this.wmm != null)
        {
          paramString = ((com.tencent.mm.pluginsdk.model.n)paramk).gGe;
          w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
          com.tencent.mm.modelfriend.af.In().C(paramString, 1);
          this.wmm.QF();
          continue;
          a(((com.tencent.mm.an.c)paramk).IC());
          continue;
          switch (i)
          {
          default: 
            w.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
            break;
          case 489: 
            if (this.wmm != null)
            {
              paramString = (b)paramk;
              w.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", new Object[] { Integer.valueOf(paramString.IB().jhc) });
              paramString = paramString.gGe;
              w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
              com.tencent.mm.modelfriend.af.In().C(paramString, 1);
              this.wmm.QF();
            }
            break;
          case 30: 
          case 137: 
            if (paramInt2 == -87) {
              h.b(this, getString(R.l.diR), "", true);
            }
            while (this.wmm != null)
            {
              paramString = ((com.tencent.mm.pluginsdk.model.n)paramk).gGe;
              w.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
              com.tencent.mm.modelfriend.af.In().C(paramString, 2);
              this.wmm.QF();
              break;
              if (((paramInt2 == -24) || (paramInt2 == -101)) && (!bg.nm(paramString))) {
                Toast.makeText(this, paramString, 1).show();
              }
            }
          case 488: 
            label282:
            lR(false);
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1663226085376L, 12392);
    int i = R.i.czA;
    GMTrace.o(1663226085376L, 12392);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(1664702480384L, 12403);
    if (this.wmm != null) {
      this.wmm.notifyDataSetChanged();
    }
    GMTrace.o(1664702480384L, 12403);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1664165609472L, 12399);
    w.i("MicroMsg.GoogleContact.GoogleFriendUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 2005)
    {
      if (paramInt2 == -1)
      {
        this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
        cbh();
        GMTrace.o(1664165609472L, 12399);
        return;
      }
      this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
      finish();
    }
    GMTrace.o(1664165609472L, 12399);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(1664836698112L, 12404);
    super.onBackPressed();
    GMTrace.o(1664836698112L, 12404);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1663360303104L, 12393);
    super.onCreate(paramBundle);
    at.AR();
    this.wlL = ((String)com.tencent.mm.y.c.xh().get(208903, null));
    if (TextUtils.isEmpty(this.wlL)) {
      finish();
    }
    this.ipN = getIntent().getIntExtra("enter_scene", 0);
    this.wmm = new a(this, this.wlL);
    this.wmm.wme = this;
    MP();
    this.wlJ = com.tencent.mm.modelfriend.n.bd(this);
    if (this.wlJ)
    {
      w.d("MicroMsg.GoogleContact.GoogleFriendUI", "startActivityCheckGooglePlayServices");
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    }
    for (;;)
    {
      com.tencent.mm.modelfriend.af.In().clear();
      GMTrace.o(1663360303104L, 12393);
      return;
      cbh();
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1663762956288L, 12396);
    super.onDestroy();
    com.tencent.mm.modelfriend.af.In().clear();
    GMTrace.o(1663762956288L, 12396);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(1664031391744L, 12398);
    w.d("MicroMsg.GoogleContact.GoogleFriendUI", "onItemClick position:%d,", new Object[] { Integer.valueOf(paramInt) });
    if (this.wmm != null)
    {
      int i = this.wml.getHeaderViewsCount();
      paramAdapterView = (o)this.wmm.getItem(paramInt - i);
      if (paramAdapterView != null)
      {
        paramView = paramAdapterView.field_username;
        w.d("MicroMsg.GoogleContact.GoogleFriendUI", "jumpToProfile email:%s, username:%s", new Object[] { paramAdapterView.field_googlegmail, paramView });
        at.AR();
        Object localObject = com.tencent.mm.y.c.yK().TE(paramView);
        if (((localObject != null) && (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))) || (!TextUtils.isEmpty(paramAdapterView.field_nickname)))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Contact_User", paramView);
          ((Intent)localObject).putExtra("Contact_Nick", paramAdapterView.field_nickname);
          ((Intent)localObject).putExtra("Contact_ShowFMessageList", true);
          ((Intent)localObject).putExtra("verify_gmail", paramAdapterView.field_googlegmail);
          ((Intent)localObject).putExtra("profileName", paramAdapterView.field_googlename);
          ((Intent)localObject).putExtra("Contact_Source_FMessage", 58);
          ((Intent)localObject).putExtra("Contact_Scene", 58);
          if ((paramView != null) && (paramView.length() > 0)) {
            com.tencent.mm.plugin.c.a.hnH.d((Intent)localObject, this.vKB.vKW);
          }
          GMTrace.o(1664031391744L, 12398);
          return;
        }
        localObject = new Intent(this, InviteFriendUI.class);
        ((Intent)localObject).putExtra("friend_type", 2);
        ((Intent)localObject).putExtra("friend_user_name", paramView);
        ((Intent)localObject).putExtra("friend_num", paramAdapterView.field_googlegmail);
        ((Intent)localObject).putExtra("friend_nick", paramAdapterView.field_googlename);
        ((Intent)localObject).putExtra("friend_weixin_nick", paramAdapterView.field_nickname);
        ((Intent)localObject).putExtra("friend_googleID", paramAdapterView.field_googleid);
        ((Intent)localObject).putExtra("friend_googleItemID", paramAdapterView.field_googleitemid);
        ((Intent)localObject).putExtra("friend_scene", 58);
        ((Intent)localObject).putExtra("Contact_Scene", 58);
        startActivity((Intent)localObject);
      }
    }
    GMTrace.o(1664031391744L, 12398);
  }
  
  protected void onResume()
  {
    GMTrace.i(1663494520832L, 12394);
    super.onResume();
    at.wS().a(488, this);
    at.wS().a(489, this);
    com.tencent.mm.ac.n.Dh().d(this);
    if (this.wmm != null) {
      this.wmm.QF();
    }
    GMTrace.o(1663494520832L, 12394);
  }
  
  protected void onStop()
  {
    GMTrace.i(1663628738560L, 12395);
    super.onStop();
    at.wS().b(488, this);
    at.wS().b(489, this);
    com.tencent.mm.ac.n.Dh().e(this);
    GMTrace.o(1663628738560L, 12395);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1682419220480L, 12535);
      wms = new a("SUCCESS", 0);
      wmt = new a("NO_CONTACT", 1);
      wmu = new a("ACCESS_DEDY", 2);
      wmv = new a("OTHER", 3);
      wmw = new a[] { wms, wmt, wmu, wmv };
      GMTrace.o(1682419220480L, 12535);
    }
    
    private a()
    {
      GMTrace.i(1682285002752L, 12534);
      GMTrace.o(1682285002752L, 12534);
    }
  }
  
  final class b
    extends AsyncTask<Void, Void, Void>
  {
    private Context mContext;
    private String mToken;
    private GoogleFriendUI.a wmx;
    
    private b(Context paramContext, String paramString)
    {
      GMTrace.i(1668326359040L, 12430);
      this.wmx = GoogleFriendUI.a.wmv;
      this.mContext = paramContext;
      this.mToken = paramString;
      GMTrace.o(1668326359040L, 12430);
    }
    
    private void VM(String paramString)
    {
      GMTrace.i(1668863229952L, 12434);
      JSONArray localJSONArray1 = new JSONObject(paramString).getJSONObject("feed").getJSONArray("entry");
      int i;
      Object localObject2;
      JSONArray localJSONArray2;
      Object localObject3;
      int j;
      if (localJSONArray1 != null)
      {
        i = 0;
        if (i < localJSONArray1.length())
        {
          paramString = "";
          localObject1 = localJSONArray1.getJSONObject(i).optJSONObject("id");
          localObject2 = localJSONArray1.getJSONObject(i).optJSONObject("title");
          localJSONArray2 = localJSONArray1.getJSONObject(i).optJSONArray("gd$email");
          localObject3 = localJSONArray1.getJSONObject(i).optJSONArray("link");
          if (localObject1 == null) {
            break label448;
          }
          localObject1 = ((JSONObject)localObject1).getString("$t");
          j = ((String)localObject1).lastIndexOf("/");
          if (j <= 0) {
            break label448;
          }
        }
      }
      label448:
      for (Object localObject1 = ((String)localObject1).substring(j + 1);; localObject1 = "")
      {
        if (localObject2 != null) {}
        for (localObject2 = ((JSONObject)localObject2).getString("$t");; localObject2 = "")
        {
          String str1 = paramString;
          if (localObject3 != null)
          {
            j = 0;
            for (;;)
            {
              str1 = paramString;
              if (j >= ((JSONArray)localObject3).length()) {
                break;
              }
              String str2 = ((JSONArray)localObject3).getJSONObject(j).getString("rel");
              int k = str2.lastIndexOf("#");
              str1 = paramString;
              if (k > 0)
              {
                str2 = str2.substring(k + 1);
                str1 = paramString;
                if (!TextUtils.isEmpty(str2))
                {
                  str1 = paramString;
                  if ("photo".equals(str2)) {
                    str1 = ((JSONArray)localObject3).getJSONObject(j).getString("href");
                  }
                }
              }
              j += 1;
              paramString = str1;
            }
          }
          if (localJSONArray2 != null)
          {
            j = 0;
            while (j < localJSONArray2.length())
            {
              paramString = localJSONArray2.getJSONObject(j).getString("address");
              if ((!TextUtils.isEmpty(paramString)) && (bg.Sj(paramString)) && (!paramString.equals(GoogleFriendUI.h(GoogleFriendUI.this))))
              {
                localObject3 = new o();
                ((o)localObject3).field_googleid = ((String)localObject1);
                ((o)localObject3).field_googleitemid = ((String)localObject1 + paramString);
                ((o)localObject3).field_googlename = ((String)localObject2);
                ((o)localObject3).field_googlephotourl = str1;
                ((o)localObject3).field_googlegmail = paramString;
                if (!GoogleFriendUI.f(GoogleFriendUI.this).containsKey(paramString))
                {
                  GoogleFriendUI.e(GoogleFriendUI.this).add(localObject3);
                  GoogleFriendUI.f(GoogleFriendUI.this).put(paramString, localObject3);
                }
              }
              j += 1;
            }
          }
          i += 1;
          break;
          GMTrace.o(1668863229952L, 12434);
          return;
        }
      }
    }
    
    private Void aHf()
    {
      GMTrace.i(1668594794496L, 12432);
      w.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "doInBackground");
      int j = 0;
      int i = 1;
      for (;;)
      {
        int k;
        try
        {
          w.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "startInde:%d, totalCount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          localObject = this.mToken;
          localObject = new URL("https://www.google.com/m8/feeds/contacts/default/property-email?alt=" + "json" + "&max-results=100&start-index=" + i + "&access_token=" + (String)localObject);
          w.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "requestURL:%s", new Object[] { ((URL)localObject).toString() });
          localObject = (HttpURLConnection)((URL)localObject).openConnection();
          ((HttpURLConnection)localObject).setRequestMethod("GET");
          ((HttpURLConnection)localObject).setConnectTimeout(20000);
          j = ((HttpURLConnection)localObject).getResponseCode();
          w.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "responseCode:%d", new Object[] { Integer.valueOf(j) });
          if (j != 200) {
            continue;
          }
          InputStream localInputStream = ((HttpURLConnection)localObject).getInputStream();
          localObject = o(localInputStream);
          localInputStream.close();
          k = new JSONObject((String)localObject).getJSONObject("feed").getJSONObject("openSearch$totalResults").getInt("$t");
          if (k <= 0) {
            break label385;
          }
          VM((String)localObject);
        }
        catch (IOException localIOException)
        {
          Object localObject;
          this.wmx = GoogleFriendUI.a.wmu;
          w.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "IOException" + localIOException.getMessage());
          continue;
          j = 0;
          continue;
        }
        catch (JSONException localJSONException)
        {
          this.wmx = GoogleFriendUI.a.wmv;
          w.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "JSONException" + localJSONException.getMessage());
          continue;
          j = k;
        }
        if ((j == 0) || (GoogleFriendUI.g(GoogleFriendUI.this)))
        {
          this.wmx = GoogleFriendUI.a.wms;
          GMTrace.o(1668594794496L, 12432);
          return null;
          if (j == 401)
          {
            w.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Server OAuth Error,Please Try Again.");
            ((HttpURLConnection)localObject).disconnect();
            localObject = null;
          }
          else
          {
            w.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Unknow Error.");
          }
        }
        else
        {
          continue;
          label385:
          if (k - i > 100)
          {
            i += 100;
            j = 1;
          }
        }
      }
    }
    
    private static String o(InputStream paramInputStream)
    {
      GMTrace.i(1668729012224L, 12433);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte['倀'];
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 20480);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      paramInputStream = new String(localByteArrayOutputStream.toByteArray(), "UTF-8");
      GMTrace.o(1668729012224L, 12433);
      return paramInputStream;
    }
    
    protected final void onPreExecute()
    {
      GMTrace.i(1668460576768L, 12431);
      super.onPreExecute();
      w.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPreExecute");
      GoogleFriendUI.e(GoogleFriendUI.this).clear();
      GoogleFriendUI.f(GoogleFriendUI.this).clear();
      GMTrace.o(1668460576768L, 12431);
    }
  }
  
  final class c
    extends AsyncTask<Void, Void, Void>
  {
    private String wlZ;
    private boolean wmb;
    private String wmd;
    
    public c(String paramString)
    {
      GMTrace.i(1667655270400L, 12425);
      this.wmd = paramString;
      GMTrace.o(1667655270400L, 12425);
    }
    
    /* Error */
    private Void aHf()
    {
      // Byte code:
      //   0: ldc2_w 47
      //   3: sipush 12427
      //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: ldc 50
      //   11: ldc 52
      //   13: invokestatic 57	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   16: ldc 59
      //   18: astore_2
      //   19: new 61	java/net/URL
      //   22: dup
      //   23: ldc 63
      //   25: invokespecial 66	java/net/URL:<init>	(Ljava/lang/String;)V
      //   28: invokevirtual 70	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   31: checkcast 72	java/net/HttpURLConnection
      //   34: astore_3
      //   35: aload_3
      //   36: ldc 74
      //   38: ldc 76
      //   40: invokevirtual 79	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   43: aload_3
      //   44: ldc 81
      //   46: ldc 83
      //   48: invokevirtual 79	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   51: aload_3
      //   52: ldc 85
      //   54: invokevirtual 88	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   57: aload_3
      //   58: sipush 20000
      //   61: invokevirtual 92	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   64: aload_3
      //   65: sipush 20000
      //   68: invokevirtual 95	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   71: aload_3
      //   72: iconst_1
      //   73: invokevirtual 99	java/net/HttpURLConnection:setDoInput	(Z)V
      //   76: aload_3
      //   77: iconst_1
      //   78: invokevirtual 102	java/net/HttpURLConnection:setDoOutput	(Z)V
      //   81: new 104	java/util/ArrayList
      //   84: dup
      //   85: invokespecial 105	java/util/ArrayList:<init>	()V
      //   88: astore 4
      //   90: aload 4
      //   92: new 107	org/apache/http/message/BasicNameValuePair
      //   95: dup
      //   96: ldc 109
      //   98: aload_0
      //   99: getfield 32	com/tencent/mm/ui/bindgooglecontact/GoogleFriendUI$c:wmd	Ljava/lang/String;
      //   102: invokespecial 111	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   105: invokeinterface 117 2 0
      //   110: pop
      //   111: aload 4
      //   113: new 107	org/apache/http/message/BasicNameValuePair
      //   116: dup
      //   117: ldc 119
      //   119: ldc 121
      //   121: invokespecial 111	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   124: invokeinterface 117 2 0
      //   129: pop
      //   130: aload 4
      //   132: new 107	org/apache/http/message/BasicNameValuePair
      //   135: dup
      //   136: ldc 123
      //   138: ldc 125
      //   140: invokespecial 111	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   143: invokeinterface 117 2 0
      //   148: pop
      //   149: aload 4
      //   151: new 107	org/apache/http/message/BasicNameValuePair
      //   154: dup
      //   155: ldc 127
      //   157: ldc 109
      //   159: invokespecial 111	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   162: invokeinterface 117 2 0
      //   167: pop
      //   168: aload 4
      //   170: invokestatic 133	com/tencent/mm/modelfriend/n:G	(Ljava/util/List;)Ljava/lang/String;
      //   173: astore 4
      //   175: ldc 50
      //   177: new 135	java/lang/StringBuilder
      //   180: dup
      //   181: ldc -119
      //   183: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   186: aload 4
      //   188: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   191: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   194: invokestatic 57	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   197: new 148	java/io/BufferedWriter
      //   200: dup
      //   201: new 150	java/io/OutputStreamWriter
      //   204: dup
      //   205: aload_3
      //   206: invokevirtual 154	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
      //   209: ldc 76
      //   211: invokespecial 157	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
      //   214: invokespecial 160	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
      //   217: astore 5
      //   219: aload 5
      //   221: aload 4
      //   223: invokevirtual 163	java/io/BufferedWriter:write	(Ljava/lang/String;)V
      //   226: aload 5
      //   228: invokevirtual 166	java/io/BufferedWriter:flush	()V
      //   231: aload 5
      //   233: invokevirtual 169	java/io/BufferedWriter:close	()V
      //   236: aload_3
      //   237: invokevirtual 173	java/net/HttpURLConnection:getResponseCode	()I
      //   240: istore_1
      //   241: ldc 50
      //   243: new 135	java/lang/StringBuilder
      //   246: dup
      //   247: ldc -81
      //   249: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   252: iload_1
      //   253: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   256: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   259: invokestatic 181	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   262: sipush 200
      //   265: iload_1
      //   266: if_icmpne +116 -> 382
      //   269: new 183	java/lang/StringBuffer
      //   272: dup
      //   273: invokespecial 184	java/lang/StringBuffer:<init>	()V
      //   276: astore_2
      //   277: new 186	java/io/BufferedReader
      //   280: dup
      //   281: new 188	java/io/InputStreamReader
      //   284: dup
      //   285: aload_3
      //   286: invokevirtual 192	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   289: ldc 76
      //   291: invokespecial 195	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
      //   294: invokespecial 198	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   297: astore 4
      //   299: aload 4
      //   301: invokevirtual 201	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   304: astore 5
      //   306: aload 5
      //   308: ifnull +43 -> 351
      //   311: aload_2
      //   312: aload 5
      //   314: invokevirtual 204	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   317: pop
      //   318: goto -19 -> 299
      //   321: astore_2
      //   322: ldc 50
      //   324: ldc -50
      //   326: iconst_1
      //   327: anewarray 208	java/lang/Object
      //   330: dup
      //   331: iconst_0
      //   332: aload_2
      //   333: invokevirtual 211	java/net/ProtocolException:getMessage	()Ljava/lang/String;
      //   336: aastore
      //   337: invokestatic 214	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   340: ldc2_w 47
      //   343: sipush 12427
      //   346: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   349: aconst_null
      //   350: areturn
      //   351: aload 4
      //   353: invokevirtual 215	java/io/BufferedReader:close	()V
      //   356: aload_2
      //   357: invokevirtual 216	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   360: astore_2
      //   361: ldc 50
      //   363: new 135	java/lang/StringBuilder
      //   366: dup
      //   367: ldc -38
      //   369: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   372: aload_2
      //   373: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   376: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   379: invokestatic 57	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   382: aload_3
      //   383: invokevirtual 221	java/net/HttpURLConnection:disconnect	()V
      //   386: ldc 50
      //   388: ldc -33
      //   390: iconst_1
      //   391: anewarray 208	java/lang/Object
      //   394: dup
      //   395: iconst_0
      //   396: aload_2
      //   397: aastore
      //   398: invokestatic 225	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   401: aload_0
      //   402: new 227	org/json/JSONObject
      //   405: dup
      //   406: aload_2
      //   407: invokespecial 228	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   410: ldc -26
      //   412: invokevirtual 234	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   415: putfield 236	com/tencent/mm/ui/bindgooglecontact/GoogleFriendUI$c:wlZ	Ljava/lang/String;
      //   418: aload_0
      //   419: iconst_1
      //   420: putfield 238	com/tencent/mm/ui/bindgooglecontact/GoogleFriendUI$c:wmb	Z
      //   423: goto -83 -> 340
      //   426: astore_2
      //   427: ldc 50
      //   429: ldc -16
      //   431: iconst_1
      //   432: anewarray 208	java/lang/Object
      //   435: dup
      //   436: iconst_0
      //   437: aload_2
      //   438: invokevirtual 241	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
      //   441: aastore
      //   442: invokestatic 214	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   445: goto -105 -> 340
      //   448: astore_2
      //   449: ldc 50
      //   451: ldc -13
      //   453: iconst_1
      //   454: anewarray 208	java/lang/Object
      //   457: dup
      //   458: iconst_0
      //   459: aload_2
      //   460: invokevirtual 244	java/io/IOException:getMessage	()Ljava/lang/String;
      //   463: aastore
      //   464: invokestatic 214	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   467: goto -127 -> 340
      //   470: astore_2
      //   471: ldc 50
      //   473: ldc -10
      //   475: iconst_1
      //   476: anewarray 208	java/lang/Object
      //   479: dup
      //   480: iconst_0
      //   481: aload_2
      //   482: invokevirtual 247	org/json/JSONException:getMessage	()Ljava/lang/String;
      //   485: aastore
      //   486: invokestatic 214	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   489: goto -149 -> 340
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	492	0	this	c
      //   240	27	1	i	int
      //   18	294	2	localObject1	Object
      //   321	36	2	localProtocolException	java.net.ProtocolException
      //   360	47	2	str	String
      //   426	12	2	localMalformedURLException	java.net.MalformedURLException
      //   448	12	2	localIOException	IOException
      //   470	12	2	localJSONException	JSONException
      //   34	349	3	localHttpURLConnection	HttpURLConnection
      //   88	264	4	localObject2	Object
      //   217	96	5	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   19	262	321	java/net/ProtocolException
      //   269	299	321	java/net/ProtocolException
      //   299	306	321	java/net/ProtocolException
      //   311	318	321	java/net/ProtocolException
      //   351	382	321	java/net/ProtocolException
      //   382	423	321	java/net/ProtocolException
      //   19	262	426	java/net/MalformedURLException
      //   269	299	426	java/net/MalformedURLException
      //   299	306	426	java/net/MalformedURLException
      //   311	318	426	java/net/MalformedURLException
      //   351	382	426	java/net/MalformedURLException
      //   382	423	426	java/net/MalformedURLException
      //   19	262	448	java/io/IOException
      //   269	299	448	java/io/IOException
      //   299	306	448	java/io/IOException
      //   311	318	448	java/io/IOException
      //   351	382	448	java/io/IOException
      //   382	423	448	java/io/IOException
      //   19	262	470	org/json/JSONException
      //   269	299	470	org/json/JSONException
      //   299	306	470	org/json/JSONException
      //   311	318	470	org/json/JSONException
      //   351	382	470	org/json/JSONException
      //   382	423	470	org/json/JSONException
    }
    
    protected final void onPreExecute()
    {
      GMTrace.i(1667789488128L, 12426);
      super.onPreExecute();
      w.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPreExecute");
      this.wmb = false;
      GMTrace.o(1667789488128L, 12426);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\bindgooglecontact\GoogleFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
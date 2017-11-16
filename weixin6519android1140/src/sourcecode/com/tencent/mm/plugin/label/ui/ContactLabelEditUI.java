package com.tencent.mm.plugin.label.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.pluginsdk.ui.applet.i.b;
import com.tencent.mm.protocal.c.aky;
import com.tencent.mm.protocal.c.bm;
import com.tencent.mm.protocal.c.bmt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactLabelEditUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private ProgressDialog kgz;
  private ae mHandler;
  private boolean moF;
  private String muS;
  private String muT;
  private String muU;
  private z muV;
  private String muW;
  private f muX;
  private ContactListExpandPreference muY;
  private InputClearablePreference muZ;
  private Preference mva;
  private PreferenceTitleCategory mvb;
  private boolean mvc;
  private ArrayList<String> mvd;
  private ArrayList<String> mve;
  private HashSet<String> mvf;
  private HashSet<String> mvg;
  private String mvh;
  
  public ContactLabelEditUI()
  {
    GMTrace.i(7304128757760L, 54420);
    this.mvc = true;
    this.moF = true;
    this.mvd = new ArrayList();
    this.mve = new ArrayList();
    this.mvf = new HashSet();
    this.mvg = new HashSet();
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7284667187200L, 54275);
        int i = paramAnonymousMessage.what;
        switch (i)
        {
        default: 
          w.w("MicroMsg.Label.ContactLabelEditUI", "unknow message. what is:%d", new Object[] { Integer.valueOf(i) });
          GMTrace.o(7284667187200L, 54275);
          return;
        case 6001: 
          ContactLabelEditUI.a(ContactLabelEditUI.this);
          GMTrace.o(7284667187200L, 54275);
          return;
        }
        com.tencent.mm.plugin.label.a.hnI.pr();
        GMTrace.o(7284667187200L, 54275);
      }
    };
    GMTrace.o(7304128757760L, 54420);
  }
  
  private void AZ(String paramString)
  {
    GMTrace.i(7306276241408L, 54436);
    getString(R.l.cUG);
    this.kgz = h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(7295001952256L, 54352);
        at.wS().cancel(635);
        at.wS().cancel(637);
        GMTrace.o(7295001952256L, 54352);
      }
    });
    GMTrace.o(7306276241408L, 54436);
  }
  
  private void Ba(String paramString)
  {
    GMTrace.i(7305605152768L, 54431);
    if (bg.nm(paramString)) {}
    for (boolean bool = false;; bool = true)
    {
      lf(bool);
      GMTrace.o(7305605152768L, 54431);
      return;
    }
  }
  
  private static boolean Bb(String paramString)
  {
    GMTrace.i(7306007805952L, 54434);
    if (!bg.nm(com.tencent.mm.plugin.label.e.aJO().AV(paramString)))
    {
      GMTrace.o(7306007805952L, 54434);
      return true;
    }
    GMTrace.o(7306007805952L, 54434);
    return false;
  }
  
  private void a(z paramz)
  {
    GMTrace.i(7306813112320L, 54440);
    if (!com.tencent.mm.plugin.label.e.aJO().a(true, paramz, new String[] { "labelID" }))
    {
      w.w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
      aJW();
      GMTrace.o(7306813112320L, 54440);
      return;
    }
    setResult(-1);
    finish();
    GMTrace.o(7306813112320L, 54440);
  }
  
  private void aJR()
  {
    GMTrace.i(7306410459136L, 54437);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(7306410459136L, 54437);
  }
  
  private void aJS()
  {
    GMTrace.i(7305470935040L, 54430);
    if (this.muY != null)
    {
      this.muY.m(null, this.mvd);
      if ((this.mvd == null) || (this.mvd.size() <= 0)) {
        this.muY.bLL();
      }
    }
    if (this.muZ != null) {
      this.muZ.setText(this.muT);
    }
    GMTrace.o(7305470935040L, 54430);
  }
  
  private void aJT()
  {
    GMTrace.i(7305739370496L, 54432);
    w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[savaSuccess]");
    aJR();
    if (this.mvf != null) {}
    for (int i = this.mvf.size();; i = 0)
    {
      w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList]addnum:%d", new Object[] { Integer.valueOf(i) });
      g.ork.i(11220, new Object[] { q.zE(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i) });
      if (this.mvc)
      {
        Intent localIntent = getIntent();
        localIntent.putExtra("k_sns_label_add_label", this.muT);
        setResult(0, localIntent);
      }
      for (;;)
      {
        finish();
        GMTrace.o(7305739370496L, 54432);
        return;
        setResult(0);
      }
    }
  }
  
  private void aJU()
  {
    GMTrace.i(7305873588224L, 54433);
    w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
    aJR();
    wr(getString(R.l.cQq));
    GMTrace.o(7305873588224L, 54433);
  }
  
  private void aJV()
  {
    GMTrace.i(7306142023680L, 54435);
    int i;
    if (this.mvf == null)
    {
      i = 0;
      if (this.mvg != null) {
        break label230;
      }
    }
    Object localObject1;
    Iterator localIterator;
    Object localObject2;
    Object localObject3;
    String str;
    label230:
    for (int j = 0;; j = this.mvg.size())
    {
      w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      localObject1 = new LinkedList();
      if ((this.mvf == null) || (this.mvf.size() <= 0)) {
        break label241;
      }
      this.mvf.size();
      localIterator = this.mvf.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        at.AR();
        localObject2 = com.tencent.mm.y.c.yK().TE((String)localObject2);
        localObject3 = ((com.tencent.mm.g.b.af)localObject2).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.cK((String)localObject3, this.muU);
        w.i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", new Object[] { localObject3, str });
        if (!str.equalsIgnoreCase((String)localObject3))
        {
          localObject3 = new bmt();
          ((bmt)localObject3).jhi = ((com.tencent.mm.g.b.af)localObject2).field_username;
          ((bmt)localObject3).ufB = str;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
      i = this.mvf.size();
      break;
    }
    label241:
    if ((this.mvg != null) && (this.mvg.size() > 0))
    {
      this.mvg.size();
      localIterator = this.mvg.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        at.AR();
        localObject3 = com.tencent.mm.y.c.yK().TE((String)localObject2).field_contactLabelIds;
        str = com.tencent.mm.plugin.label.c.cL((String)localObject3, this.muU);
        w.i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", new Object[] { localObject2, localObject3, str });
        if (!str.equalsIgnoreCase((String)localObject3))
        {
          localObject3 = new bmt();
          ((bmt)localObject3).jhi = ((String)localObject2);
          ((bmt)localObject3).ufB = str;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
    }
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = new com.tencent.mm.plugin.label.b.d((LinkedList)localObject1);
      at.wS().a((k)localObject1, 0);
      GMTrace.o(7306142023680L, 54435);
      return;
    }
    aJT();
    GMTrace.o(7306142023680L, 54435);
  }
  
  private void aJW()
  {
    GMTrace.i(7306947330048L, 54441);
    wr(getString(R.l.dmx));
    GMTrace.o(7306947330048L, 54441);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(7306544676864L, 54438);
    h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(7279969566720L, 54240);
        GMTrace.o(7279969566720L, 54240);
      }
    });
    GMTrace.o(7306544676864L, 54438);
  }
  
  protected final void MP()
  {
    GMTrace.i(7304934064128L, 54426);
    if (bg.nm(this.muU))
    {
      this.mvc = true;
      this.muW = getString(R.l.dOy);
      sq(this.muW);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7289364807680L, 54310);
          ContactLabelEditUI.this.onBackPressed();
          GMTrace.o(7289364807680L, 54310);
          return true;
        }
      });
      a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7309631684608L, 54461);
          ContactLabelEditUI.b(ContactLabelEditUI.this);
          GMTrace.o(7309631684608L, 54461);
          return true;
        }
      }, p.b.vLG);
      this.muX = this.wky;
      this.muY = ((ContactListExpandPreference)this.muX.VG("contact_label_contact_list"));
      this.muY.a(this.muX, this.muY.hiu);
      this.muY.kf(true);
      this.muY.kg(true);
      this.muY.bLK();
      this.muY.bLN();
      this.muY.a(new i.b()
      {
        public final boolean lZ(int paramAnonymousInt)
        {
          GMTrace.i(7301310185472L, 54399);
          GMTrace.o(7301310185472L, 54399);
          return false;
        }
      });
      this.muY.a(new ContactListExpandPreference.a()
      {
        public final void anE()
        {
          GMTrace.i(7280372219904L, 54243);
          if (ContactLabelEditUI.c(ContactLabelEditUI.this) != null) {
            ContactLabelEditUI.c(ContactLabelEditUI.this).bLL();
          }
          GMTrace.o(7280372219904L, 54243);
        }
        
        public final void ma(int paramAnonymousInt)
        {
          GMTrace.i(7280640655360L, 54245);
          String str = ContactLabelEditUI.c(ContactLabelEditUI.this).zk(paramAnonymousInt);
          w.d("MicroMsg.Label.ContactLabelEditUI", "cpan[onItemDelClick] position:%d userName:%s", new Object[] { Integer.valueOf(paramAnonymousInt), str });
          ContactLabelEditUI.a(ContactLabelEditUI.this, str);
          GMTrace.o(7280640655360L, 54245);
        }
        
        public final void mb(int paramAnonymousInt)
        {
          GMTrace.i(7280238002176L, 54242);
          if (ContactLabelEditUI.c(ContactLabelEditUI.this).zj(paramAnonymousInt))
          {
            String str1 = ContactLabelEditUI.c(ContactLabelEditUI.this).zk(paramAnonymousInt);
            String str2 = ContactLabelEditUI.c(ContactLabelEditUI.this).zl(paramAnonymousInt);
            if (bg.nm(str1))
            {
              GMTrace.o(7280238002176L, 54242);
              return;
            }
            Intent localIntent = new Intent();
            localIntent.putExtra("Contact_User", str1);
            localIntent.putExtra("Contact_RoomNickname", str2);
            com.tencent.mm.plugin.label.a.hnH.d(localIntent, ContactLabelEditUI.this);
          }
          GMTrace.o(7280238002176L, 54242);
        }
        
        public final void mc(int paramAnonymousInt)
        {
          GMTrace.i(7280506437632L, 54244);
          ContactLabelEditUI.d(ContactLabelEditUI.this);
          GMTrace.o(7280506437632L, 54244);
        }
      });
      this.muZ = ((InputClearablePreference)this.muX.VG("contact_label_name"));
      InputClearablePreference localInputClearablePreference = this.muZ;
      localInputClearablePreference.mwr = getString(R.l.dGc);
      if (localInputClearablePreference.mww != null) {
        localInputClearablePreference.mww.setHint(localInputClearablePreference.mwr);
      }
      this.muZ.hZP = getString(R.l.dGg);
      localInputClearablePreference = this.muZ;
      localInputClearablePreference.mws = getString(R.l.cQr);
      if (localInputClearablePreference.mwy != null) {
        localInputClearablePreference.mwy.setText(localInputClearablePreference.mws);
      }
      this.muZ.mwt = 36;
      this.muZ.mwv = this.mvc;
      this.muZ.mwA = new InputClearablePreference.a()
      {
        public final void Bc(String paramAnonymousString)
        {
          GMTrace.i(7288156848128L, 54301);
          ContactLabelEditUI.b(ContactLabelEditUI.this, paramAnonymousString);
          ContactLabelEditUI.c(ContactLabelEditUI.this, paramAnonymousString);
          ContactLabelEditUI.e(ContactLabelEditUI.this).fB(false);
          GMTrace.o(7288156848128L, 54301);
        }
        
        public final void fz(boolean paramAnonymousBoolean)
        {
          GMTrace.i(7288291065856L, 54302);
          if ((!ContactLabelEditUI.f(ContactLabelEditUI.this)) && (ContactLabelEditUI.g(ContactLabelEditUI.this)))
          {
            ContactLabelEditUI.this.lf(false);
            ContactLabelEditUI.h(ContactLabelEditUI.this);
            GMTrace.o(7288291065856L, 54302);
            return;
          }
          ContactLabelEditUI.this.lf(paramAnonymousBoolean);
          GMTrace.o(7288291065856L, 54302);
        }
      };
      this.muZ.setText(this.muT);
      if (this.mHandler != null) {
        this.mHandler.sendEmptyMessage(6001);
      }
      if (!this.mvc) {
        break label538;
      }
      if ((this.mvd == null) || (this.mvd.size() <= 0)) {
        break label521;
      }
      this.muY.m(null, this.mvd);
    }
    for (;;)
    {
      if (this.mqO != null) {
        this.mqO.setOnScrollListener(new AbsListView.OnScrollListener()
        {
          public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(7299162701824L, 54383);
            GMTrace.o(7299162701824L, 54383);
          }
          
          public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
          {
            GMTrace.i(7299028484096L, 54382);
            if ((paramAnonymousInt == 2) || (paramAnonymousInt == 1)) {
              ContactLabelEditUI.this.aLo();
            }
            GMTrace.o(7299028484096L, 54382);
          }
        });
      }
      this.mva = this.muX.VG("contact_label_delete");
      this.mvb = ((PreferenceTitleCategory)this.muX.VG("contact_label_empty_category"));
      if (this.mvc)
      {
        this.muX.c(this.mva);
        this.muX.c(this.mvb);
      }
      GMTrace.o(7304934064128L, 54426);
      return;
      this.mvc = false;
      this.muV = com.tencent.mm.plugin.label.e.aJO().Tw(this.muU);
      this.muW = getString(R.l.dOx);
      break;
      label521:
      this.muY.ad(new ArrayList());
      continue;
      label538:
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7286143582208L, 54286);
          ArrayList localArrayList = com.tencent.mm.plugin.label.e.aJO().Tu(ContactLabelEditUI.i(ContactLabelEditUI.this));
          if (localArrayList == null)
          {
            w.w("MicroMsg.Label.ContactLabelEditUI", "result is null");
            GMTrace.o(7286143582208L, 54286);
            return;
          }
          if (localArrayList != null)
          {
            ContactLabelEditUI.a(ContactLabelEditUI.this, localArrayList);
            if (ContactLabelEditUI.j(ContactLabelEditUI.this) != null) {
              break label125;
            }
            ContactLabelEditUI.b(ContactLabelEditUI.this, new ArrayList());
          }
          for (;;)
          {
            ContactLabelEditUI.j(ContactLabelEditUI.this).addAll(localArrayList);
            if (ContactLabelEditUI.k(ContactLabelEditUI.this) != null) {
              ContactLabelEditUI.k(ContactLabelEditUI.this).sendEmptyMessage(6001);
            }
            GMTrace.o(7286143582208L, 54286);
            return;
            label125:
            ContactLabelEditUI.j(ContactLabelEditUI.this).clear();
          }
        }
        
        public final String toString()
        {
          GMTrace.i(7286277799936L, 54287);
          String str = super.toString() + "|initView";
          GMTrace.o(7286277799936L, 54287);
          return str;
        }
      });
    }
  }
  
  public final int QI()
  {
    GMTrace.i(7304262975488L, 54421);
    int i = R.o.eoV;
    GMTrace.o(7304262975488L, 54421);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7305336717312L, 54429);
    w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(7305336717312L, 54429);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.label.b.a)paramk).aJQ().tPJ;
        if ((paramString != null) && (paramString.size() > 0))
        {
          paramString = (aky)paramString.get(0);
          w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", new Object[] { paramString.uAa, paramString.uzZ });
          this.muU = paramString.uAa;
          aJV();
          GMTrace.o(7305336717312L, 54429);
          return;
        }
        aJU();
        GMTrace.o(7305336717312L, 54429);
        return;
      }
      aJU();
      GMTrace.o(7305336717312L, 54429);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.muU;
        String str = this.muT;
        w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
        try
        {
          paramInt1 = Integer.valueOf(paramString).intValue();
          if (paramInt1 != -1)
          {
            paramk = com.tencent.mm.plugin.label.e.aJO().Tw(paramString);
            paramString = paramk;
            if (paramk == null) {
              paramString = new z();
            }
            paramString.field_labelID = paramInt1;
            paramString.field_labelName = str;
            paramString.field_labelPYFull = com.tencent.mm.platformtools.c.nb(str);
            paramString.field_labelPYShort = com.tencent.mm.platformtools.c.nb(str);
            com.tencent.mm.plugin.label.e.aJO().b(true, paramString, new String[] { "labelID" });
            aJV();
            GMTrace.o(7305336717312L, 54429);
            return;
          }
        }
        catch (Exception paramk)
        {
          for (;;)
          {
            w.e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", new Object[] { paramString });
            paramInt1 = -1;
            continue;
            aJU();
          }
        }
      }
      aJU();
      GMTrace.o(7305336717312L, 54429);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aJT();
        if (this.mHandler != null)
        {
          this.mHandler.sendEmptyMessageDelayed(6002, 300L);
          GMTrace.o(7305336717312L, 54429);
        }
      }
      else
      {
        aJU();
        GMTrace.o(7305336717312L, 54429);
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          a(this.muV);
          if (this.mHandler != null)
          {
            this.mHandler.sendEmptyMessageDelayed(6002, 300L);
            GMTrace.o(7305336717312L, 54429);
          }
        }
        else
        {
          w.w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
          aJW();
        }
      }
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(7305202499584L, 54428);
    paramf = paramPreference.hiu;
    if (bg.nm(paramf))
    {
      w.w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
      GMTrace.o(7305202499584L, 54428);
      return false;
    }
    if (paramf.equals("contact_label_delete")) {
      h.a(this, getString(R.l.dGa), "", getString(R.l.cSt), getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7279432695808L, 54236);
          ContactLabelEditUI.l(ContactLabelEditUI.this);
          GMTrace.o(7279432695808L, 54236);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7317818966016L, 54522);
          GMTrace.o(7317818966016L, 54522);
        }
      });
    }
    w.d("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is %s:", new Object[] { paramf });
    GMTrace.o(7305202499584L, 54428);
    return false;
  }
  
  protected final String aJX()
  {
    GMTrace.i(7307081547776L, 54442);
    if (this.mvc)
    {
      GMTrace.o(7307081547776L, 54442);
      return "_New";
    }
    GMTrace.o(7307081547776L, 54442);
    return "_Edit";
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7305068281856L, 54427);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      GMTrace.o(7305068281856L, 54427);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(7305068281856L, 54427);
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      w.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", new Object[] { paramIntent });
      if (!bg.nm(paramIntent))
      {
        paramIntent = bg.g(paramIntent.split(","));
        if ((paramIntent != null) && (paramIntent.size() > 0))
        {
          paramInt2 = paramIntent.size();
          paramInt1 = 0;
          if (paramInt1 < paramInt2)
          {
            String str = (String)paramIntent.get(paramInt1);
            if (!bg.nm(str))
            {
              if ((!s.fC(str)) || (this.mvd.contains(str)) || (str.equals(this.mvh))) {
                break label287;
              }
              this.mvd.add(str);
              if ((this.mve != null) && (!this.mve.contains(paramIntent.get(paramInt1)))) {
                this.mvf.add(str);
              }
              if ((this.mvg != null) && (this.mvg.contains(str))) {
                this.mvg.remove(str);
              }
            }
            for (;;)
            {
              paramInt1 += 1;
              break;
              label287:
              w.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { str });
            }
          }
        }
        if (this.mHandler != null) {
          this.mHandler.sendEmptyMessage(6001);
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7306678894592L, 54439);
    if (((!bg.nm(this.muT)) && (!this.muT.equals(this.muS))) || ((this.mvf != null) && (this.mvf.size() > 0)) || ((this.mvg != null) && (this.mvg.size() > 0)))
    {
      h.a(this, getString(R.l.dUL), "", getString(R.l.dbE), getString(R.l.dbF), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7294733516800L, 54350);
          ContactLabelEditUI.b(ContactLabelEditUI.this);
          GMTrace.o(7294733516800L, 54350);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7288827936768L, 54306);
          ContactLabelEditUI.this.setResult(0);
          ContactLabelEditUI.this.finish();
          GMTrace.o(7288827936768L, 54306);
        }
      });
      GMTrace.o(7306678894592L, 54439);
      return;
    }
    setResult(0);
    finish();
    GMTrace.o(7306678894592L, 54439);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7304397193216L, 54422);
    super.onCreate(paramBundle);
    this.mvh = q.zE();
    this.muU = getIntent().getStringExtra("label_id");
    this.muS = getIntent().getStringExtra("label_name");
    this.muT = getIntent().getStringExtra("label_name");
    paramBundle = getIntent().getStringExtra("Select_Contact");
    if (!bg.nm(paramBundle))
    {
      paramBundle = bg.g(paramBundle.split(","));
      this.mvd = new ArrayList();
      if ((paramBundle != null) && (paramBundle.size() > 0))
      {
        int j = paramBundle.size();
        int i = 0;
        if (i < j)
        {
          String str = (String)paramBundle.get(i);
          if (!bg.nm(str))
          {
            if ((!s.fC(str)) || (this.mvd.contains(str)) || (str.equals(this.mvh))) {
              break label209;
            }
            this.mvd.add(str);
            this.mvf.add(str);
          }
          for (;;)
          {
            i += 1;
            break;
            label209:
            w.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", new Object[] { str });
          }
        }
      }
    }
    at.wS().a(635, this);
    at.wS().a(637, this);
    at.wS().a(638, this);
    MP();
    GMTrace.o(7304397193216L, 54422);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7304799846400L, 54425);
    at.wS().b(635, this);
    at.wS().b(637, this);
    at.wS().b(638, this);
    super.onDestroy();
    GMTrace.o(7304799846400L, 54425);
  }
  
  protected void onPause()
  {
    GMTrace.i(7304665628672L, 54424);
    com.tencent.mm.modelstat.d.a(4, "ContactLabelEditUI" + aJX(), hashCode());
    at.wS().b(636, this);
    super.onPause();
    GMTrace.o(7304665628672L, 54424);
  }
  
  protected void onResume()
  {
    GMTrace.i(7304531410944L, 54423);
    com.tencent.mm.modelstat.d.a(3, "ContactLabelEditUI" + aJX(), hashCode());
    at.wS().a(636, this);
    Ba(this.muT);
    aJS();
    super.onResume();
    GMTrace.o(7304531410944L, 54423);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\ContactLabelEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
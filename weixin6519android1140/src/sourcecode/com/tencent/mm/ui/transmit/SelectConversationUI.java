package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.a;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.base.stub.d.a;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a.a;
import com.tencent.mm.ui.chatting.ac;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.by;
import com.tencent.mm.y.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@com.tencent.mm.ui.base.a(19)
public class SelectConversationUI
  extends MMBaseSelectContactUI
{
  private static final int xlv;
  private long eDp;
  private long eDr;
  private String eQH;
  private au eRz;
  private int fromScene;
  private int hqO;
  private List<String> iVA;
  private String imagePath;
  private String jyp;
  private int[] ljT;
  private int msgType;
  private boolean wSS;
  private boolean wTR;
  private TextView wpY;
  private int wwx;
  private boolean xlA;
  private boolean xlB;
  private boolean xlC;
  private boolean xlD;
  private int xlE;
  private boolean xlF;
  private String xlG;
  private String xlH;
  private Boolean xlI;
  private boolean xlJ;
  private boolean xlK;
  private List<String> xlL;
  private ReportUtil.ReportArgs xlM;
  private String xlN;
  private String xlO;
  private String xlP;
  private MenuItem.OnMenuItemClickListener xlQ;
  private MenuItem.OnMenuItemClickListener xlR;
  private int xlw;
  private boolean xlx;
  private boolean xly;
  private boolean xlz;
  
  static
  {
    GMTrace.i(3026609766400L, 22550);
    xlv = com.tencent.mm.ui.contact.s.q(new int[] { 1, 2 });
    GMTrace.o(3026609766400L, 22550);
  }
  
  public SelectConversationUI()
  {
    GMTrace.i(3019630444544L, 22498);
    this.xlx = false;
    this.xly = false;
    this.xlz = false;
    this.xlA = false;
    this.xlB = false;
    this.xlC = false;
    this.fromScene = 0;
    this.xlD = false;
    this.wTR = false;
    this.xlF = false;
    this.wwx = -1;
    this.xlI = Boolean.valueOf(false);
    this.xlJ = false;
    this.xlK = false;
    this.xlL = null;
    this.imagePath = null;
    this.xlO = null;
    this.jyp = null;
    this.ljT = new int[] { R.h.boe, R.h.bof, R.h.bog, R.h.boh, R.h.boi };
    this.xlQ = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17933233291264L, 133613);
        paramAnonymousMenuItem = SelectConversationUI.this;
        boolean bool;
        if (!SelectConversationUI.a(SelectConversationUI.this))
        {
          bool = true;
          SelectConversationUI.a(paramAnonymousMenuItem, bool);
          SelectConversationUI.this.cgy().mr(SelectConversationUI.a(SelectConversationUI.this));
          SelectConversationUI.this.wSG.mr(SelectConversationUI.a(SelectConversationUI.this));
          SelectConversationUI.k(SelectConversationUI.this);
          paramAnonymousMenuItem = SelectConversationUI.m(SelectConversationUI.this);
          if (SelectConversationUI.a(SelectConversationUI.this)) {
            break label118;
          }
        }
        label118:
        for (int i = SelectConversationUI.l(SelectConversationUI.this);; i = R.l.dWW)
        {
          paramAnonymousMenuItem.setText(i);
          GMTrace.o(17933233291264L, 133613);
          return true;
          bool = false;
          break;
        }
      }
    };
    this.xlR = new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17928133017600L, 133575);
        if (SelectConversationUI.n(SelectConversationUI.this))
        {
          GMTrace.o(17928133017600L, 133575);
          return false;
        }
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("Select_Conv_User", com.tencent.mm.platformtools.t.c(SelectConversationUI.o(SelectConversationUI.this), ","));
        Intent localIntent = (Intent)SelectConversationUI.this.getIntent().getParcelableExtra("Select_Conv_NextStep");
        if (localIntent != null) {
          SelectConversationUI.a(SelectConversationUI.this, paramAnonymousMenuItem, localIntent);
        }
        for (;;)
        {
          GMTrace.o(17928133017600L, 133575);
          return true;
          if (SelectConversationUI.p(SelectConversationUI.this))
          {
            SelectConversationUI.a(SelectConversationUI.this, paramAnonymousMenuItem);
            SelectConversationUI.this.finish();
          }
          else
          {
            SelectConversationUI.b(SelectConversationUI.this, paramAnonymousMenuItem);
          }
        }
      }
    };
    GMTrace.o(3019630444544L, 22498);
  }
  
  private void Qe()
  {
    GMTrace.i(3023254323200L, 22525);
    if (!this.xlJ)
    {
      GMTrace.o(3023254323200L, 22525);
      return;
    }
    if ((this.xlL != null) && (this.xlL.size() > 0))
    {
      aH(1, getString(R.l.cUs) + "(" + this.xlL.size() + ")");
      b(this.xlR);
      Y(1, true);
      GMTrace.o(3023254323200L, 22525);
      return;
    }
    if (!this.xlK)
    {
      aH(1, getString(R.l.cTA));
      b(this.xlQ);
      Y(1, true);
      GMTrace.o(3023254323200L, 22525);
      return;
    }
    aH(1, getString(R.l.cUA));
    b(this.xlQ);
    Y(1, true);
    GMTrace.o(3023254323200L, 22525);
  }
  
  private void a(Intent paramIntent1, Intent paramIntent2)
  {
    GMTrace.i(3021509492736L, 22512);
    w.d("MicroMsg.SelectConversationUI", "has next step, jump now, intent=" + paramIntent2);
    paramIntent2.putExtras(paramIntent1.getExtras());
    startActivityForResult(paramIntent2, 2);
    com.tencent.mm.ui.base.b.B(this.vKB.vKW, paramIntent2);
    GMTrace.o(3021509492736L, 22512);
  }
  
  private static void a(Intent paramIntent, String paramString1, String paramString2)
  {
    GMTrace.i(3020972621824L, 22508);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString2);
    a(paramIntent, paramString1, localLinkedList);
    GMTrace.o(3020972621824L, 22508);
  }
  
  private static void a(Intent paramIntent, String paramString, List<String> paramList)
  {
    GMTrace.i(3021106839552L, 22509);
    if (paramList.size() > 0)
    {
      paramIntent.putExtra("be_send_card_name", paramString);
      paramIntent.putExtra("received_card_name", com.tencent.mm.platformtools.t.c(paramList, ","));
      paramIntent.putExtra("Is_Chatroom", false);
    }
    GMTrace.o(3021106839552L, 22509);
  }
  
  private void a(e.a parama)
  {
    GMTrace.i(17934441250816L, 133622);
    final Object localObject = (HashMap)getIntent().getSerializableExtra("appbrand_params");
    int i = by.getInt(((HashMap)localObject).get("type"), 1);
    String str1 = by.b(((HashMap)localObject).get("title"), "");
    String str2 = by.b(((HashMap)localObject).get("img_url"), null);
    if ((i == 2) || (i == 3))
    {
      String str3 = by.b(((HashMap)localObject).get("app_id"), null);
      i = by.getInt(((HashMap)localObject).get("pkg_type"), 0);
      int j = by.getInt(((HashMap)localObject).get("pkg_version"), 0);
      String str4 = by.b(((HashMap)localObject).get("cache_key"), null);
      String str5 = by.b(((HashMap)localObject).get("path"), null);
      String str6 = by.b(((HashMap)localObject).get("delay_load_img_path"), null);
      boolean bool = by.aB(((HashMap)localObject).get("is_dynamic"));
      localObject = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aZ(this);
      final String str7 = com.tencent.mm.plugin.appbrand.n.g.aQ(this);
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", str3);
      localBundle.putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }));
      localBundle.putInt("msg_pkg_type", i);
      localBundle.putInt("pkg_version", j);
      localBundle.putString("image_url", str2);
      localBundle.putBoolean("is_dynamic_page", bool);
      localBundle.putString("title", str1);
      localBundle.putString("cache_key", str4);
      localBundle.putString("msg_path", str5);
      localBundle.putString("delay_load_img_path", str6);
      ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).a(str7, (View)localObject, localBundle);
      parama.cU((View)localObject);
      parama.e(Boolean.valueOf(true));
      parama.bLG();
      parama.iKD = new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(17933501726720L, 133615);
          ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).a(str7, localObject);
          GMTrace.o(17933501726720L, 133615);
        }
      };
      GMTrace.o(17934441250816L, 133622);
      return;
    }
    parama.Pi(getResources().getString(R.l.cRR) + str1);
    parama.Pj(str2).bLF();
    parama.e(Boolean.valueOf(true));
    GMTrace.o(17934441250816L, 133622);
  }
  
  private void a(e.a parama, String paramString)
  {
    GMTrace.i(3021375275008L, 22511);
    at.AR();
    com.tencent.mm.y.c.yK().TC(paramString);
    String str = r.fs(paramString);
    if (!bg.nm(this.xlH)) {
      str = this.xlH;
    }
    at.AR();
    if (com.tencent.mm.y.s.fp(com.tencent.mm.y.c.yK().TC(paramString).field_verifyFlag)) {}
    for (paramString = getResources().getString(R.l.cTk);; paramString = getResources().getString(R.l.cTl))
    {
      parama.Pi(paramString + str);
      GMTrace.o(3021375275008L, 22511);
      return;
    }
  }
  
  private static void b(Intent paramIntent, String paramString1, String paramString2)
  {
    GMTrace.i(3021241057280L, 22510);
    if (paramString1 != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("cardNameToSend is null", bool);
      paramIntent.putExtra("be_send_card_name", paramString1);
      paramIntent.putExtra("received_card_name", paramString2);
      paramIntent.putExtra("Is_Chatroom", true);
      GMTrace.o(3021241057280L, 22510);
      return;
    }
  }
  
  private void b(e.a parama)
  {
    GMTrace.i(3021777928192L, 22514);
    final Object localObject1;
    final Object localObject2;
    f.a locala;
    switch (this.msgType)
    {
    case 6: 
    case 7: 
    case 14: 
    case 15: 
    default: 
      GMTrace.o(3021777928192L, 22514);
      return;
    case 4: 
      parama.Pi(this.eQH);
      parama.bLE();
      GMTrace.o(3021777928192L, 22514);
      return;
    case 0: 
    case 16: 
      if (this.eRz == null) {}
      float f;
      for (localObject1 = null;; localObject1 = com.tencent.mm.sdk.platformtools.d.a(((com.tencent.mm.ao.f)localObject2).kf((String)localObject1), f, 0))
      {
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = localObject1;
          if (this.imagePath != null) {
            localObject2 = com.tencent.mm.sdk.platformtools.d.RD(this.imagePath);
          }
        }
        parama.a((Bitmap)localObject2, 3);
        GMTrace.o(3021777928192L, 22514);
        return;
        localObject1 = this.eRz.field_imgPath;
        localObject2 = com.tencent.mm.ao.n.IZ();
        f = com.tencent.mm.br.a.getDensity(com.tencent.mm.sdk.platformtools.ab.getContext());
      }
    case 1: 
      parama.a(ciH(), 2);
      GMTrace.o(3021777928192L, 22514);
      return;
    case 11: 
      parama.a(ciH(), 2);
      GMTrace.o(3021777928192L, 22514);
      return;
    case 9: 
      at.AR();
      localObject2 = com.tencent.mm.y.c.yM().Co(this.eQH);
      localObject1 = "";
      if (localObject2 != null) {
        localObject1 = ((au.b)localObject2).label;
      }
      parama.Pi(this.vKB.vKW.getString(R.l.cTu) + (String)localObject1);
      GMTrace.o(3021777928192L, 22514);
      return;
    case 5: 
      if (!bg.nm(this.xlN))
      {
        parama.Pk(this.xlN);
        GMTrace.o(3021777928192L, 22514);
        return;
      }
      if (!bg.nm(this.eRz.field_imgPath))
      {
        parama.Pk(this.eRz.field_imgPath);
        GMTrace.o(3021777928192L, 22514);
        return;
      }
      parama.Pk(this.imagePath);
      GMTrace.o(3021777928192L, 22514);
      return;
    case 8: 
      at.AR();
      localObject1 = com.tencent.mm.y.c.yM().Cn(this.eQH);
      this.xlG = ((au.a)localObject1).rAP;
      this.xlH = ((au.a)localObject1).eCQ;
      this.xlI = Boolean.valueOf(com.tencent.mm.y.s.fp(((au.a)localObject1).rCC));
      a(parama, this.xlG);
      GMTrace.o(3021777928192L, 22514);
      return;
    case 2: 
    case 10: 
      locala = f.a.eS(bg.Sx(this.eQH));
      if ((this.eRz.bTs()) && (locala == null)) {
        locala = f.a.C(bg.Sx(this.eQH), bg.Sx(this.eQH));
      }
      break;
    }
    for (;;)
    {
      if (locala == null)
      {
        if (this.xlO != null)
        {
          localObject1 = getResources().getString(R.l.cUP);
          localObject2 = this.xlO;
          parama.Pi((String)localObject1 + (String)localObject2);
        }
        GMTrace.o(3021777928192L, 22514);
        return;
      }
      localObject1 = locala.title;
      if (ac.g(this.eRz, this.wwx)) {
        localObject2 = getResources().getString(R.l.cRR);
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = "";
        }
        parama.Pi((String)localObject2 + (String)localObject3);
        if (locala.thumburl == null) {
          break;
        }
        parama.Pj(locala.thumburl).bLF();
        GMTrace.o(3021777928192L, 22514);
        return;
        if (locala.type == 5)
        {
          localObject2 = getResources().getString(R.l.cUM);
          localObject3 = locala.url;
        }
        else if (locala.type == 6)
        {
          localObject2 = getResources().getString(R.l.cTf);
        }
        else if (locala.type == 24)
        {
          localObject2 = getResources().getString(R.l.cTL);
          localObject1 = new mn();
          ((mn)localObject1).eRu.type = 0;
          ((mn)localObject1).eRu.eRw = locala.giV;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          localObject1 = bg.aq(((mn)localObject1).eRv.eRE.desc, locala.description).replaceAll("\n", " ");
        }
        else if (locala.type == 19)
        {
          localObject2 = getResources().getString(R.l.cUk);
        }
        else if (locala.type == 3)
        {
          localObject2 = getResources().getString(R.l.cTB);
        }
        else if (locala.type == 4)
        {
          localObject2 = getResources().getString(R.l.cUP);
        }
        else if (locala.type == 8)
        {
          localObject2 = getResources().getString(R.l.cSF);
        }
        else if ((locala.type == 33) || (locala.type == 36))
        {
          if ((locala.gkT == 2) || (locala.gkT == 3) || (locala.type == 36))
          {
            localObject1 = ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).aZ(this);
            parama.cU((View)localObject1);
            parama.e(Boolean.valueOf(true));
            parama.bLG();
            Object localObject4 = com.tencent.mm.ao.n.IZ().kf(this.eRz.field_imgPath);
            localObject2 = com.tencent.mm.plugin.appbrand.n.g.aQ(this);
            localObject3 = new Bundle();
            ((Bundle)localObject3).putString("app_id", locala.gkS);
            ((Bundle)localObject3).putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(locala.gkY), Integer.valueOf(locala.gkV) }));
            ((Bundle)localObject3).putInt("msg_pkg_type", locala.gkY);
            ((Bundle)localObject3).putInt("pkg_version", locala.gkV);
            if (!bg.nm((String)localObject4)) {
              ((Bundle)localObject3).putString("image_url", "file://" + (String)localObject4);
            }
            localObject4 = (com.tencent.mm.x.a)locala.n(com.tencent.mm.x.a.class);
            if (localObject4 != null)
            {
              ((Bundle)localObject3).putBoolean("is_dynamic_page", ((com.tencent.mm.x.a)localObject4).gin);
              ((Bundle)localObject3).putString("cache_key", ((com.tencent.mm.x.a)localObject4).gio);
            }
            ((Bundle)localObject3).putString("title", locala.title);
            ((Bundle)localObject3).putString("msg_path", locala.gkQ);
            ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).a((String)localObject2, (View)localObject1, (Bundle)localObject3);
            parama.iKD = new DialogInterface.OnDismissListener()
            {
              public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(17930012065792L, 133589);
                ((com.tencent.mm.modelappbrand.g)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.g.class)).a(localObject2, localObject1);
                GMTrace.o(17930012065792L, 133589);
              }
            };
            GMTrace.o(3021777928192L, 22514);
            return;
          }
          localObject2 = getResources().getString(R.l.cRR);
        }
        else
        {
          localObject2 = getResources().getString(R.l.cRN);
        }
      }
      localObject1 = com.tencent.mm.platformtools.t.aq(com.tencent.mm.ui.chatting.ab.fr(this.vKB.vKW).eRv.eRD.title, "");
      parama.Pi(getResources().getString(R.l.cTz) + (String)localObject1);
      GMTrace.o(3021777928192L, 22514);
      return;
      localObject1 = com.tencent.mm.ui.chatting.ab.fr(this.vKB.vKW);
      int i = 0;
      if (((mn)localObject1).eRu.eRA != null) {
        i = ((mn)localObject1).eRu.eRA.size();
      }
      localObject1 = this.vKB.vKW.getString(R.l.dSj, new Object[] { Integer.valueOf(i) });
      parama.Pi(getResources().getString(R.l.cTy) + (String)localObject1);
      GMTrace.o(3021777928192L, 22514);
      return;
      if (this.jyp == null) {
        break;
      }
      parama.Pi(getResources().getString(R.l.cTf) + this.jyp);
      break;
    }
  }
  
  private void c(e.a parama)
  {
    GMTrace.i(3021912145920L, 22515);
    switch (this.msgType)
    {
    }
    for (;;)
    {
      GMTrace.o(3021912145920L, 22515);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(3018422484992L, 22489);
          Intent localIntent = new Intent(SelectConversationUI.this.vKB.vKW, RetransmitPreviewUI.class);
          localIntent.putExtra("Retr_Msg_content", SelectConversationUI.h(SelectConversationUI.this));
          SelectConversationUI.this.startActivity(localIntent);
          com.tencent.mm.ui.base.b.fl(SelectConversationUI.this.vKB.vKW);
          GMTrace.o(3018422484992L, 22489);
        }
      });
      GMTrace.o(3021912145920L, 22515);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(3045534466048L, 22691);
          Intent localIntent = new Intent(SelectConversationUI.this.vKB.vKW, ImageGalleryUI.class);
          localIntent.putExtra("img_gallery_msg_id", SelectConversationUI.i(SelectConversationUI.this));
          localIntent.putExtra("img_gallery_msg_svr_id", SelectConversationUI.j(SelectConversationUI.this).field_msgSvrId);
          localIntent.putExtra("img_gallery_talker", SelectConversationUI.j(SelectConversationUI.this).field_talker);
          localIntent.putExtra("img_gallery_chatroom_name", SelectConversationUI.j(SelectConversationUI.this).field_talker);
          localIntent.putExtra("img_preview_only", true);
          SelectConversationUI.this.startActivity(localIntent);
          com.tencent.mm.ui.base.b.fl(SelectConversationUI.this.vKB.vKW);
          GMTrace.o(3045534466048L, 22691);
        }
      });
      GMTrace.o(3021912145920L, 22515);
      return;
      at.AR();
      final Object localObject = com.tencent.mm.y.c.yM().Co(this.eQH);
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(3040031539200L, 22650);
          Intent localIntent = new Intent();
          localIntent.putExtra("map_view_type", 1);
          localIntent.putExtra("kwebmap_slat", localObject.mwH);
          localIntent.putExtra("kwebmap_lng", localObject.mwI);
          localIntent.putExtra("Kwebmap_locaion", this.xlU);
          localIntent.putExtra("kShowshare", false);
          com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "location", ".ui.RedirectUI", localIntent);
          GMTrace.o(3040031539200L, 22650);
        }
      });
      GMTrace.o(3021912145920L, 22515);
      return;
      localObject = f.a.eS(bg.Sx(this.eQH));
      if (localObject == null)
      {
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if ((((f.a)localObject).type == 5) && (!ac.g(this.eRz, this.wwx)))
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3053990182912L, 22754);
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", this.val$url);
            localIntent.putExtra("showShare", false);
            com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(3053990182912L, 22754);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if (((f.a)localObject).type == 6)
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3013322211328L, 22451);
            Intent localIntent = new Intent();
            localIntent.setClassName(SelectConversationUI.this.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            localIntent.putExtra("app_msg_id", SelectConversationUI.i(SelectConversationUI.this));
            localIntent.putExtra("app_show_share", false);
            SelectConversationUI.this.startActivity(localIntent);
            GMTrace.o(3013322211328L, 22451);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if (((f.a)localObject).type == 24)
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3013859082240L, 22455);
            le localle = new le();
            localle.ePv.context = SelectConversationUI.this.vKB.vKW;
            localle.ePv.eDr = SelectConversationUI.i(SelectConversationUI.this);
            localle.ePv.ePw = localObject.giV;
            localle.ePv.eON = false;
            com.tencent.mm.sdk.b.a.vgX.m(localle);
            GMTrace.o(3013859082240L, 22455);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if (((f.a)localObject).type == 19)
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3040299974656L, 22652);
            Intent localIntent = new Intent();
            localIntent.putExtra("message_id", SelectConversationUI.i(SelectConversationUI.this));
            localIntent.putExtra("record_xml", localObject.giV);
            localIntent.putExtra("record_show_share", false);
            com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "record", ".ui.RecordMsgDetailUI", localIntent);
            GMTrace.o(3040299974656L, 22652);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if (((f.a)localObject).type == 3)
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3053319094272L, 22749);
            Object localObject2 = com.tencent.mm.pluginsdk.model.app.p.s(localObject.url, "message");
            String str = com.tencent.mm.pluginsdk.model.app.p.s(localObject.giu, "message");
            Object localObject1;
            if (am.isMobile(SelectConversationUI.this.vKB.vKW))
            {
              localObject1 = localObject2;
              if (str != null)
              {
                if (str.length() > 0) {
                  break label131;
                }
                localObject1 = localObject2;
              }
            }
            for (;;)
            {
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
              ((Intent)localObject2).putExtra("showShare", false);
              com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
              GMTrace.o(3053319094272L, 22749);
              return;
              if (localObject2 != null)
              {
                localObject1 = localObject2;
                if (((String)localObject2).length() > 0) {}
              }
              else
              {
                label131:
                localObject1 = str;
              }
            }
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
      }
      if (((f.a)localObject).type == 4)
      {
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3053587529728L, 22751);
            GMTrace.o(3053587529728L, 22751);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3053050658816L, 22747);
            Object localObject = com.tencent.mm.ui.chatting.ab.fr(SelectConversationUI.this.vKB.vKW);
            localObject = f.a.eS(bg.Sx(com.tencent.mm.plugin.record.a.m.a(((mn)localObject).eRv.eRD.title, ((mn)localObject).eRv.eRD.desc, ((mn)localObject).eRv.eQY.eDv.eDx, ((mn)localObject).eRu.eRB)));
            if (localObject == null)
            {
              GMTrace.o(3053050658816L, 22747);
              return;
            }
            Intent localIntent = new Intent();
            localIntent.putExtra("message_id", SelectConversationUI.i(SelectConversationUI.this));
            localIntent.putExtra("record_xml", ((f.a)localObject).giV);
            localIntent.putExtra("record_show_share", false);
            com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "record", ".ui.RecordMsgDetailUI", localIntent);
            GMTrace.o(3053050658816L, 22747);
          }
        });
        GMTrace.o(3021912145920L, 22515);
        return;
        com.tencent.mm.ui.chatting.ab.fr(this.vKB.vKW);
        GMTrace.o(3021912145920L, 22515);
        return;
        parama.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(17930951589888L, 133596);
            Intent localIntent = new Intent();
            localIntent.setClassName(SelectConversationUI.this.vKB.vKW, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            localIntent.putExtra("app_msg_id", SelectConversationUI.i(SelectConversationUI.this));
            localIntent.putExtra("app_show_share", false);
            SelectConversationUI.this.startActivity(localIntent);
            GMTrace.o(17930951589888L, 133596);
          }
        });
      }
    }
  }
  
  private Bitmap ciH()
  {
    GMTrace.i(3022046363648L, 22516);
    com.tencent.mm.modelvideo.o.Nh();
    String str = com.tencent.mm.modelvideo.s.ml(this.eRz.field_imgPath);
    Object localObject = str;
    if (str == null) {
      localObject = this.imagePath;
    }
    localObject = com.tencent.mm.sdk.platformtools.d.RD((String)localObject);
    GMTrace.o(3022046363648L, 22516);
    return (Bitmap)localObject;
  }
  
  private void ciI()
  {
    GMTrace.i(3022180581376L, 22517);
    w.i("MicroMsg.SelectConversationUI", "doCallSelectContactUIForMultiRetransmit");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 14);
    localIntent.putExtra("titile", getString(R.l.cRp));
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.wTp);
    localIntent.putExtra("already_select_contact", com.tencent.mm.platformtools.t.c(this.xlL, ","));
    localIntent.putExtra("max_limit_num", 9);
    this.vKB.vKW.startActivityForResult(localIntent, 5);
    GMTrace.o(3022180581376L, 22517);
  }
  
  private void ciJ()
  {
    GMTrace.i(3022314799104L, 22518);
    w.i("MicroMsg.SelectConversationUI", "doSendCardOrQRCode2CallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.wTm);
    localIntent.putExtra("list_type", 3);
    localIntent.putExtra("be_send_card_name", this.xlG);
    localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
    localIntent.putExtra("Add_SendCard", true);
    localIntent.putExtra("titile", getString(R.l.cRp));
    this.vKB.vKW.startActivityForResult(localIntent, 3);
    GMTrace.o(3022314799104L, 22518);
  }
  
  private void ciK()
  {
    GMTrace.i(3022449016832L, 22519);
    w.i("MicroMsg.SelectConversationUI", "doCallSelectContactUI");
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_type", 5);
    localIntent.putExtra("titile", getString(R.l.cRp));
    if (((this.fromScene == 4) || (this.fromScene == 9)) && (getIntent().getIntExtra("jsapi_select_mode", 0) == 1))
    {
      localIntent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { 32, 16, 1, 2, 4, 16384 }));
    }
    for (;;)
    {
      this.vKB.vKW.startActivityForResult(localIntent, 1);
      GMTrace.o(3022449016832L, 22519);
      return;
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.wTo);
    }
  }
  
  private void e(int paramInt, Intent paramIntent)
  {
    GMTrace.i(14990643822592L, 111689);
    Intent localIntent = paramIntent;
    if (this.msgType == 5)
    {
      localIntent = paramIntent;
      if (paramIntent == null) {
        localIntent = new Intent();
      }
      localIntent.putExtra("emoji_thumb_path", this.xlN);
      localIntent.putExtra("emoji_activity_id", getIntent().getStringExtra("emoji_activity_id"));
    }
    super.setResult(-1, localIntent);
    GMTrace.o(14990643822592L, 111689);
  }
  
  private void m(final Intent paramIntent, String paramString)
  {
    GMTrace.i(3021643710464L, 22513);
    if (com.tencent.mm.ui.contact.s.ew(this.hqO, 256))
    {
      e(-1, paramIntent);
      finish();
      GMTrace.o(3021643710464L, 22513);
      return;
    }
    if (com.tencent.mm.platformtools.t.nm(paramString))
    {
      w.v("MicroMsg.SelectConversationUI", "avatarUseName is null or nil show dialog fail ");
      GMTrace.o(3021643710464L, 22513);
      return;
    }
    if (com.tencent.mm.y.s.eb(paramString))
    {
      int i = com.tencent.mm.y.m.fk(paramString);
      if (this.xlF)
      {
        int j = com.tencent.mm.platformtools.t.getInt(com.tencent.mm.k.g.ut().getValue("CheckBigFileUploadChatroomMemberCountLimit"), 50);
        if (i > j)
        {
          w.w("MicroMsg.SelectConversationUI", "summerbig SelectConversationUI group limit[%d], count[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          com.tencent.mm.ui.base.h.b(this, getString(R.l.dWN, new Object[] { Integer.valueOf(j) }), "", true);
          GMTrace.o(3021643710464L, 22513);
          return;
        }
      }
      getString(R.l.dWL, new Object[] { Integer.valueOf(i) });
    }
    e.a locala = new e.a(this.vKB.vKW);
    locala.bA(paramString);
    if (this.wTR)
    {
      a(locala, this.xlG);
      if (paramString.endsWith("@chatroom"))
      {
        b(paramIntent, this.xlG, paramString);
        locala.e(Boolean.valueOf(true));
      }
    }
    for (;;)
    {
      
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(3054258618368L, 22756);
          SelectConversationUI.this.aLo();
          boolean bool = paramIntent.getBooleanExtra("need_delete_chatroom_when_cancel", false);
          if (bool) {
            if (!paramAnonymousBoolean) {
              break label129;
            }
          }
          label129:
          for (paramAnonymousInt = 1;; paramAnonymousInt = 0)
          {
            w.i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomOperation %d %d", new Object[] { Integer.valueOf(13943), Integer.valueOf(paramAnonymousInt) });
            com.tencent.mm.plugin.report.service.g.ork.i(13943, new Object[] { Integer.valueOf(paramAnonymousInt) });
            if (!paramAnonymousBoolean) {
              break;
            }
            paramIntent.putExtra("custom_send_text", paramAnonymousString);
            SelectConversationUI.a(SelectConversationUI.this, paramIntent);
            SelectConversationUI.this.finish();
            GMTrace.o(3054258618368L, 22756);
            return;
          }
          if (bool)
          {
            paramAnonymousString = paramIntent.getStringExtra("Select_Contact");
            at.AR();
            com.tencent.mm.y.c.yP().TN(paramAnonymousString);
          }
          GMTrace.o(3054258618368L, 22756);
        }
      }.show();
      GMTrace.o(3021643710464L, 22513);
      return;
      a(paramIntent, this.xlG, paramString);
      break;
      if (this.xly)
      {
        if (this.eDp != -1L)
        {
          c(locala);
          paramString = new fr();
          paramString.eIj.eDp = this.eDp;
          paramString.eIj.eIk = locala;
          paramString.eIj.eIl = this.xlP;
          paramString.eIj.eAZ = this.vKB.vKW;
          com.tencent.mm.sdk.b.a.vgX.m(paramString);
        }
        for (;;)
        {
          locala.e(Boolean.valueOf(true));
          break;
          if ((this.msgType == 17) && (this.xlE != 0))
          {
            paramString = this.vKB.vKW.getString(R.l.dSj, new Object[] { Integer.valueOf(this.xlE) });
            locala.Pi(getResources().getString(R.l.cTy) + paramString);
          }
        }
      }
      String str;
      if (this.xlz)
      {
        final Object localObject = (HashMap)getIntent().getSerializableExtra("webview_params");
        paramString = (String)((HashMap)localObject).get("img_url");
        str = (String)((HashMap)localObject).get("title");
        localObject = (String)((HashMap)localObject).get("url");
        locala.Pi(getResources().getString(R.l.cUM) + str);
        locala.a(new i.a.a()
        {
          public final void azi()
          {
            GMTrace.i(3052782223360L, 22745);
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", localObject);
            localIntent.putExtra("showShare", false);
            com.tencent.mm.bj.d.b(SelectConversationUI.this.vKB.vKW, "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(3052782223360L, 22745);
          }
        });
        locala.Pj(paramString).bLF();
        locala.e(Boolean.valueOf(true));
      }
      else if (this.xlA)
      {
        a(locala);
      }
      else if (this.xlC)
      {
        str = getResources().getString(R.l.cTn);
        paramString = str;
        if (this.jyp != null) {
          paramString = str + this.jyp;
        }
        locala.Pi(paramString);
        locala.e(Boolean.valueOf(false));
      }
      else
      {
        b(locala);
        c(locala);
        locala.e(Boolean.valueOf(true));
      }
    }
  }
  
  private boolean mF(boolean paramBoolean)
  {
    GMTrace.i(3023388540928L, 22526);
    if (paramBoolean)
    {
      if (this.xlL.size() < 9) {}
    }
    else {
      while (this.xlL.size() > 9)
      {
        String str = getString(R.l.dWO, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 9)) });
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, str, getString(R.l.cUl), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17932964855808L, 133611);
            GMTrace.o(17932964855808L, 133611);
          }
        });
        GMTrace.o(3023388540928L, 22526);
        return true;
      }
    }
    GMTrace.o(3023388540928L, 22526);
    return false;
  }
  
  protected final void PY()
  {
    GMTrace.i(3019898880000L, 22500);
    super.PY();
    this.xlx = getIntent().getBooleanExtra("select_is_ret", false);
    this.fromScene = getIntent().getIntExtra("scene_from", 0);
    w.i("MicroMsg.SelectConversationUI", "from scene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    if (this.fromScene == 1) {
      this.xly = true;
    }
    for (;;)
    {
      this.xlD = getIntent().getBooleanExtra("send_to_biz", false);
      this.wwx = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      this.eDp = getIntent().getLongExtra("select_fav_local_id", -1L);
      this.xlE = getIntent().getIntExtra("select_fav_select_count", 0);
      this.xlJ = getIntent().getBooleanExtra("mutil_select_is_ret", false);
      this.wTR = getIntent().getBooleanExtra("Select_Send_Card", false);
      this.xlF = getIntent().getBooleanExtra("Retr_Big_File", false);
      if (this.wTR) {
        this.xlG = getIntent().getStringExtra("Select_Talker_Name");
      }
      this.hqO = getIntent().getIntExtra("Select_Conv_Type", xlv);
      this.msgType = getIntent().getIntExtra("Retr_Msg_Type", -1);
      this.eDr = getIntent().getLongExtra("Retr_Msg_Id", -1L);
      at.AR();
      this.eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
      this.imagePath = getIntent().getStringExtra("image_path");
      this.xlO = getIntent().getStringExtra("ad_video_title");
      this.jyp = getIntent().getStringExtra("desc_title");
      this.xlN = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.eQH = getIntent().getStringExtra("Retr_Msg_content");
      this.xlP = getIntent().getStringExtra("Retr_fav_xml_str");
      if ((this.eQH == null) && (this.eRz != null)) {
        this.eQH = this.eRz.field_content;
      }
      this.xlM = ((ReportUtil.ReportArgs)getIntent().getParcelableExtra("Select_Report_Args"));
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(com.tencent.mm.ui.contact.s.cgI());
      Object localObject = getIntent().getStringExtra("Select_block_List");
      if (!com.tencent.mm.platformtools.t.nm((String)localObject)) {
        localHashSet.addAll(com.tencent.mm.platformtools.t.g(((String)localObject).split(",")));
      }
      if (com.tencent.mm.ui.contact.s.ew(this.hqO, 2))
      {
        localObject = com.tencent.mm.ui.contact.s.cgJ();
        com.tencent.mm.ui.contact.s.g((HashSet)localObject);
        localHashSet.addAll((Collection)localObject);
      }
      this.iVA = new ArrayList();
      this.iVA.addAll(localHashSet);
      if (com.tencent.mm.ui.contact.s.ew(this.hqO, 1)) {
        this.wSS = true;
      }
      if (this.xlJ)
      {
        this.xlL = new LinkedList();
        if (this.xlJ)
        {
          a(1, getString(R.l.cTA), this.xlQ, p.b.vLG);
          Qe();
        }
      }
      GMTrace.o(3019898880000L, 22500);
      return;
      if (this.fromScene == 2) {
        this.xlz = true;
      } else if (this.fromScene == 3) {
        this.xlA = true;
      } else if (this.fromScene == 6) {
        this.xlB = true;
      } else if (this.fromScene == 7) {
        this.xlC = true;
      }
    }
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(3022851670016L, 22522);
    GMTrace.o(3022851670016L, 22522);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(3022583234560L, 22520);
    GMTrace.o(3022583234560L, 22520);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(3022717452288L, 22521);
    String str = getIntent().getStringExtra("Select_Conv_ui_title");
    if ((str == null) || (str.length() <= 0))
    {
      str = getString(R.l.dWR);
      GMTrace.o(3022717452288L, 22521);
      return str;
    }
    GMTrace.o(3022717452288L, 22521);
    return str;
  }
  
  protected final com.tencent.mm.ui.contact.o Qc()
  {
    GMTrace.i(3020033097728L, 22501);
    com.tencent.mm.ui.contact.t localt = new com.tencent.mm.ui.contact.t(this, this.iVA, this.wSS, this.xlK, this.xlD, this.hqO);
    GMTrace.o(3020033097728L, 22501);
    return localt;
  }
  
  protected final com.tencent.mm.ui.contact.m Qd()
  {
    GMTrace.i(3020167315456L, 22502);
    q localq = new q(this, this.iVA, this.xlK, this.scene);
    GMTrace.o(3020167315456L, 22502);
    return localq;
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    GMTrace.i(3020301533184L, 22503);
    super.a(paramListView, paramInt);
    if (this.wpY == null) {
      if (!this.wTR) {
        break label124;
      }
    }
    label124:
    for (this.xlw = R.l.dWW;; this.xlw = R.l.dWP)
    {
      Object localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3040568410112L, 22654);
          if (SelectConversationUI.a(SelectConversationUI.this))
          {
            SelectConversationUI.b(SelectConversationUI.this);
            GMTrace.o(3040568410112L, 22654);
            return;
          }
          if (SelectConversationUI.c(SelectConversationUI.this))
          {
            SelectConversationUI.d(SelectConversationUI.this);
            GMTrace.o(3040568410112L, 22654);
            return;
          }
          SelectConversationUI.e(SelectConversationUI.this);
          GMTrace.o(3040568410112L, 22654);
        }
      };
      String str = getString(this.xlw);
      View localView = v.fb(this).inflate(R.i.czF, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(R.h.brW);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.wpY = ((TextView)localObject);
      this.wpY.setVisibility(paramInt);
      GMTrace.o(3020301533184L, 22503);
      return;
    }
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(3022985887744L, 22523);
    if ((parama.wSC) && (parama.iBi != null))
    {
      boolean bool = this.xlL.contains(parama.iBi.field_username);
      GMTrace.o(3022985887744L, 22523);
      return bool;
    }
    GMTrace.o(3022985887744L, 22523);
    return false;
  }
  
  public final int[] aMW()
  {
    GMTrace.i(3023656976384L, 22528);
    int[] arrayOfInt = getIntent().getIntArrayExtra("search_range");
    if (this.fromScene == 4)
    {
      GMTrace.o(3023656976384L, 22528);
      return new int[] { 131072 };
    }
    if (arrayOfInt != null)
    {
      GMTrace.o(3023656976384L, 22528);
      return arrayOfInt;
    }
    arrayOfInt = super.aMW();
    GMTrace.o(3023656976384L, 22528);
    return arrayOfInt;
  }
  
  protected final void aMX()
  {
    GMTrace.i(3020435750912L, 22504);
    if (this.fromScene == 5) {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dHs), null, getString(R.l.send), getString(R.l.cancel), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3016275001344L, 22473);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(3016275001344L, 22473);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3033186435072L, 22599);
          SelectConversationUI.f(SelectConversationUI.this);
          SelectConversationUI.this.aLo();
          GMTrace.o(3033186435072L, 22599);
        }
      });
    }
    for (;;)
    {
      if (this.xlM != null) {
        ReportUtil.a(this, this.xlM);
      }
      GMTrace.o(3020435750912L, 22504);
      return;
      super.aMX();
      aLo();
    }
  }
  
  protected final boolean cgC()
  {
    GMTrace.i(3023522758656L, 22527);
    GMTrace.o(3023522758656L, 22527);
    return true;
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(3020704186368L, 22506);
    int i;
    if (this.xlK)
    {
      i = paramInt - this.nVC.getHeaderViewsCount();
      if (i < 0)
      {
        w.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
        ciI();
        GMTrace.o(3020704186368L, 22506);
        return;
      }
      localObject1 = cgy();
      localObject2 = ((com.tencent.mm.ui.contact.n)localObject1).DC(i);
      if (localObject2 == null)
      {
        GMTrace.o(3020704186368L, 22506);
        return;
      }
      if (((com.tencent.mm.ui.contact.a.a)localObject2).iBi == null)
      {
        GMTrace.o(3020704186368L, 22506);
        return;
      }
      localObject2 = ((com.tencent.mm.ui.contact.a.a)localObject2).iBi.field_username;
      w.i("MicroMsg.SelectConversationUI", "ClickUser=%s", new Object[] { localObject2 });
      if ((!this.xlL.contains(localObject2)) && (mF(true)))
      {
        cgE();
        GMTrace.o(3020704186368L, 22506);
        return;
      }
      cgE();
      this.mUn.OY((String)localObject2);
      if (this.xlL.contains(localObject2)) {
        this.xlL.remove(localObject2);
      }
      for (;;)
      {
        Qe();
        ((com.tencent.mm.ui.contact.n)localObject1).notifyDataSetChanged();
        GMTrace.o(3020704186368L, 22506);
        return;
        this.xlL.add(localObject2);
      }
    }
    if (paramInt < this.nVC.getHeaderViewsCount())
    {
      w.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      if (this.wTR)
      {
        ciJ();
        GMTrace.o(3020704186368L, 22506);
        return;
      }
      ciK();
      GMTrace.o(3020704186368L, 22506);
      return;
    }
    Object localObject1 = (com.tencent.mm.ui.contact.a.a)this.nVC.getAdapter().getItem(paramInt);
    if (localObject1 == null)
    {
      GMTrace.o(3020704186368L, 22506);
      return;
    }
    if (((localObject1 instanceof com.tencent.mm.ui.contact.a.b)) && (((com.tencent.mm.ui.contact.a.b)localObject1).aDn == getResources().getString(R.l.cRf)))
    {
      w.i("MicroMsg.SelectConversationUI", "doCallSelectBizItem");
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("list_attr", 16384);
      com.tencent.mm.bj.d.b(this, "brandservice", ".ui.BrandServiceIndexUI", (Intent)localObject1, 4);
      this.xlz = true;
      GMTrace.o(3020704186368L, 22506);
      return;
    }
    if ((localObject1 instanceof com.tencent.mm.ui.contact.a.f))
    {
      localObject3 = (com.tencent.mm.ui.contact.a.f)localObject1;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("scene", this.scene);
      localObject2 = new ArrayList();
      localObject3 = ((com.tencent.mm.ui.contact.a.f)localObject3).lxa;
      i = localObject3.length;
      paramInt = 0;
      while (paramInt < i)
      {
        ((ArrayList)localObject2).add(localObject3[paramInt]);
        paramInt += 1;
      }
      ((Intent)localObject1).putExtra("query_phrase_list", (Serializable)localObject2);
      com.tencent.mm.bj.d.a(this, ".ui.transmit.MMCreateChatroomUI", (Intent)localObject1, 1);
      GMTrace.o(3020704186368L, 22506);
      return;
    }
    localObject1 = ((com.tencent.mm.ui.contact.a.a)localObject1).iBi;
    if (localObject1 == null)
    {
      GMTrace.o(3020704186368L, 22506);
      return;
    }
    localObject1 = ((af)localObject1).field_username;
    w.i("MicroMsg.SelectConversationUI", "doClickUser=%s", new Object[] { localObject1 });
    Object localObject2 = new Intent();
    ((Intent)localObject2).putExtra("Select_Conv_User", (String)localObject1);
    Object localObject3 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
    if (localObject3 != null) {
      a((Intent)localObject2, (Intent)localObject3);
    }
    for (;;)
    {
      aLo();
      GMTrace.o(3020704186368L, 22506);
      return;
      if ((this.xlx) || (this.wTR) || (this.xly) || (this.xlz) || (this.xlA))
      {
        m((Intent)localObject2, (String)localObject1);
      }
      else
      {
        e(-1, (Intent)localObject2);
        finish();
      }
    }
  }
  
  public final void nw(String paramString)
  {
    GMTrace.i(3023120105472L, 22524);
    this.xlL.remove(paramString);
    cgy().notifyDataSetChanged();
    Qe();
    GMTrace.o(3023120105472L, 22524);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(3020838404096L, 22507);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      w.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
    }
    Object localObject1;
    Object localObject2;
    while (paramInt1 == 1) {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        w.i("MicroMsg.SelectConversationUI", "getIntent = " + getIntent());
        localObject2 = (Intent)getIntent().getParcelableExtra("Select_Conv_NextStep");
        if (localObject2 != null)
        {
          a(paramIntent, (Intent)localObject2);
          GMTrace.o(3020838404096L, 22507);
          return;
          w.i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
        }
        else
        {
          if ((this.xlx) || (this.wTR) || (this.xly) || (this.xlz) || (this.xlA))
          {
            m(paramIntent, (String)localObject1);
            GMTrace.o(3020838404096L, 22507);
            return;
          }
          e(-1, paramIntent);
          finish();
        }
      }
      else
      {
        GMTrace.o(3020838404096L, 22507);
        return;
      }
    }
    if (paramInt1 == 2)
    {
      switch (paramInt2)
      {
      }
      for (;;)
      {
        GMTrace.o(3020838404096L, 22507);
        return;
        finish();
        if ((paramIntent != null) && (paramIntent.getBooleanExtra("Select_stay_in_wx", false)))
        {
          paramIntent = new Intent(this, TaskRedirectUI.class);
          paramIntent.addFlags(268435456);
          startActivity(paramIntent);
          GMTrace.o(3020838404096L, 22507);
          return;
          if (paramIntent != null) {
            this.xlM = ((ReportUtil.ReportArgs)paramIntent.getParcelableExtra("Select_Report_Args"));
          }
        }
      }
    }
    if (paramInt1 == 3)
    {
      switch (paramInt2)
      {
      }
      for (;;)
      {
        GMTrace.o(3020838404096L, 22507);
        return;
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getStringExtra("received_card_name");
          if (!bg.nm(paramIntent))
          {
            localObject1 = new e.a(this.vKB.vKW);
            ((e.a)localObject1).bA(paramIntent);
            a((e.a)localObject1, this.xlG);
            {
              public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
              {
                GMTrace.i(3019496226816L, 22497);
                SelectConversationUI.this.aLo();
                Intent localIntent;
                if (paramAnonymousBoolean)
                {
                  localIntent = new Intent();
                  if (!paramIntent.endsWith("@chatroom")) {
                    break label92;
                  }
                  SelectConversationUI.c(localIntent, SelectConversationUI.g(SelectConversationUI.this), paramIntent);
                }
                for (;;)
                {
                  localIntent.putExtra("custom_send_text", paramAnonymousString);
                  SelectConversationUI.a(SelectConversationUI.this, localIntent);
                  SelectConversationUI.this.finish();
                  GMTrace.o(3019496226816L, 22497);
                  return;
                  label92:
                  SelectConversationUI.a(SelectConversationUI.this, localIntent, SelectConversationUI.g(SelectConversationUI.this), paramIntent);
                }
              }
            }.show();
          }
        }
      }
    }
    if (paramInt1 == 4)
    {
      if ((paramInt2 == -1) && (paramIntent != null)) {
        m(paramIntent, paramIntent.getStringExtra("Select_Contact"));
      }
      GMTrace.o(3020838404096L, 22507);
      return;
    }
    if (paramInt1 == 5)
    {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramIntent = paramIntent.getStringExtra("Select_Conv_User");
        localObject1 = this.xlL.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          this.mUn.OZ((String)localObject2);
        }
        if (!com.tencent.mm.platformtools.t.nm(paramIntent)) {
          this.xlL = com.tencent.mm.platformtools.t.g(paramIntent.split(","));
        }
        for (;;)
        {
          paramIntent = this.xlL.iterator();
          while (paramIntent.hasNext())
          {
            localObject1 = (String)paramIntent.next();
            this.mUn.aQ((String)localObject1, false);
          }
          this.xlL.clear();
        }
        Qe();
        cgy().notifyDataSetChanged();
      }
      GMTrace.o(3020838404096L, 22507);
      return;
    }
    w.e("MicroMsg.SelectConversationUI", "onActivityResult, unknown requestCode = " + paramInt1);
    GMTrace.o(3020838404096L, 22507);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(3020569968640L, 22505);
    super.aMX();
    GMTrace.o(3020569968640L, 22505);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3019764662272L, 22499);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("Select_App_Id");
    String str = getIntent().getStringExtra("Select_Open_Id");
    w.i("MicroMsg.SelectConversationUI", "onCreate, appId = " + paramBundle + ", openId = " + str);
    if ((!com.tencent.mm.platformtools.t.nm(paramBundle)) && (!com.tencent.mm.platformtools.t.nm(str))) {
      new com.tencent.mm.plugin.base.stub.d(this, paramBundle, str, new d.a()
      {
        public final void dl(boolean paramAnonymousBoolean)
        {
          GMTrace.i(3047681949696L, 22707);
          boolean bool = SelectConversationUI.this.isFinishing();
          w.i("MicroMsg.SelectConversationUI", "onCheckEnd, isPass = " + paramAnonymousBoolean + ", isFinishing = " + bool);
          if ((!paramAnonymousBoolean) && (!bool)) {
            SelectConversationUI.this.finish();
          }
          GMTrace.o(3047681949696L, 22707);
        }
      }).agL();
    }
    com.tencent.mm.pluginsdk.e.h(this);
    GMTrace.o(3019764662272L, 22499);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\transmit\SelectConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
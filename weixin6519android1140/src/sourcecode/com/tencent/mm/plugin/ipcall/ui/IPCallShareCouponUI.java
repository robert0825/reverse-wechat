package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.id;
import com.tencent.mm.plugin.ipcall.a.e.i;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.protocal.c.bqi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallShareCouponUI
  extends MMActivity
  implements com.tencent.mm.ad.e
{
  private String fLH;
  private String mTitle;
  private com.tencent.mm.sdk.b.c moI;
  private ProgressDialog moR;
  private RelativeLayout msK;
  private TextView msL;
  private ImageView msM;
  private RelativeLayout msN;
  private TextView msO;
  private ImageView msP;
  private LinearLayout msQ;
  private LinearLayout msR;
  private LinearLayout msS;
  private LinearLayout msT;
  private ImageView msU;
  private LinearLayout msV;
  private ImageView msW;
  private TextView msX;
  private TextView msY;
  private TextView msZ;
  private String msp;
  private String msq;
  private String msr;
  private String mss;
  private String mst;
  private String msu;
  private String msv;
  private String msw;
  private ImageView mta;
  private TextView mtb;
  private TextView mtc;
  private View mtd;
  private IPCallDynamicTextView mte;
  private com.tencent.mm.plugin.ipcall.a.e.b mtf;
  private LinkedList<bqi> mtg;
  private boolean mth;
  
  public IPCallShareCouponUI()
  {
    GMTrace.i(11644193210368L, 86756);
    this.mtf = new com.tencent.mm.plugin.ipcall.a.e.b();
    this.msp = null;
    this.fLH = null;
    this.msq = null;
    this.mTitle = null;
    this.msr = null;
    this.mss = null;
    this.mst = null;
    this.msu = null;
    this.msv = null;
    this.msw = null;
    this.mtg = null;
    this.moI = new com.tencent.mm.sdk.b.c() {};
    this.mth = false;
    GMTrace.o(11644193210368L, 86756);
  }
  
  private void a(afn paramafn)
  {
    GMTrace.i(11645401169920L, 86765);
    this.msp = paramafn.uve;
    this.fLH = paramafn.lPj;
    this.msq = paramafn.uvf;
    this.mTitle = paramafn.eBt;
    this.msr = paramafn.mmS;
    this.mss = paramafn.uvg;
    this.msu = paramafn.uvh;
    this.msv = paramafn.uvi;
    this.msw = paramafn.uvj;
    this.mtg = paramafn.uuS;
    GMTrace.o(11645401169920L, 86765);
  }
  
  private void anc()
  {
    GMTrace.i(11645132734464L, 86763);
    if (!bg.nm(this.msu))
    {
      if (this.mst == null)
      {
        this.mte.setValue(this.msu, this.msu);
        this.mst = this.msu;
      }
    }
    else
    {
      this.mtb.getText();
      this.mtb.setText(this.msv);
      if (!bg.nm(this.msv)) {
        break label189;
      }
      this.mtb.setVisibility(8);
    }
    StringBuffer localStringBuffer;
    for (;;)
    {
      localStringBuffer = new StringBuffer("");
      if ((this.mtg == null) || (this.mtg.size() <= 0)) {
        break label200;
      }
      Iterator localIterator = this.mtg.iterator();
      while (localIterator.hasNext())
      {
        bqi localbqi = (bqi)localIterator.next();
        if ((localbqi != null) && (!bg.nm(localbqi.vaw))) {
          localStringBuffer.append(localbqi.vaw).append('\n');
        }
      }
      this.mte.setValue(this.mst, this.msu);
      break;
      label189:
      this.mtb.setVisibility(0);
    }
    label200:
    if (!bg.nm(localStringBuffer.toString()))
    {
      if (localStringBuffer.charAt(localStringBuffer.length() - 1) == '\n') {
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      }
      this.mtc.setText(localStringBuffer.toString());
      this.mtc.setVisibility(0);
    }
    while ((this.mtb.getVisibility() == 0) && (this.mtc.getVisibility() == 0))
    {
      this.mtd.setVisibility(0);
      GMTrace.o(11645132734464L, 86763);
      return;
      this.mtc.setText("");
      this.mtc.setVisibility(8);
    }
    this.mtd.setVisibility(8);
    GMTrace.o(11645132734464L, 86763);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11644327428096L, 86757);
    GMTrace.o(11644327428096L, 86757);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11645266952192L, 86764);
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.g))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        a(((com.tencent.mm.plugin.ipcall.a.d.g)paramk).mlK);
        anc();
        if ((this.moR != null) && (this.moR.isShowing())) {
          this.moR.dismiss();
        }
        GMTrace.o(11645266952192L, 86764);
        return;
      }
      if ((this.moR != null) && (this.moR.isShowing()))
      {
        this.moR.dismiss();
        h.a(this.vKB.vKW, getString(R.l.dEq), getString(R.l.dEm), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19564381339648L, 145766);
            IPCallShareCouponUI.this.finish();
            GMTrace.o(19564381339648L, 145766);
          }
        });
      }
    }
    GMTrace.o(11645266952192L, 86764);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11644998516736L, 86762);
    int i = R.i.cAh;
    GMTrace.o(11644998516736L, 86762);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11644595863552L, 86759);
    super.onCreate(paramBundle);
    at.wS().a(257, this);
    com.tencent.mm.sdk.b.a.vgX.b(this.moI);
    oM(R.l.dFa);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11632382050304L, 86668);
        IPCallShareCouponUI.this.finish();
        GMTrace.o(11632382050304L, 86668);
        return true;
      }
    });
    this.vKB.bXE();
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19564112904192L, 145764);
        paramAnonymousMenuItem = com.tencent.mm.plugin.ipcall.b.c.aJI();
        int i;
        if ((paramAnonymousMenuItem != null) && (!bg.nm(paramAnonymousMenuItem.uvo))) {
          if (com.tencent.mm.k.g.ut().getInt("WCOWebPayListSwitch", 0) > 0)
          {
            i = 1;
            if (i == 0) {
              break label144;
            }
            i = 1;
            label46:
            if (i == 0) {
              break label149;
            }
            paramAnonymousMenuItem = new String[3];
            paramAnonymousMenuItem[0] = IPCallShareCouponUI.this.getString(R.l.dEZ);
            paramAnonymousMenuItem[1] = IPCallShareCouponUI.this.getString(R.l.dEn);
            paramAnonymousMenuItem[2] = IPCallShareCouponUI.this.getString(R.l.dDY);
            IPCallShareCouponUI.a(IPCallShareCouponUI.this, true);
          }
        }
        for (;;)
        {
          h.a(IPCallShareCouponUI.this.vKB.vKW, null, paramAnonymousMenuItem, null, false, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(19563710251008L, 145761);
              int i = paramAnonymous2Int;
              if (!IPCallShareCouponUI.h(IPCallShareCouponUI.this)) {
                i = paramAnonymous2Int + 1;
              }
              switch (i)
              {
              }
              for (;;)
              {
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.i(IPCallShareCouponUI.this);
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.d(IPCallShareCouponUI.this);
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.e(IPCallShareCouponUI.this);
              }
            }
          });
          GMTrace.o(19564112904192L, 145764);
          return true;
          i = 0;
          break;
          label144:
          i = 0;
          break label46;
          label149:
          paramAnonymousMenuItem = new String[2];
          paramAnonymousMenuItem[0] = IPCallShareCouponUI.this.getString(R.l.dEn);
          paramAnonymousMenuItem[1] = IPCallShareCouponUI.this.getString(R.l.dDY);
          IPCallShareCouponUI.a(IPCallShareCouponUI.this, false);
        }
      }
    });
    this.mte = ((IPCallDynamicTextView)findViewById(R.h.bgh));
    this.msK = ((RelativeLayout)findViewById(R.h.bXl));
    this.msL = ((TextView)findViewById(R.h.bXo));
    this.msM = ((ImageView)findViewById(R.h.bXm));
    at.AR();
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsf, Boolean.valueOf(false))).booleanValue()) {
      this.msM.setVisibility(0);
    }
    at.AR();
    paramBundle = (String)com.tencent.mm.y.c.xh().get(w.a.vse, "");
    this.msL.setText(paramBundle);
    this.msN = ((RelativeLayout)findViewById(R.h.bUE));
    this.msO = ((TextView)findViewById(R.h.bSP));
    this.msP = ((ImageView)findViewById(R.h.bSN));
    at.AR();
    paramBundle = (String)com.tencent.mm.y.c.xh().get(w.a.vsg, "");
    this.msO.setText(paramBundle);
    this.mtb = ((TextView)findViewById(R.h.bso));
    this.mtc = ((TextView)findViewById(R.h.bSM));
    this.mtd = findViewById(R.h.cfj);
    this.msQ = ((LinearLayout)findViewById(R.h.bxj));
    this.mta = ((ImageView)findViewById(R.h.bQa));
    at.AR();
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsh, Boolean.valueOf(false))).booleanValue()) {
      this.mta.setVisibility(0);
    }
    this.msX = ((TextView)findViewById(R.h.bRn));
    this.msY = ((TextView)findViewById(R.h.bdv));
    this.msZ = ((TextView)findViewById(R.h.cfX));
    this.msR = ((LinearLayout)findViewById(R.h.ceo));
    this.msS = ((LinearLayout)findViewById(R.h.bPl));
    this.msV = ((LinearLayout)findViewById(R.h.cbg));
    this.msW = ((ImageView)findViewById(R.h.cbh));
    this.msT = ((LinearLayout)findViewById(R.h.bOv));
    this.msU = ((ImageView)findViewById(R.h.bOw));
    at.AR();
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsn, Boolean.valueOf(false))).booleanValue()) {
      this.msU.setVisibility(0);
    }
    int i;
    label566:
    label594:
    label600:
    label621:
    label786:
    Object localObject1;
    Object localObject2;
    if (com.tencent.mm.plugin.ipcall.b.c.aJH())
    {
      i = 1;
      if (i != 0) {
        this.msK.setVisibility(8);
      }
      if ((com.tencent.mm.plugin.ipcall.b.c.aJH()) || (com.tencent.mm.k.g.ut().getInt("WCOPackagePurchaseSwitch", 0) == 0)) {
        break label1069;
      }
      i = 1;
      if (i != 0) {
        this.msN.setVisibility(0);
      }
      if (com.tencent.mm.k.g.ut().getInt("WCOAccountDetailSwitch", 0) != 1) {
        break label1074;
      }
      i = 1;
      if (i == 0) {
        break label1079;
      }
      i = 1;
      if (i != 0) {
        this.msQ.setVisibility(8);
      }
      if (!com.tencent.mm.plugin.ipcall.b.c.aJH()) {
        break label1084;
      }
      i = 1;
      if (i != 0) {
        this.msR.setVisibility(8);
      }
      this.msX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11690364108800L, 87100);
          IPCallShareCouponUI.d(IPCallShareCouponUI.this);
          GMTrace.o(11690364108800L, 87100);
        }
      });
      this.msY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11731434733568L, 87406);
          IPCallShareCouponUI.e(IPCallShareCouponUI.this);
          GMTrace.o(11731434733568L, 87406);
        }
      });
      this.msQ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11658822942720L, 86865);
          IPCallShareCouponUI.f(IPCallShareCouponUI.this);
          GMTrace.o(11658822942720L, 86865);
        }
      });
      this.msR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11668889272320L, 86940);
          com.tencent.mm.plugin.report.service.g.ork.i(13340, new Object[] { Integer.valueOf(1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vKB.vKW, IPCallShareCouponCardUI.class);
          IPCallShareCouponUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(11668889272320L, 86940);
        }
      });
      this.msT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11647817089024L, 86783);
          at.AR();
          if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsn, Boolean.valueOf(false))).booleanValue())
          {
            at.AR();
            i.E(4, -1, ((Integer)com.tencent.mm.y.c.xh().get(w.a.vso, Integer.valueOf(-1))).intValue());
          }
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vso, Integer.valueOf(-1));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsn, Boolean.valueOf(false));
          IPCallShareCouponUI.g(IPCallShareCouponUI.this).setVisibility(8);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vKB.vKW, IPCallMsgUI.class);
          IPCallShareCouponUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(11647817089024L, 86783);
        }
      });
      this.msS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11671305191424L, 86958);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vKB.vKW, IPCallMyGiftCardUI.class);
          IPCallShareCouponUI.this.vKB.vKW.startActivity(paramAnonymousView);
          GMTrace.o(11671305191424L, 86958);
        }
      });
      this.msK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11719489355776L, 87317);
          at.AR();
          if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsf, Boolean.valueOf(false))).booleanValue() == true) {
            i.E(3, -1, -1);
          }
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsf, Boolean.valueOf(false));
          IPCallShareCouponUI.a(IPCallShareCouponUI.this).setVisibility(8);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vKB.vKW, IPCallRechargeUI.class);
          IPCallShareCouponUI.this.startActivity(paramAnonymousView);
          GMTrace.o(11719489355776L, 87317);
        }
      });
      this.msN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15072248201216L, 112297);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vKB.vKW, IPCallPackageUI.class);
          IPCallShareCouponUI.this.startActivity(paramAnonymousView);
          GMTrace.o(15072248201216L, 112297);
        }
      });
      this.msV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16567702126592L, 123439);
          Intent localIntent = new Intent();
          paramAnonymousView = IPCallShareCouponUI.this.getString(R.l.dEG) + "&usedcc=";
          Object localObject = com.tencent.mm.plugin.ipcall.a.c.aIa().aId();
          int j;
          if ((localObject != null) && (((List)localObject).size() > 0))
          {
            j = ((List)localObject).size();
            int i = j;
            if (j > 5) {
              i = 5;
            }
            j = 0;
            if (j < i)
            {
              String str = com.tencent.mm.plugin.ipcall.b.a.AK(((Integer)((List)localObject).get(j)).toString());
              if (bg.nm(str)) {
                break label246;
              }
              paramAnonymousView = paramAnonymousView + str + "|";
            }
          }
          label246:
          for (;;)
          {
            j += 1;
            break;
            localObject = paramAnonymousView;
            if (paramAnonymousView.endsWith("|")) {}
            for (localObject = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);; localObject = paramAnonymousView + com.tencent.mm.plugin.ipcall.b.a.AK(com.tencent.mm.plugin.ipcall.b.c.aJG()))
            {
              localIntent.putExtra("rawUrl", (String)localObject);
              localIntent.putExtra("showShare", false);
              d.b(IPCallShareCouponUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(16567702126592L, 123439);
              return;
            }
          }
        }
      });
      paramBundle = com.tencent.mm.plugin.ipcall.b.c.aJI();
      if (paramBundle == null) {
        break label1119;
      }
      a(paramBundle);
      anc();
      if (!com.tencent.mm.plugin.ipcall.b.c.aJH()) {
        break label1194;
      }
      paramBundle = getString(R.l.dFO);
      localObject1 = getString(R.l.dFN);
      localObject2 = paramBundle + (String)localObject1;
      localObject1 = new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19563844468736L, 145762);
          ((TextView)paramAnonymousView).setHighlightColor(IPCallShareCouponUI.this.getResources().getColor(R.e.transparent));
          paramAnonymousView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice";
          Object localObject = v.eq(ab.getContext());
          if (!bg.nm((String)localObject)) {
            paramAnonymousView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice" + "&wechat_real_lang=" + (String)localObject;
          }
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousView);
          ((Intent)localObject).putExtra("showShare", false);
          d.b(IPCallShareCouponUI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          GMTrace.o(19563844468736L, 145762);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(19563978686464L, 145763);
          paramAnonymousTextPaint.setColor(IPCallShareCouponUI.this.getResources().getColor(R.e.aOm));
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(19563978686464L, 145763);
        }
      };
      localObject2 = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject2);
      i = paramBundle.length();
      int j = ((Spannable)localObject2).length();
      if ((i < 0) || (i >= j) || (j < 0) || (j > ((Spannable)localObject2).length())) {
        break label1172;
      }
      ((Spannable)localObject2).setSpan(localObject1, i, j, 33);
      label900:
      this.msZ.setText((CharSequence)localObject2);
      this.msZ.setMovementMethod(LinkMovementMethod.getInstance());
      this.msZ.setVisibility(0);
    }
    for (;;)
    {
      paramBundle = (LinearLayout)findViewById(R.h.bJM);
      if ((paramBundle != null) && (this.msK.getVisibility() == 8) && (this.msN.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      paramBundle = (LinearLayout)findViewById(R.h.bJN);
      if ((paramBundle != null) && (this.msR.getVisibility() == 8) && (this.msS.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      this.mtf.start();
      GMTrace.o(11644595863552L, 86759);
      return;
      if (com.tencent.mm.k.g.ut().getInt("WCOPurchaseSwitch", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1064;
        }
        i = 1;
        break;
      }
      label1064:
      i = 0;
      break;
      label1069:
      i = 0;
      break label566;
      label1074:
      i = 0;
      break label594;
      label1079:
      i = 0;
      break label600;
      label1084:
      if (com.tencent.mm.k.g.ut().getInt("WCOInviteFriend", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1114;
        }
        i = 1;
        break;
      }
      label1114:
      i = 0;
      break label621;
      label1119:
      this.mte.setText("0");
      paramBundle = this.vKB.vKW;
      getString(R.l.cUG);
      this.moR = h.a(paramBundle, getString(R.l.dEs), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16567970562048L, 123441);
          try
          {
            IPCallShareCouponUI.this.finish();
            GMTrace.o(16567970562048L, 123441);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            w.e("MicroMsg.IPCallShareCouponUI", "IPCallShareCouponUI error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
            GMTrace.o(16567970562048L, 123441);
          }
        }
      });
      break label786;
      label1172:
      ((Spannable)localObject2).setSpan(localObject1, 0, ((Spannable)localObject2).length(), 33);
      break label900;
      label1194:
      this.msZ.setVisibility(8);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11644864299008L, 86761);
    super.onDestroy();
    at.wS().b(257, this);
    com.tencent.mm.sdk.b.a.vgX.c(this.moI);
    this.mtf.mmc = System.currentTimeMillis();
    this.mtf.finish();
    GMTrace.o(11644864299008L, 86761);
  }
  
  protected void onResume()
  {
    GMTrace.i(11644730081280L, 86760);
    super.onResume();
    com.tencent.mm.plugin.ipcall.a.f.b.aIT().fs(false);
    GMTrace.o(11644730081280L, 86760);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallShareCouponUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
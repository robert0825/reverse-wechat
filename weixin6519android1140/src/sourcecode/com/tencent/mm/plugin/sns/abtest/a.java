package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.a.gd;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.SnsNotInterestUI;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.a.g;
import java.util.Arrays;

public final class a
{
  public static Context context;
  private static boolean plL;
  private static String plM;
  private static View.OnClickListener plN;
  public static int plO;
  private static int plP;
  public static long plQ;
  private static View plR;
  private static b plS;
  private static NotInterestMenu.c plT;
  private static com.tencent.mm.sdk.b.c plU;
  private static com.tencent.mm.sdk.b.c plV;
  
  static
  {
    GMTrace.i(8877428965376L, 66142);
    plL = false;
    plM = "0";
    plN = null;
    plO = -1;
    plP = -1;
    plQ = 0L;
    plR = null;
    plS = null;
    plT = null;
    context = null;
    plU = new com.tencent.mm.sdk.b.c() {};
    plV = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(8877428965376L, 66142);
  }
  
  public static void a(Context paramContext, m paramm)
  {
    int i = 2;
    GMTrace.i(8875818352640L, 66130);
    Intent localIntent;
    if ((plL) && (paramm != null) && (paramContext != null))
    {
      plQ = paramm.field_snsId;
      a(paramm);
      localIntent = new Intent(paramContext, SnsNotInterestUI.class);
      localIntent.putExtra("sns_info_svr_id", plQ);
      if ((!plL) || (bg.nm(plM))) {
        break label161;
      }
      if ((!plM.equals("1")) && (!plM.equals("2"))) {
        break label117;
      }
      i = 1;
    }
    for (;;)
    {
      localIntent.putExtra("sns_info_not_interest_scene", i);
      paramContext.startActivity(localIntent);
      GMTrace.o(8875818352640L, 66130);
      return;
      label117:
      if (plM.equals("3"))
      {
        if (i.f(paramm)) {
          i = 4;
        } else if (paramm.field_type == 1) {
          i = 3;
        } else if (paramm.field_type == 2) {}
      }
      else {
        label161:
        i = 0;
      }
    }
  }
  
  public static void a(ContextMenu paramContextMenu, m paramm)
  {
    GMTrace.i(8875952570368L, 66131);
    if ((plL) && (plM.equals("3")) && (paramm != null) && (!paramm.uX(32)) && (!paramm.field_userName.equals(ae.biJ())) && (paramm.field_type != 15)) {
      paramContextMenu.add(0, 13, 0, i.j.pjx);
    }
    GMTrace.o(8875952570368L, 66131);
  }
  
  public static void a(View paramView, Context paramContext, m paramm)
  {
    GMTrace.i(16047205777408L, 119561);
    if (paramContext == null)
    {
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    if (paramm != null) {
      plQ = paramm.field_snsId;
    }
    b localb = plS;
    if ((paramView == null) || (localb.pmr))
    {
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    bq localbq = new bq();
    com.tencent.mm.sdk.b.a.vgX.m(localbq);
    if (localb.pmp)
    {
      localb.bhB();
      GMTrace.o(16047205777408L, 119561);
      return;
    }
    if (localb.iDc == 0) {
      localb.iDc = com.tencent.mm.pluginsdk.e.dH(paramContext);
    }
    if (localb.LQ == 0) {
      localb.LQ = com.tencent.mm.pluginsdk.e.dG(paramContext);
    }
    if (localb.pmk == 0)
    {
      localb.pmk = paramView.getMeasuredHeight();
      if (localb.pmk <= 0) {
        localb.pmk = com.tencent.mm.br.a.fromDPToPix(paramContext, 15);
      }
    }
    if (localb.pml <= 0) {
      localb.pml = com.tencent.mm.br.a.fromDPToPix(paramContext, 8);
    }
    if (localb.pmm <= 0) {
      localb.pmm = com.tencent.mm.br.a.fromDPToPix(paramContext, 3);
    }
    if (localb.mScreenHeight == 0)
    {
      localb.mScreenHeight = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getHeight();
      localb.mScreenHeight -= localb.LQ;
      localb.mScreenHeight -= localb.iDc;
    }
    if (localb.pmn == 0) {
      localb.pmn = com.tencent.mm.br.a.fromDPToPix(paramContext, 150);
    }
    if (localb.pmo == 0) {
      localb.pmo = com.tencent.mm.br.a.fromDPToPix(paramContext, 13);
    }
    localb.pmd = new NotInterestMenu(paramContext);
    if (localb.plY != null) {
      localb.pmd.plY = localb.plY;
    }
    localb.pmd.plZ = localb.pmf;
    localb.pmd.oWL = paramm;
    paramm = new int[2];
    paramView.getLocationInWindow(paramm);
    w.d("MicroMsg.NotInterestMenuHelper", "hateLocation: %s", new Object[] { Arrays.toString(paramm) });
    int i = paramm[1];
    int j = i - localb.iDc - localb.LQ + localb.pmk - localb.pml;
    w.d("MicroMsg.NotInterestMenuHelper", "getDownModeMenuYCoord, hateClickViewYCoord:%d, y:%d, mStatusBarHeight:%d, actionBarHeight:%d, hateClickViewHeight:%d, mHateClickDownPadding:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localb.iDc), Integer.valueOf(localb.LQ), Integer.valueOf(localb.pmk), Integer.valueOf(localb.pml) });
    w.d("MicroMsg.NotInterestMenuHelper", "isEnoughHeightToDownMenu, y:%d, menuHeight:%d, screenHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(localb.pmn), Integer.valueOf(localb.mScreenHeight) });
    if (localb.pmn + j > localb.mScreenHeight)
    {
      i = 0;
      if (i == 0) {
        break label750;
      }
      localb.pmd.setBackgroundResource(i.e.oXV);
      localb.pms = true;
      i = j;
    }
    for (;;)
    {
      if (localb.pmq == null)
      {
        localb.pmq = new AbsoluteLayout(paramContext);
        paramView = new FrameLayout.LayoutParams(-1, -1);
        localb.pmq.setBackgroundDrawable(paramContext.getResources().getDrawable(i.e.oXA));
        localb.pmq.setPadding(localb.pmo, 0, localb.pmo, 0);
        localb.pmq.setLayoutParams(paramView);
      }
      if (localb.pme != null) {
        localb.pme.addView(localb.pmq);
      }
      paramView = new AbsoluteLayout.LayoutParams(-1, -2, 0, i);
      localb.pmq.addView(localb.pmd, paramView);
      localb.pmd.setVisibility(4);
      if (!localb.pms) {
        break label887;
      }
      localb.pmd.startAnimation(localb.pmg);
      GMTrace.o(16047205777408L, 119561);
      return;
      i = 1;
      break;
      label750:
      localb.pmd.setBackgroundResource(i.e.oXW);
      j = paramm[1];
      i = j - localb.iDc - localb.LQ - localb.pmn + localb.pmm;
      w.d("MicroMsg.NotInterestMenuHelper", "getUpModeMenuYCoord, hateClickViewYCoord:%d, y:%d, mStatusBarHeight:%d, actionBarHeight:%d, hateClickViewHeight:%d, mHateClickUpPadding:%d, mMenuHeight:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localb.iDc), Integer.valueOf(localb.LQ), Integer.valueOf(localb.pmk), Integer.valueOf(localb.pmm), Integer.valueOf(localb.pmn) });
      localb.pms = false;
    }
    label887:
    localb.pmd.startAnimation(localb.pmh);
    GMTrace.o(16047205777408L, 119561);
  }
  
  public static void a(View paramView, a.c paramc)
  {
    GMTrace.i(8876086788096L, 66132);
    if ((plL) && (!bg.nm(plM)) && (!plM.equals("0")))
    {
      paramc.qlS = ((ImageView)paramView.findViewById(i.f.pcW));
      paramc.qlS.setVisibility(8);
      paramc.qlT = false;
      if (!plM.equals("3")) {
        paramc.qlS.setOnClickListener(plN);
      }
    }
    GMTrace.o(8876086788096L, 66132);
  }
  
  private static void a(m paramm)
  {
    GMTrace.i(8875684134912L, 66129);
    boolean bool = plM.equals("3");
    if (paramm.field_type == 1)
    {
      if (bool)
      {
        plP = 5;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      plP = 0;
      GMTrace.o(8875684134912L, 66129);
      return;
    }
    if (paramm.field_type == 2)
    {
      if (bool)
      {
        plP = 4;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      plP = 1;
      GMTrace.o(8875684134912L, 66129);
      return;
    }
    if (paramm.field_type == 15)
    {
      if (!bool)
      {
        plP = 2;
        GMTrace.o(8875684134912L, 66129);
      }
    }
    else if (i.f(paramm))
    {
      if (bool)
      {
        plP = 6;
        GMTrace.o(8875684134912L, 66129);
        return;
      }
      plP = 3;
    }
    GMTrace.o(8875684134912L, 66129);
  }
  
  public static void b(Context paramContext, m paramm)
  {
    GMTrace.i(16047339995136L, 119562);
    if ((paramm != null) && (paramContext != null))
    {
      a(paramm);
      String str = paramm.field_userName;
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_permission_userName", str);
      localIntent.putExtra("sns_permission_snsinfo_svr_id", paramm.field_snsId);
      localIntent.putExtra("sns_permission_block_scene", 6);
      localIntent.setClass(paramContext, SnsPermissionUI.class);
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(16047339995136L, 119562);
  }
  
  public static void b(m paramm)
  {
    GMTrace.i(8876221005824L, 66133);
    if (plL)
    {
      plQ = paramm.field_snsId;
      a(paramm);
    }
    GMTrace.o(8876221005824L, 66133);
  }
  
  public static void bhx()
  {
    GMTrace.i(8875549917184L, 66128);
    if (plS != null) {
      plS.bhB();
    }
    GMTrace.o(8875549917184L, 66128);
  }
  
  public static void bhy()
  {
    GMTrace.i(16047608430592L, 119564);
    if ((plL) && (plQ != 0L))
    {
      String str = plO + "|" + plP + "|" + plQ;
      g.BY().hb("7").gpK = 4L;
      g.BY().hb("7").result = str;
      f.a(g.BY().hb("7"));
      w.d("MicroMsg.NotInteresetABTestManager", "report not interest abtest, scene:%d, result:%s", new Object[] { Integer.valueOf(4), str });
    }
    plP = -1;
    plO = -1;
    plQ = 0L;
    GMTrace.o(16047608430592L, 119564);
  }
  
  public static void c(Context paramContext, m paramm)
  {
    GMTrace.i(16047474212864L, 119563);
    Intent localIntent;
    long l;
    if ((paramm != null) && (paramContext != null))
    {
      a(paramm);
      localIntent = new Intent();
      w.i("MicroMsg.NotInteresetABTestManager", "expose id " + paramm.blE());
      localIntent.putExtra("showShare", false);
      if (paramm != null) {
        break label149;
      }
      l = 0L;
      localIntent.putExtra("k_expose_msg_id", l);
      if (paramm != null) {
        break label157;
      }
    }
    label149:
    label157:
    for (paramm = "";; paramm = paramm.field_userName)
    {
      localIntent.putExtra("k_username", paramm);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(16047474212864L, 119563);
      return;
      l = paramm.field_snsId;
      break;
    }
  }
  
  public static void clean()
  {
    GMTrace.i(8876355223552L, 66134);
    plP = -1;
    plO = -1;
    plQ = 0L;
    plN = null;
    plT = null;
    plR = null;
    context = null;
    plL = false;
    plM = "0";
    f.hg("7");
    com.tencent.mm.sdk.b.a.vgX.c(plU);
    com.tencent.mm.sdk.b.a.vgX.c(plV);
    GMTrace.o(8876355223552L, 66134);
  }
  
  public static void d(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(8875415699456L, 66127);
    if (g.BY().hb("7") != null)
    {
      plL = true;
      plM = g.BY().hb("7").value;
      w.d("MicroMsg.NotInteresetABTestManager", "start not interest abtest, testStyle:%s", new Object[] { plM });
      plR = paramViewGroup;
      plS = new b(paramViewGroup);
      context = paramContext;
      com.tencent.mm.sdk.b.a.vgX.b(plU);
      com.tencent.mm.sdk.b.a.vgX.b(plV);
      plN = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8870449643520L, 66090);
          if ((paramAnonymousView.getTag() instanceof m))
          {
            m localm = (m)paramAnonymousView.getTag();
            a.a(paramAnonymousView, paramAnonymousView.getContext(), localm);
          }
          GMTrace.o(8870449643520L, 66090);
        }
      };
      plT = new NotInterestMenu.c()
      {
        public final void c(m paramAnonymousm)
        {
          GMTrace.i(8878234271744L, 66148);
          a.a(a.context, paramAnonymousm);
          GMTrace.o(8878234271744L, 66148);
        }
        
        public final void d(m paramAnonymousm)
        {
          GMTrace.i(8878368489472L, 66149);
          a.b(a.context, paramAnonymousm);
          GMTrace.o(8878368489472L, 66149);
        }
        
        public final void e(m paramAnonymousm)
        {
          GMTrace.i(8878502707200L, 66150);
          a.c(a.context, paramAnonymousm);
          GMTrace.o(8878502707200L, 66150);
        }
      };
      plS.plY = plT;
    }
    GMTrace.o(8875415699456L, 66127);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\abtest\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
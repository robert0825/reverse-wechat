package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.ui.base.MMFlipper.a;
import com.tencent.mm.ui.base.MMFlipper.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AppPanel
  extends LinearLayout
{
  private static int ozq;
  private static int ozr;
  private static boolean tyM;
  Context context;
  private SharedPreferences ghC;
  private boolean isInit;
  private boolean ozB;
  private int ozC;
  private int ozD;
  public MMFlipper ozE;
  private MMDotView ozF;
  int tyA;
  private boolean tyB;
  private boolean tyC;
  private boolean tyD;
  private boolean tyE;
  boolean tyF;
  boolean tyG;
  boolean tyH;
  private Map<String, f> tyI;
  private boolean tyJ;
  private final int tyK;
  private AppGrid.b tyL;
  boolean tyN;
  private int tyO;
  private int tyh;
  private List<f> tyk;
  private final boolean[] tys;
  a tyt;
  b tyu;
  private List<AppGrid> tyv;
  private int tyw;
  public a tyx;
  private int tyy;
  private int tyz;
  
  static
  {
    GMTrace.i(976970842112L, 7279);
    ozq = 215;
    ozr = 158;
    tyM = false;
    GMTrace.o(976970842112L, 7279);
  }
  
  public AppPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(972139003904L, 7243);
    this.tys = new boolean[16];
    this.ozB = false;
    this.tyh = 16;
    this.tyw = this.tyh;
    this.isInit = false;
    this.tyy = 0;
    this.tyz = 0;
    this.tyA = 0;
    this.tyB = false;
    this.tyC = false;
    this.tyD = false;
    this.tyE = false;
    this.tyF = false;
    this.tyG = false;
    this.tyH = false;
    this.tyI = null;
    this.tyJ = true;
    this.tyk = new LinkedList();
    this.tyK = 2;
    this.tyL = new AppGrid.b()
    {
      public final void a(int paramAnonymousInt, f paramAnonymousf)
      {
        int i = 0;
        GMTrace.i(1018846773248L, 7591);
        boolean bool1;
        Object localObject;
        if (paramAnonymousf != null)
        {
          bool1 = true;
          w.d("MicroMsg.AppPanel", "pos=%d, has appInfo = %b", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(bool1) });
          if ((paramAnonymousf != null) && (com.tencent.mm.pluginsdk.model.app.g.j(paramAnonymousf)))
          {
            localObject = paramAnonymousf.field_appId;
            HashMap localHashMap = new HashMap();
            q.b(327682, localHashMap);
            localHashMap.put(localObject, "1");
            q.a(327682, localHashMap);
          }
          switch (paramAnonymousInt)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(1018846773248L, 7591);
          return;
          bool1 = false;
          break;
          if (AppPanel.j(AppPanel.this) == null)
          {
            w.e("MicroMsg.AppPanel", "infoList == null");
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.A(10305, String.valueOf(AppPanel.j(AppPanel.this).size()));
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(10) });
          com.tencent.mm.kernel.h.xy().xh().set(69121, "");
          AppPanel.k(AppPanel.this).aNQ();
          GMTrace.o(1018846773248L, 7591);
          return;
          localObject = paramAnonymousf;
          if (paramAnonymousf == null) {
            localObject = (f)AppPanel.l(AppPanel.this).get(f.tnG);
          }
          at.AR();
          paramAnonymousInt = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vut, Integer.valueOf(0))).intValue();
          at.AR();
          paramAnonymousf = bg.g(((String)com.tencent.mm.y.c.xh().get(w.a.vwk, "")).split(";"));
          if (!paramAnonymousf.contains(String.valueOf(paramAnonymousInt)))
          {
            paramAnonymousf.add(String.valueOf(paramAnonymousInt));
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vwk, bg.c(paramAnonymousf, ";"));
            AppPanel.this.refresh();
          }
          at.AR();
          com.tencent.mm.y.c.xh().set(80, Boolean.valueOf(false));
          AppPanel.k(AppPanel.this).b((f)localObject);
          GMTrace.o(1018846773248L, 7591);
          return;
          if (!AppPanel.this.tyx.tza.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          if (paramAnonymousf == null)
          {
            w.e("MicroMsg.AppPanel", "APP_MSG_POS bug appInfo is null");
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          if ((paramAnonymousf.bJt()) || (paramAnonymousf.bJv()))
          {
            if (AppPanel.m(AppPanel.this) == null) {
              AppPanel.a(AppPanel.this, AppPanel.i(AppPanel.this).getSharedPreferences(ab.bPU(), 0));
            }
            if (AppPanel.m(AppPanel.this).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, true)) {
              AppPanel.m(AppPanel.this).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, false).commit();
            }
            if (paramAnonymousf.bJv()) {
              com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(16), paramAnonymousf.field_appId, Integer.valueOf(0) });
            }
            com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(13), paramAnonymousf.field_appId, Integer.valueOf(0) });
          }
          for (;;)
          {
            AppPanel.k(AppPanel.this).b(paramAnonymousf);
            GMTrace.o(1018846773248L, 7591);
            return;
            com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(11), paramAnonymousf.field_appId });
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(14) });
          paramAnonymousf = AppPanel.k(AppPanel.this);
          if (AppPanel.this.tyx.tzj.value) {}
          for (paramAnonymousInt = i;; paramAnonymousInt = 2)
          {
            paramAnonymousf.qn(paramAnonymousInt);
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          if (!AppPanel.this.tyx.tyU.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(4) });
          AppPanel.k(AppPanel.this).aNP();
          GMTrace.o(1018846773248L, 7591);
          return;
          if (!AppPanel.this.tyx.tzk.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          if (paramAnonymousf == null)
          {
            localObject = (f)AppPanel.l(AppPanel.this).get(f.tnI);
            paramAnonymousf = (f)localObject;
            if (localObject == null)
            {
              GMTrace.o(1018846773248L, 7591);
              return;
            }
          }
          if ((paramAnonymousf.bJt()) || (paramAnonymousf.bJv()))
          {
            if (AppPanel.m(AppPanel.this) == null) {
              AppPanel.a(AppPanel.this, AppPanel.i(AppPanel.this).getSharedPreferences(ab.bPU(), 0));
            }
            if (AppPanel.m(AppPanel.this).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, true)) {
              AppPanel.m(AppPanel.this).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, false).commit();
            }
            com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(13), paramAnonymousf.field_appId, Integer.valueOf(0) });
          }
          for (;;)
          {
            at.AR();
            paramAnonymousInt = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vut, Integer.valueOf(0))).intValue();
            at.AR();
            paramAnonymousf = bg.g(((String)com.tencent.mm.y.c.xh().get(w.a.vwl, "")).split(";"));
            if (!paramAnonymousf.contains(String.valueOf(paramAnonymousInt)))
            {
              paramAnonymousf.add(String.valueOf(paramAnonymousInt));
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vwl, bg.c(paramAnonymousf, ";"));
              AppPanel.this.refresh();
            }
            AppPanel.k(AppPanel.this).aNU();
            GMTrace.o(1018846773248L, 7591);
            return;
            com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(11), paramAnonymousf.field_appId });
          }
          if ((!AppPanel.this.tyx.tzg.value) || (!AppPanel.this.tyx.tzh.value))
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          at.AR();
          if (((Boolean)com.tencent.mm.y.c.xh().get(290817, Boolean.valueOf(true))).booleanValue())
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(290817, Boolean.valueOf(false));
            AppPanel.this.refresh();
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(3) });
          AppPanel.k(AppPanel.this).aNO();
          GMTrace.o(1018846773248L, 7591);
          return;
          if (!AppPanel.this.tyx.tyY.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          at.AR();
          if (((Boolean)com.tencent.mm.y.c.xh().get(327744, Boolean.valueOf(true))).booleanValue())
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(327744, Boolean.valueOf(false));
            AppPanel.this.refresh();
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(12) });
          AppPanel.k(AppPanel.this).aNS();
          GMTrace.o(1018846773248L, 7591);
          return;
          if (!AppPanel.this.tyx.tyT.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(1) });
          AppPanel.a(AppPanel.this, false);
          GMTrace.o(1018846773248L, 7591);
          return;
          if (!AppPanel.this.tyx.tyW.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018846773248L, 7591);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(8) });
          at.AR();
          com.tencent.mm.y.c.xh().set(54, Boolean.valueOf(false));
          if (AppPanel.k(AppPanel.this) != null)
          {
            paramAnonymousf = new rb();
            paramAnonymousf.eVS.eVU = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousf);
            paramAnonymousf = paramAnonymousf.eVT.eVW;
            if (!bg.nm(paramAnonymousf))
            {
              w.v("MicroMsg.AppPanel", "Talkroom is on: " + paramAnonymousf);
              com.tencent.mm.ui.base.h.a(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.edN), "", AppPanel.i(AppPanel.this).getString(R.l.cTM), AppPanel.i(AppPanel.this).getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(979789414400L, 7300);
                  rb localrb = new rb();
                  localrb.eVS.eVV = true;
                  com.tencent.mm.sdk.b.a.vgX.m(localrb);
                  AppPanel.k(AppPanel.this).aNL();
                  paramAnonymous2DialogInterface.dismiss();
                  GMTrace.o(979789414400L, 7300);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(997774589952L, 7434);
                  paramAnonymous2DialogInterface.dismiss();
                  GMTrace.o(997774589952L, 7434);
                }
              });
              GMTrace.o(1018846773248L, 7591);
              return;
            }
            AppPanel.k(AppPanel.this).aNL();
            GMTrace.o(1018846773248L, 7591);
            return;
            if (!AppPanel.this.tyx.tzc.value)
            {
              Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
              GMTrace.o(1018846773248L, 7591);
              return;
            }
            com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(7) });
            at.AR();
            com.tencent.mm.y.c.xh().set(62, Boolean.valueOf(false));
            paramAnonymousf = new rb();
            paramAnonymousf.eVS.eVU = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousf);
            paramAnonymousf = paramAnonymousf.eVT.eVW;
            if (!bg.nm(paramAnonymousf))
            {
              w.v("MicroMsg.AppPanel", "Talkroom is on: " + paramAnonymousf);
              com.tencent.mm.ui.base.h.a(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.edN), "", AppPanel.i(AppPanel.this).getString(R.l.cTM), AppPanel.i(AppPanel.this).getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(977910366208L, 7286);
                  rb localrb = new rb();
                  localrb.eVS.eVV = true;
                  com.tencent.mm.sdk.b.a.vgX.m(localrb);
                  AppPanel.k(AppPanel.this).aNM();
                  paramAnonymous2DialogInterface.dismiss();
                  GMTrace.o(977910366208L, 7286);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(1026899836928L, 7651);
                  paramAnonymous2DialogInterface.dismiss();
                  GMTrace.o(1026899836928L, 7651);
                }
              });
              GMTrace.o(1018846773248L, 7591);
              return;
            }
            AppPanel.k(AppPanel.this).aNM();
            GMTrace.o(1018846773248L, 7591);
            return;
            if (AppPanel.k(AppPanel.this) != null)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(6) });
              at.AR();
              com.tencent.mm.y.c.xh().set(67, Boolean.valueOf(false));
              AppPanel.k(AppPanel.this).aNN();
              GMTrace.o(1018846773248L, 7591);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(9) });
              at.AR();
              com.tencent.mm.y.c.xh().set(73, Boolean.valueOf(false));
              AppPanel.n(AppPanel.this).bLX();
              GMTrace.o(1018846773248L, 7591);
              return;
              if (!AppPanel.this.tyx.tyV.value)
              {
                Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
                GMTrace.o(1018846773248L, 7591);
                return;
              }
              com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(5) });
              if (AppPanel.k(AppPanel.this) != null)
              {
                AppPanel.k(AppPanel.this).aNR();
                GMTrace.o(1018846773248L, 7591);
                return;
                if (!AppPanel.this.tyx.tzi.value)
                {
                  Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
                  GMTrace.o(1018846773248L, 7591);
                  return;
                }
                if (AppPanel.k(AppPanel.this) != null) {
                  AppPanel.k(AppPanel.this).aNT();
                }
                com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(15) });
                at.AR();
                bool1 = ((Boolean)com.tencent.mm.y.c.xh().get(208899, Boolean.valueOf(false))).booleanValue();
                at.AR();
                boolean bool2 = ((Boolean)com.tencent.mm.y.c.xh().get(208913, Boolean.valueOf(false))).booleanValue();
                if (bool1)
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(11594, new Object[] { Integer.valueOf(3) });
                  GMTrace.o(1018846773248L, 7591);
                  return;
                }
                if (bool2)
                {
                  com.tencent.mm.plugin.report.service.g.ork.i(11594, new Object[] { Integer.valueOf(4) });
                  GMTrace.o(1018846773248L, 7591);
                  return;
                  if (AppPanel.k(AppPanel.this) != null)
                  {
                    AppPanel.k(AppPanel.this).aNV();
                    GMTrace.o(1018846773248L, 7591);
                    return;
                    if (!AppPanel.this.tyx.tzm.value)
                    {
                      Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
                      GMTrace.o(1018846773248L, 7591);
                      return;
                    }
                    AppPanel.k(AppPanel.this).aNW();
                    GMTrace.o(1018846773248L, 7591);
                    return;
                    if (AppPanel.k(AppPanel.this) != null)
                    {
                      if (paramAnonymousf == null)
                      {
                        localObject = (f)AppPanel.l(AppPanel.this).get(f.tnJ);
                        paramAnonymousf = (f)localObject;
                        if (localObject == null)
                        {
                          w.i("MicroMsg.AppPanel", "empty info");
                          GMTrace.o(1018846773248L, 7591);
                          return;
                        }
                      }
                      if ((paramAnonymousf.bJt()) || (paramAnonymousf.bJv()))
                      {
                        if (AppPanel.m(AppPanel.this) == null) {
                          AppPanel.a(AppPanel.this, AppPanel.i(AppPanel.this).getSharedPreferences(ab.bPU(), 0));
                        }
                        if (AppPanel.m(AppPanel.this).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, true)) {
                          AppPanel.m(AppPanel.this).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramAnonymousf.field_appId, false).commit();
                        }
                      }
                      AppPanel.k(AppPanel.this).aNX();
                    }
                  }
                }
              }
            }
          }
        }
      }
      
      public final int zn(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(1018578337792L, 7589);
        if (paramAnonymousInt < AppPanel.f(AppPanel.this))
        {
          int m = AppPanel.g(AppPanel.this).length;
          int k;
          for (int j = 0; i < m; j = k)
          {
            k = j;
            if (AppPanel.g(AppPanel.this)[i] != 0)
            {
              if (j == paramAnonymousInt)
              {
                GMTrace.o(1018578337792L, 7589);
                return i;
              }
              k = j + 1;
            }
            i += 1;
          }
        }
        if ((paramAnonymousInt >= AppPanel.f(AppPanel.this)) && (paramAnonymousInt < AppPanel.h(AppPanel.this)))
        {
          GMTrace.o(1018578337792L, 7589);
          return Integer.MIN_VALUE;
        }
        GMTrace.o(1018578337792L, 7589);
        return Integer.MAX_VALUE;
      }
      
      public final void zo(int paramAnonymousInt)
      {
        GMTrace.i(1018712555520L, 7590);
        if (paramAnonymousInt == 0)
        {
          if (!AppPanel.this.tyx.tyT.value)
          {
            Toast.makeText(AppPanel.i(AppPanel.this), AppPanel.i(AppPanel.this).getString(R.l.dgC), 0).show();
            GMTrace.o(1018712555520L, 7590);
            return;
          }
          AppPanel.a(AppPanel.this, true);
          GMTrace.o(1018712555520L, 7590);
          return;
        }
        GMTrace.o(1018712555520L, 7590);
      }
    };
    this.tyN = true;
    this.tyO = -1;
    this.context = paramContext;
    GMTrace.o(972139003904L, 7243);
  }
  
  private int bLR()
  {
    GMTrace.i(973078528000L, 7250);
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight()) {}
    for (int i = 1;; i = 2)
    {
      GMTrace.o(973078528000L, 7250);
      return i;
    }
  }
  
  private void bLS()
  {
    GMTrace.i(973212745728L, 7251);
    w.d("MicroMsg.AppPanel", "AppPanel initFlipper");
    this.ozE.removeAllViews();
    this.ozE.wbJ = new MMFlipper.a()
    {
      public final void cQ(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(977641930752L, 7284);
        w.d("MicroMsg.AppPanel", "onMeasure width:" + paramAnonymousInt1 + " height:" + paramAnonymousInt2 + " isMeasured:" + AppPanel.a(AppPanel.this));
        if ((AppPanel.a(AppPanel.this)) || (paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
        {
          if ((paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0)) {
            w.d("MicroMsg.AppPanel", "onMeasure, width or height is 0");
          }
          GMTrace.o(977641930752L, 7284);
          return;
        }
        if (AppPanel.b(AppPanel.this) == 2) {
          w.d("MicroMsg.AppPanel", "landspace");
        }
        for (;;)
        {
          AppPanel.c(AppPanel.this);
          AppPanel.a(AppPanel.this, paramAnonymousInt2);
          AppPanel.b(AppPanel.this, paramAnonymousInt1);
          AppPanel.d(AppPanel.this);
          GMTrace.o(977641930752L, 7284);
          return;
          w.d("MicroMsg.AppPanel", "portrait");
        }
      }
    };
    this.ozE.wbI = new MMFlipper.b()
    {
      public final void tz(int paramAnonymousInt)
      {
        GMTrace.i(997506154496L, 7432);
        AppPanel.e(AppPanel.this).BV(paramAnonymousInt);
        GMTrace.o(997506154496L, 7432);
      }
    };
    bLU();
    GMTrace.o(973212745728L, 7251);
  }
  
  private void bLT()
  {
    GMTrace.i(973481181184L, 7253);
    if ((this.ozC == 0) || (this.ozD == 0))
    {
      GMTrace.o(973481181184L, 7253);
      return;
    }
    this.tyv = new ArrayList();
    this.ozE.removeAllViews();
    int i = BackwardSupportUtil.b.a(this.context, 82.0F);
    int m = BackwardSupportUtil.b.a(this.context, 90.0F);
    requestLayout();
    bLQ();
    int j = 4;
    if (!this.tyJ) {
      j = this.ozC / i;
    }
    int k = this.ozD / m;
    i = k;
    if (k > 2) {
      i = 2;
    }
    m = (this.ozD - m * i) / (i + 1);
    w.d("MicroMsg.AppPanel", "jacks spacing2 = %d", new Object[] { Integer.valueOf(m) });
    w.d("MicroMsg.AppPanel", "in initAppGrid, gridWidth = %d, gridHeight = %d", new Object[] { Integer.valueOf(this.ozC), Integer.valueOf(this.ozD) });
    if (j == 0) {
      j = 1;
    }
    for (;;)
    {
      k = i;
      if (i == 0) {
        k = 1;
      }
      k = j * k;
      if (this.tyx.tza.value) {}
      Object localObject;
      for (this.tyw = (this.tyh + this.tyk.size());; this.tyw = this.tyh)
      {
        int n = (int)Math.ceil(this.tyw / k);
        w.d("MicroMsg.AppPanel", "in initAppGrid, totalItemCount = %d, itemsPerPage = %d, pageCount = %d", new Object[] { Integer.valueOf(this.tyw), Integer.valueOf(k), Integer.valueOf(n) });
        i = 0;
        while (i < n)
        {
          localObject = (AppGrid)inflate(this.context, R.i.cpi, null);
          List localList = this.tyk;
          Map localMap = this.tyI;
          ((AppGrid)localObject).tyi = new AppGrid.a((AppGrid)localObject, ((AppGrid)localObject).context, localList, localMap);
          ((AppGrid)localObject).setBackgroundResource(0);
          ((AppGrid)localObject).setAdapter(((AppGrid)localObject).tyi);
          ((AppGrid)localObject).setOnItemClickListener(((AppGrid)localObject).juU);
          ((AppGrid)localObject).setOnItemLongClickListener(((AppGrid)localObject).lfy);
          int i1 = BackwardSupportUtil.b.a(((AppGrid)localObject).context, 16.0F);
          int i2 = BackwardSupportUtil.b.a(((AppGrid)localObject).context, 16.0F);
          ((AppGrid)localObject).setPadding(i1, BackwardSupportUtil.b.a(((AppGrid)localObject).context, 6.0F), i2, 0);
          i1 = this.tyw;
          i2 = this.tyh;
          ((AppGrid)localObject).tyg = i;
          ((AppGrid)localObject).tyd = i1;
          ((AppGrid)localObject).tye = k;
          ((AppGrid)localObject).tyf = n;
          ((AppGrid)localObject).tyh = i2;
          ((AppGrid)localObject).setNumColumns(j);
          if (m > 0)
          {
            ((AppGrid)localObject).setPadding(BackwardSupportUtil.b.a(((AppGrid)localObject).context, 16.0F), m, BackwardSupportUtil.b.a(((AppGrid)localObject).context, 16.0F), 0);
            ((AppGrid)localObject).setVerticalSpacing(m / 2);
          }
          this.ozE.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2));
          this.tyv.add(localObject);
          i += 1;
        }
      }
      if (this.tyv != null)
      {
        localObject = this.tyv.iterator();
        while (((Iterator)localObject).hasNext()) {
          ((AppGrid)((Iterator)localObject).next()).tyc = this.tyL;
        }
      }
      if (this.tyv.size() <= 1)
      {
        this.ozF.setVisibility(4);
        GMTrace.o(973481181184L, 7253);
        return;
      }
      this.ozF.setVisibility(0);
      this.ozF.BU(this.tyv.size());
      i = this.ozE.bZI();
      this.ozE.BY(i);
      this.ozF.BV(i);
      GMTrace.o(973481181184L, 7253);
      return;
    }
  }
  
  private static boolean bLV()
  {
    GMTrace.i(974286487552L, 7259);
    p.c localc = p.a.tlZ;
    if (localc != null)
    {
      if ((localc.ajW()) && (localc.ajZ() > 0))
      {
        GMTrace.o(974286487552L, 7259);
        return true;
      }
      GMTrace.o(974286487552L, 7259);
      return false;
    }
    GMTrace.o(974286487552L, 7259);
    return false;
  }
  
  private void bY(List<f> paramList)
  {
    GMTrace.i(972407439360L, 7245);
    boolean bool1 = this.tyB;
    this.tyB = false;
    boolean bool2 = this.tyC;
    boolean bool3 = this.tyD;
    boolean bool4 = this.tyE;
    this.tyC = false;
    this.tyD = false;
    this.tyE = false;
    int i = this.tyA;
    new ArrayList();
    label132:
    Object localObject;
    if (com.tencent.mm.plugin.x.a.a.a.aWD() == null)
    {
      w.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
      i = 0;
      w.d("MicroMsg.AppPanel", "serviceCount, %d", new Object[] { Integer.valueOf(i) });
      this.tyI = new HashMap();
      if ((i <= 0) || (paramList == null) || (paramList.size() <= 0)) {
        break label419;
      }
      i = 0;
      if (i >= paramList.size()) {
        break label419;
      }
      localObject = (f)paramList.get(i);
      j = i;
      if (localObject != null)
      {
        j = i;
        if (((f)localObject).field_appId != null)
        {
          j = i;
          if (((f)localObject).bJt()) {
            if ((((f)localObject).field_serviceAppInfoFlag & 0x1) == 0) {
              break label414;
            }
          }
        }
      }
    }
    label414:
    for (int j = 1;; j = 0)
    {
      if (j == 0) {
        this.tyB = true;
      }
      j = i;
      if (f.tnG.equals(((f)localObject).field_appId))
      {
        this.tyI.put(f.tnG, localObject);
        if (!this.tyG) {
          this.tyC = true;
        }
        paramList.remove(i);
        j = i - 1;
      }
      i = j;
      if (f.tnI.equals(((f)localObject).field_appId))
      {
        this.tyI.put(f.tnI, localObject);
        if (!this.tyF) {
          this.tyD = true;
        }
        paramList.remove(j);
        i = j - 1;
      }
      j = i;
      if (f.tnJ.equals(((f)localObject).field_appId))
      {
        this.tyI.put(f.tnJ, localObject);
        if (!this.tyH) {
          this.tyE = true;
        }
        paramList.remove(i);
        j = i - 1;
      }
      i = j + 1;
      break label132;
      localObject = com.tencent.mm.plugin.x.a.a.a.aWD().cJ(0, i);
      if (localObject == null)
      {
        i = 0;
        break;
      }
      i = ((Cursor)localObject).getCount();
      ((Cursor)localObject).close();
      break;
    }
    label419:
    w.d("MicroMsg.AppPanel", "hasService %b", new Object[] { Boolean.valueOf(this.tyB) });
    if ((bool1 != this.tyB) || (bool2 != this.tyC) || (bool3 != this.tyD) || (bool4 != this.tyE))
    {
      this.tyx.ki(this.tyB);
      this.tyx.kj(this.tyC);
      this.tyx.kk(this.tyD);
      this.tyx.kl(this.tyE);
      bLQ();
    }
    GMTrace.o(972407439360L, 7245);
  }
  
  private static void bZ(List<f> paramList)
  {
    GMTrace.i(974152269824L, 7258);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(974152269824L, 7258);
      return;
    }
    int i = 0;
    while (i < paramList.size())
    {
      f localf = (f)paramList.get(i);
      if ((localf != null) && (f.tnH.equals(localf.field_appId)))
      {
        paramList.remove(localf);
        GMTrace.o(974152269824L, 7258);
        return;
      }
      i += 1;
    }
    GMTrace.o(974152269824L, 7258);
  }
  
  public final void bLO()
  {
    GMTrace.i(972541657088L, 7246);
    a locala = this.tyx;
    locala.tyR.value = true;
    locala.tyS.value = true;
    locala.tyT.value = true;
    locala.tyU.value = true;
    locala.tyV.value = true;
    locala.tyW.value = true;
    locala.tyX.value = true;
    locala.tzg.value = true;
    locala.tze.value = true;
    locala.tyY.value = true;
    locala.tyZ.value = true;
    locala.tza.value = true;
    locala.tzb.value = true;
    locala.tzc.value = true;
    locala.tzd.value = true;
    locala.tzf.value = true;
    locala.tzh.value = true;
    locala.tzi.value = false;
    locala.tzj.value = true;
    locala.tzk.value = true;
    locala.tzm.value = true;
    locala.tzn.value = true;
    locala.tzm.value = false;
    this.tyF = false;
    this.tyG = false;
    this.tyH = false;
    bLP();
    this.tyx.ki(this.tyB);
    this.tyx.kj(this.tyC);
    this.tyx.kk(this.tyD);
    this.tyx.kl(this.tyE);
    bLQ();
    GMTrace.o(972541657088L, 7246);
  }
  
  public final void bLP()
  {
    boolean bool2 = true;
    GMTrace.i(972675874816L, 7247);
    com.tencent.mm.k.g.uu();
    if (com.tencent.mm.k.c.ue() == 2)
    {
      bool1 = true;
      this.tyx.tyX.value = true;
      this.tyx.tzd.value = bool1;
      bool1 = d.LL("location");
      this.tyx.tzh.value = bool1;
      if ((q.zP() & 0x2000000) != 0) {
        break label102;
      }
    }
    label102:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.tyx.tzf.value = bool1;
      GMTrace.o(972675874816L, 7247);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void bLQ()
  {
    int j = 1;
    GMTrace.i(972944310272L, 7249);
    int k = this.tys.length;
    int i = 0;
    while (i < k)
    {
      this.tys[i] = true;
      i += 1;
    }
    if (!this.tyx.tyT.value) {
      this.tys[0] = false;
    }
    for (;;)
    {
      if (this.tyx.tzg.value)
      {
        i = j;
        if (this.tyx.tzh.value) {}
      }
      else
      {
        this.tys[6] = false;
        i = j + 1;
      }
      j = i;
      if (!this.tyx.tyY.value)
      {
        this.tys[14] = false;
        j = i + 1;
      }
      i = j;
      if (!this.tyx.tyZ.value)
      {
        this.tys[8] = false;
        i = j + 1;
      }
      j = i;
      if (!this.tyx.tyU.value)
      {
        this.tys[11] = false;
        j = i + 1;
      }
      i = j;
      if (!this.tyx.tzi.value)
      {
        this.tys[13] = false;
        i = j + 1;
      }
      j = i;
      if (!this.tyx.tzl.value)
      {
        this.tys[3] = false;
        j = i + 1;
      }
      i = j;
      if (!this.tyx.tyV.value)
      {
        this.tys[12] = false;
        i = j + 1;
      }
      j = i;
      if (!this.tyx.tzb.value)
      {
        this.tys[5] = false;
        j = i + 1;
      }
      if (this.tyx.tzd.value)
      {
        i = j;
        if (this.tyx.tzc.value) {}
      }
      else
      {
        this.tys[4] = false;
        i = j + 1;
      }
      if (this.tyx.tyX.value)
      {
        j = i;
        if (this.tyx.tyW.value) {}
      }
      else
      {
        this.tys[2] = false;
        j = i + 1;
      }
      if (this.tyx.tzf.value)
      {
        i = j;
        if (this.tyx.tze.value) {}
      }
      else
      {
        this.tys[10] = false;
        i = j + 1;
      }
      j = i;
      if (!this.tyx.tzk.value)
      {
        this.tys[7] = false;
        j = i + 1;
      }
      i = j;
      if (!this.tyx.tzm.value)
      {
        this.tys[15] = false;
        i = j + 1;
      }
      this.tys[9] = false;
      this.tyh = (16 - (i + 1));
      GMTrace.o(972944310272L, 7249);
      return;
      j = 0;
    }
  }
  
  public final void bLU()
  {
    GMTrace.i(974018052096L, 7257);
    View localView;
    Object localObject2;
    int i;
    Object localObject1;
    if (this.tyN)
    {
      if (bLR() != 2) {
        break label92;
      }
      w.d("MicroMsg.AppPanel", "initFlipper, landscape");
      localView = findViewById(R.h.bet);
      localObject2 = new LinearLayout.LayoutParams(-1, 0);
      i = BackwardSupportUtil.b.a(this.context, ozr);
      localObject1 = localObject2;
    }
    for (;;)
    {
      ((LinearLayout.LayoutParams)localObject2).height = i;
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.tyN = false;
      GMTrace.o(974018052096L, 7257);
      return;
      label92:
      w.d("MicroMsg.AppPanel", "initFlipper, portrait: %d", new Object[] { Integer.valueOf(ozq) });
      localView = findViewById(R.h.bet);
      localObject1 = new LinearLayout.LayoutParams(-1, 0);
      Object localObject3;
      if (this.tyO > 0)
      {
        i = this.tyO;
        localObject3 = localObject1;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
      else
      {
        i = BackwardSupportUtil.b.a(this.context, ozq);
        localObject3 = localObject1;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
    }
  }
  
  public final void init(int paramInt)
  {
    GMTrace.i(972273221632L, 7244);
    this.tyx = new a();
    this.tyA = paramInt;
    Object localObject = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (((Display)localObject).getWidth() < ((Display)localObject).getHeight())
    {
      this.tyy = ((Display)localObject).getWidth();
      this.tyz = ((Display)localObject).getHeight();
      View.inflate(this.context, R.i.cpm, this);
      this.ozF = ((MMDotView)findViewById(R.h.beu));
      this.ozE = ((MMFlipper)findViewById(R.h.bev));
    }
    for (;;)
    {
      try
      {
        localObject = com.tencent.mm.k.g.ut().getValue("ShowAPPSuggestion");
        if ((!bg.nm((String)localObject)) && (Integer.valueOf((String)localObject).intValue() == 1)) {
          continue;
        }
        this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.tyA);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppPanel", "exception in appPanel init, %s", new Object[] { localException.getMessage() });
        this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.tyA);
        continue;
      }
      if (!bLV()) {
        bZ(this.tyk);
      }
      bY(this.tyk);
      bLS();
      bLO();
      GMTrace.o(972273221632L, 7244);
      return;
      this.tyy = ((Display)localObject).getHeight();
      this.tyz = ((Display)localObject).getWidth();
      break;
      this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, true, this.tyA);
    }
  }
  
  public final void kh(boolean paramBoolean)
  {
    GMTrace.i(972810092544L, 7248);
    this.tyx.tzc.value = false;
    bLQ();
    w.d("MicroMsg.AppPanel", "enable " + this.tyx.tzd.value + " isVoipAudioEnable false");
    GMTrace.o(972810092544L, 7248);
  }
  
  public final void oH()
  {
    GMTrace.i(973749616640L, 7255);
    this.ozB = false;
    this.ozE.BY(0);
    bLS();
    requestLayout();
    GMTrace.o(973749616640L, 7255);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(973615398912L, 7254);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      w.d("MicroMsg.AppPanel", "onConfigChanged:" + paramConfiguration.orientation);
      if (paramConfiguration.orientation != 1) {
        break label82;
      }
    }
    label82:
    for (this.tyJ = true;; this.tyJ = false)
    {
      this.tyN = true;
      oH();
      GMTrace.o(973615398912L, 7254);
      return;
    }
  }
  
  public final void refresh()
  {
    GMTrace.i(973346963456L, 7252);
    w.v("MicroMsg.AppPanel", "app panel refleshed");
    for (;;)
    {
      try
      {
        String str = com.tencent.mm.k.g.ut().getValue("ShowAPPSuggestion");
        if ((!bg.nm(str)) && (Integer.valueOf(str).intValue() == 1)) {
          continue;
        }
        this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.tyA);
        w.d("MicroMsg.AppPanel", "jacks not show App Suggestion");
      }
      catch (Exception localException)
      {
        int i;
        w.e("MicroMsg.AppPanel", "exception in appPanel init, %s", new Object[] { localException.getMessage() });
        this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.tyA);
        continue;
      }
      if (!bLV()) {
        bZ(this.tyk);
      }
      bY(this.tyk);
      if (this.tyx != null)
      {
        this.tyx.ki(this.tyB);
        this.tyx.kj(this.tyC);
        this.tyx.kk(this.tyD);
        this.tyx.kl(this.tyE);
      }
      i = this.ozE.bZI();
      bLT();
      this.ozE.BY(i);
      this.ozF.BV(i);
      GMTrace.o(973346963456L, 7252);
      return;
      w.d("MicroMsg.AppPanel", "jacks show App Suggestion");
      this.tyk = com.tencent.mm.pluginsdk.model.app.g.a(this.context, true, this.tyA);
    }
  }
  
  public final void zp(int paramInt)
  {
    GMTrace.i(973883834368L, 7256);
    if (this.tyO != paramInt)
    {
      this.tyO = paramInt;
      this.tyN = true;
    }
    GMTrace.o(973883834368L, 7256);
  }
  
  public static abstract interface a
  {
    public abstract void aNL();
    
    public abstract void aNM();
    
    public abstract void aNN();
    
    public abstract void aNO();
    
    public abstract void aNP();
    
    public abstract void aNQ();
    
    public abstract void aNR();
    
    public abstract void aNS();
    
    public abstract void aNT();
    
    public abstract void aNU();
    
    public abstract void aNV();
    
    public abstract void aNW();
    
    public abstract void aNX();
    
    public abstract void b(f paramf);
    
    public abstract void qm(int paramInt);
    
    public abstract void qn(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract void bLX();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\AppPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
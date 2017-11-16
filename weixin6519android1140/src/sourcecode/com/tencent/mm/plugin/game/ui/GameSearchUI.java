package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.am;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.protocal.c.uw;
import com.tencent.mm.protocal.c.uy;
import com.tencent.mm.protocal.c.va;
import com.tencent.mm.protocal.c.vb;
import com.tencent.mm.protocal.c.vc;
import com.tencent.mm.protocal.c.vd;
import com.tencent.mm.protocal.c.ve;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;

public class GameSearchUI
  extends MMActivity
  implements com.tencent.mm.ad.e, p.b
{
  private static final Pattern mcr;
  private int fromScene;
  private View iTF;
  private com.tencent.mm.ui.tools.p jQL;
  private ProgressBar jeL;
  private LinkedList<String> mcA;
  private String mcB;
  private LinkedList<k> mcC;
  private boolean mcD;
  private AdapterView.OnItemClickListener mcE;
  private AdapterView.OnItemClickListener mcF;
  private ViewGroup mcs;
  private TextView mct;
  private ListView mcu;
  private ListView mcv;
  private r mcw;
  private s mcx;
  private String mcy;
  private String mcz;
  
  static
  {
    GMTrace.i(12705452785664L, 94663);
    mcr = Pattern.compile("\\s+");
    GMTrace.o(12705452785664L, 94663);
  }
  
  public GameSearchUI()
  {
    GMTrace.i(12702231560192L, 94639);
    this.mcC = new LinkedList();
    this.mcD = false;
    this.mcE = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12699949858816L, 94622);
        paramAnonymousAdapterView = GameSearchUI.b(GameSearchUI.this);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getCount())) {}
        for (paramAnonymousAdapterView = null; paramAnonymousAdapterView == null; paramAnonymousAdapterView = ((r.b)paramAnonymousAdapterView.getItem(paramAnonymousInt)).mch)
        {
          GMTrace.o(12699949858816L, 94622);
          return;
        }
        if ((paramAnonymousAdapterView.actionType == 1) && (!bg.nm(paramAnonymousAdapterView.appId)))
        {
          paramAnonymousView = new Bundle();
          paramAnonymousView.putCharSequence("game_app_id", paramAnonymousAdapterView.appId);
          paramAnonymousView.putInt("game_report_from_scene", paramAnonymousAdapterView.eSa);
          paramAnonymousInt = c.a(GameSearchUI.this, paramAnonymousAdapterView.appId, null, paramAnonymousView);
          paramAnonymousView = new HashMap();
          paramAnonymousView.put("function_type", "search");
          paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.mcj);
          paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
          paramAnonymousView = ai.u(paramAnonymousView);
          ai.a(GameSearchUI.this, 14, paramAnonymousAdapterView.eSa, paramAnonymousAdapterView.position, paramAnonymousInt, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousView);
          GMTrace.o(12699949858816L, 94622);
          return;
        }
        if ((paramAnonymousAdapterView.actionType == 2) && (!bg.nm(paramAnonymousAdapterView.mci)))
        {
          paramAnonymousInt = c.p(GameSearchUI.this, paramAnonymousAdapterView.mci, "game_center_detail");
          paramAnonymousView = new HashMap();
          paramAnonymousView.put("function_type", "search");
          paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.mcj);
          paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
          paramAnonymousView = ai.u(paramAnonymousView);
          ai.a(GameSearchUI.this, 14, paramAnonymousAdapterView.eSa, paramAnonymousAdapterView.position, paramAnonymousInt, 0, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousAdapterView.mcd, String.valueOf(paramAnonymousAdapterView.mce), null, paramAnonymousView);
        }
        GMTrace.o(12699949858816L, 94622);
      }
    };
    this.mcF = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(17974303916032L, 133919);
        paramAnonymousAdapterView = ((s)paramAnonymousAdapterView.getAdapter()).oU(paramAnonymousInt);
        if (bg.nm(paramAnonymousAdapterView.text))
        {
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        if (bg.nm(paramAnonymousAdapterView.appId))
        {
          paramAnonymousView = new LinkedList();
          paramAnonymousView.add(paramAnonymousAdapterView.text);
          GameSearchUI.b(GameSearchUI.this, paramAnonymousView);
          GameSearchUI.h(GameSearchUI.this);
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        switch (paramAnonymousAdapterView.actionType)
        {
        default: 
          w.e("MicroMsg.GameSearchUI", "unknowed actionType : " + paramAnonymousAdapterView.actionType);
          GMTrace.o(17974303916032L, 133919);
          return;
        case 1: 
          paramAnonymousView = new Bundle();
          paramAnonymousView.putCharSequence("game_app_id", paramAnonymousAdapterView.appId);
          paramAnonymousView.putInt("game_report_from_scene", 1402);
          i = c.a(GameSearchUI.this, paramAnonymousAdapterView.appId, null, paramAnonymousView);
          ai.a(GameSearchUI.this, 14, 1402, paramAnonymousInt, i, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), null);
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        int i = c.p(GameSearchUI.this.vKB.vKW, paramAnonymousAdapterView.mck, "game_center_detail");
        ai.a(GameSearchUI.this, 14, 1402, paramAnonymousInt, i, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), null);
        GMTrace.o(17974303916032L, 133919);
      }
    };
    GMTrace.o(12702231560192L, 94639);
  }
  
  private void a(LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17974840786944L, 133923);
    while (!this.mcC.isEmpty())
    {
      h.xz();
      h.xx().fYr.c((k)this.mcC.pop());
    }
    if (paramBoolean)
    {
      localObject = this.mcw;
      ((r)localObject).lNV = 0;
      ((r)localObject).mbL = false;
    }
    this.mcA = paramLinkedList;
    Object localObject = new am(v.bPK(), paramLinkedList, com.tencent.mm.plugin.game.model.e.aFf(), this.mcw.lNV);
    at.wS().a((k)localObject, 0);
    this.mcC.add(localObject);
    paramLinkedList = paramLinkedList.iterator();
    for (this.mcy = ""; paramLinkedList.hasNext(); this.mcy = (this.mcy + " " + (String)paramLinkedList.next())) {}
    this.mcy = this.mcy.trim();
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.mcD = true;
      this.jQL.WP(this.mcy);
    }
    GMTrace.o(17974840786944L, 133923);
  }
  
  private void d(LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(12703305302016L, 94647);
    a(paramLinkedList, 0, true);
    GMTrace.o(12703305302016L, 94647);
  }
  
  private void oV(int paramInt)
  {
    GMTrace.i(12703171084288L, 94646);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mcs.setVisibility(8);
      this.mct.setVisibility(8);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(8);
      this.jeL.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      aLo();
      this.mcu.smoothScrollToPosition(0);
      this.jQL.clearFocus();
      this.mcs.setVisibility(8);
      this.mct.setVisibility(8);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(8);
      this.jeL.setVisibility(0);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mcu.smoothScrollToPosition(0);
      this.mcs.setVisibility(8);
      this.mct.setVisibility(8);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(8);
      this.jeL.setVisibility(0);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mcs.setVisibility(8);
      if (this.mcw.getCount() > 0)
      {
        this.mct.setVisibility(8);
        this.mcu.setVisibility(0);
      }
      for (;;)
      {
        this.mcv.setVisibility(8);
        this.jeL.setVisibility(8);
        GMTrace.o(12703171084288L, 94646);
        return;
        this.mct.setVisibility(0);
        this.mcu.setVisibility(8);
      }
      this.mcs.setVisibility(0);
      this.mct.setVisibility(8);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(8);
      this.jeL.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mcs.setVisibility(8);
      this.mct.setVisibility(0);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(8);
      this.jeL.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mcs.setVisibility(8);
      this.mct.setVisibility(8);
      this.mcu.setVisibility(8);
      this.mcv.setVisibility(0);
      this.jeL.setVisibility(8);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(12702634213376L, 94642);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12665053249536L, 94362);
        GameSearchUI.this.onBackPressed();
        GMTrace.o(12665053249536L, 94362);
        return true;
      }
    });
    this.jQL = new com.tencent.mm.ui.tools.p();
    this.jQL.mD(true);
    this.jQL.xiS = this;
    this.mcs = ((ViewGroup)findViewById(R.h.cmf));
    this.jeL = ((ProgressBar)findViewById(R.h.caH));
    this.mct = ((TextView)findViewById(R.h.bRg));
    this.mcu = ((ListView)findViewById(R.h.caK));
    this.mcw = new r(this);
    this.mcu.setAdapter(this.mcw);
    this.mcu.setOnItemClickListener(this.mcE);
    this.mcu.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12705855438848L, 94666);
        GameSearchUI.a(GameSearchUI.this).clearFocus();
        GameSearchUI.this.aLo();
        GMTrace.o(12705855438848L, 94666);
        return false;
      }
    });
    this.mcu.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(17976854052864L, 133938);
        GMTrace.o(17976854052864L, 133938);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(17976719835136L, 133937);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (GameSearchUI.b(GameSearchUI.this).mbL))
        {
          if (GameSearchUI.c(GameSearchUI.this) != null) {
            GameSearchUI.c(GameSearchUI.this).setVisibility(0);
          }
          GameSearchUI.a(GameSearchUI.this, GameSearchUI.d(GameSearchUI.this));
        }
        GMTrace.o(17976719835136L, 133937);
      }
    });
    this.iTF = getLayoutInflater().inflate(R.i.cyT, this.mcu, false);
    this.iTF.setVisibility(8);
    this.mcu.addFooterView(this.iTF);
    this.mcv = ((ListView)findViewById(R.h.caI));
    this.mcx = new s(this);
    this.mcv.setAdapter(this.mcx);
    this.mcv.setOnItemClickListener(this.mcF);
    this.mcv.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17976317181952L, 133934);
        GameSearchUI.e(GameSearchUI.this).clearFocus();
        GameSearchUI.this.aLo();
        GMTrace.o(17976317181952L, 133934);
        return false;
      }
    });
    GMTrace.o(12702634213376L, 94642);
  }
  
  public final void QA()
  {
    GMTrace.i(12702365777920L, 94640);
    GMTrace.o(12702365777920L, 94640);
  }
  
  public final void QB()
  {
    GMTrace.i(17080816500736L, 127262);
    GMTrace.o(17080816500736L, 127262);
  }
  
  public final void Qy()
  {
    GMTrace.i(12704110608384L, 94653);
    aLo();
    onBackPressed();
    GMTrace.o(12704110608384L, 94653);
  }
  
  public final void Qz()
  {
    GMTrace.i(12703976390656L, 94652);
    GMTrace.o(12703976390656L, 94652);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12703439519744L, 94648);
    if (paramk.gtZ)
    {
      GMTrace.o(12703439519744L, 94648);
      return;
    }
    if (this.mcC.contains(paramk)) {
      this.mcC.remove(paramk);
    }
    this.iTF.setVisibility(8);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12703439519744L, 94648);
      return;
      paramString = (va)((am)paramk).kzP.gtC.gtK;
      w.d("MicroMsg.GameSearchUI", "keywords = %s, offset = %d", new Object[] { paramString.unn, Integer.valueOf(paramString.uno) });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (vb)((am)paramk).kzP.gtD.gtK;
        label219:
        label289:
        Object localObject3;
        Object localObject4;
        if (paramString != null)
        {
          paramString = paramString.unp;
          if (bg.cc(paramString)) {
            break label1774;
          }
          this.mcz = this.mcy;
          if (this.mcw.lNV != 0)
          {
            paramk = this.mcw;
            localObject1 = this.mcz;
            paramString = paramString.iterator();
          }
        }
        else
        {
          for (;;)
          {
            if (!paramString.hasNext()) {
              break label1774;
            }
            localObject2 = (vc)paramString.next();
            if ((((vc)localObject2).type == 3) && (!bg.cc(((vc)localObject2).unr)))
            {
              paramk.lNV = ((vc)localObject2).unv;
              paramk.mbL = ((vc)localObject2).unw;
              localObject2 = ((vc)localObject2).unr.iterator();
              if (((Iterator)localObject2).hasNext())
              {
                localObject3 = r.b.a((ve)((Iterator)localObject2).next());
                ((r.b)localObject3).eBj = ((String)localObject1);
                ((r.b)localObject3).mch.appId = ((r.b)localObject3).appId;
                ((r.b)localObject3).mch.mcd = ((r.b)localObject3).mcd;
                ((r.b)localObject3).mch.mce = ((r.b)localObject3).mce;
                ((r.b)localObject3).mch.mcj = "2";
                localObject4 = ((r.b)localObject3).mch;
                paramInt1 = paramk.mbI;
                paramk.mbI = (paramInt1 + 1);
                ((r.c)localObject4).position = (paramInt1 + 301);
                localObject4 = ((r.b)localObject3).mch;
                if (!paramk.eBn) {
                  break label446;
                }
              }
              label446:
              for (paramInt1 = 1403;; paramInt1 = 1405)
              {
                ((r.c)localObject4).eSa = paramInt1;
                paramk.jST.add(localObject3);
                break label289;
                break label219;
                paramString = null;
                break;
              }
            }
            paramk.mbL = false;
          }
        }
        paramk = this.mcw;
        localObject1 = this.mcz;
        if (paramk.jST == null) {
          paramk.jST = new ArrayList();
        }
        paramk.lYV = 0;
        paramk.mbG = 0;
        paramk.mbH = 0;
        paramk.mbI = 0;
        paramk.mbJ = 0;
        paramk.eBn = false;
        paramk.mbF = false;
        paramk.mbL = false;
        paramk.lNV = 0;
        paramk.jST.clear();
        paramk.mbM = false;
        Object localObject2 = paramString.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramString = (vc)((Iterator)localObject2).next();
          label608:
          label627:
          int i;
          if ((paramString.unq == null) || (paramString.unq.size() == 0))
          {
            paramInt1 = 1;
            if ((paramString.unr != null) && (paramString.unr.size() != 0)) {
              break label732;
            }
            paramInt2 = 1;
            if ((paramString.unu != null) && (paramString.unu.size() != 0)) {
              break label737;
            }
            i = 1;
            label647:
            if ((paramInt1 == 0) || (paramInt2 == 0) || (i == 0)) {
              break label743;
            }
            paramInt1 = 1;
            label662:
            if (paramInt1 == 0) {
              break label763;
            }
            if (paramString.type != 1) {
              continue;
            }
            if (bg.nm((String)localObject1)) {
              break label748;
            }
          }
          label732:
          label737:
          label743:
          label748:
          for (paramString = paramk.context.getString(R.l.dAJ, new Object[] { localObject1 });; paramString = paramk.context.getString(R.l.dAI))
          {
            paramk.jST.add(r.b.ac(6, paramString));
            paramk.mbM = true;
            break;
            paramInt1 = 0;
            break label608;
            paramInt2 = 0;
            break label627;
            i = 0;
            break label647;
            paramInt1 = 0;
            break label662;
          }
          label763:
          paramk.jST.add(r.b.ac(0, paramString.eBt));
          if (!paramk.mbM)
          {
            ((r.b)paramk.jST.get(paramk.jST.size() - 1)).mcf = true;
            paramk.mbM = true;
          }
          Object localObject5;
          if ((paramString.type == 4) && (paramString.unu != null))
          {
            localObject3 = paramString.unu.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject5 = (vd)((Iterator)localObject3).next();
              localObject4 = new r.b();
              ((r.b)localObject4).type = 3;
              ((r.b)localObject4).appId = ((vd)localObject5).unx.lQa;
              ((r.b)localObject4).name = ((vd)localObject5).unx.lPi;
              ((r.b)localObject4).hLO = ((vd)localObject5).unx.ueH;
              ((r.b)localObject4).iconUrl = ((vd)localObject5).unx.lRV;
              ((r.b)localObject4).mbZ = ((vd)localObject5).unx.lPk;
              ((r.b)localObject4).mca = ((vd)localObject5).unx.unc;
              ((r.b)localObject4).actionType = ((vd)localObject5).unx.und;
              ((r.b)localObject4).mcb = ((vd)localObject5).unx.une;
              ((r.b)localObject4).mcc = ((vd)localObject5).uny;
              ((r.b)localObject4).mch = new r.c(((vd)localObject5).unx.und, 4, ((vd)localObject5).unx.lQa, ((vd)localObject5).unx.une);
              ((r.b)localObject4).eBj = ((String)localObject1);
              ((r.b)localObject4).mch.mcj = "3";
              localObject5 = ((r.b)localObject4).mch;
              paramInt1 = paramk.mbH;
              paramk.mbH = (paramInt1 + 1);
              ((r.c)localObject5).position = (paramInt1 + 601);
              paramk.jST.add(localObject4);
            }
          }
          if (((paramString.type == 1) || (paramString.type == 2)) && (paramString.unq != null))
          {
            localObject3 = paramString.unq.iterator();
            if (((Iterator)localObject3).hasNext())
            {
              localObject5 = (uw)((Iterator)localObject3).next();
              localObject4 = new r.b();
              ((r.b)localObject4).type = 1;
              ((r.b)localObject4).appId = ((uw)localObject5).lQa;
              ((r.b)localObject4).name = ((uw)localObject5).lPi;
              ((r.b)localObject4).hLO = ((uw)localObject5).ueH;
              ((r.b)localObject4).iconUrl = ((uw)localObject5).lRV;
              ((r.b)localObject4).mbZ = ((uw)localObject5).lPk;
              ((r.b)localObject4).mca = ((uw)localObject5).unc;
              ((r.b)localObject4).actionType = ((uw)localObject5).und;
              ((r.b)localObject4).mcb = ((uw)localObject5).une;
              ((r.b)localObject4).mch = new r.c(((uw)localObject5).und, 1, ((uw)localObject5).lQa, ((uw)localObject5).une);
              ((r.b)localObject4).eBj = ((String)localObject1);
              if (paramString.type == 1)
              {
                paramk.eBn = true;
                localObject5 = ((r.b)localObject4).mch;
                paramInt1 = paramk.lYV;
                paramk.lYV = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 1);
              }
              for (;;)
              {
                ((r.b)localObject4).mch.mcj = "1";
                paramk.jST.add(localObject4);
                break;
                if (paramString.type == 2)
                {
                  paramk.mbF = true;
                  localObject5 = ((r.b)localObject4).mch;
                  paramInt1 = paramk.mbG;
                  paramk.mbG = (paramInt1 + 1);
                  ((r.c)localObject5).position = (paramInt1 + 1);
                }
              }
            }
          }
          else if ((paramString.type == 3) && (paramString.unr != null))
          {
            paramk.lNV = paramString.unv;
            paramk.mbL = paramString.unw;
            localObject3 = paramString.unr.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = r.b.a((ve)((Iterator)localObject3).next());
              ((r.b)localObject4).eBj = ((String)localObject1);
              ((r.b)localObject4).mch.appId = ((r.b)localObject4).appId;
              ((r.b)localObject4).mch.mcd = ((r.b)localObject4).mcd;
              ((r.b)localObject4).mch.mce = ((r.b)localObject4).mce;
              ((r.b)localObject4).mch.mcj = "2";
              localObject5 = ((r.b)localObject4).mch;
              paramInt1 = paramk.mbI;
              paramk.mbI = (paramInt1 + 1);
              ((r.c)localObject5).position = (paramInt1 + 301);
              paramk.jST.add(localObject4);
            }
          }
          if ((!bg.nm(paramString.uns)) && (!bg.nm(paramString.unt)) && (paramString.type == 1))
          {
            localObject3 = paramString.uns;
            paramString = paramString.unt;
            localObject4 = new r.b();
            ((r.b)localObject4).type = 5;
            ((r.b)localObject4).name = ((String)localObject3);
            ((r.b)localObject4).mch = new r.c(paramString);
            ((r.b)localObject4).mch.appId = "wx62d9035fd4fd2059";
            ((r.b)localObject4).mch.mcj = "1";
            ((r.b)localObject4).mch.position = 300;
            paramk.jST.add(localObject4);
          }
        }
        paramString = paramk.jST.iterator();
        while (paramString.hasNext())
        {
          localObject1 = (r.b)paramString.next();
          if (paramk.eBn) {
            ((r.b)localObject1).mch.eSa = 1403;
          } else if (paramk.mbF) {
            ((r.b)localObject1).mch.eSa = 1404;
          } else {
            ((r.b)localObject1).mch.eSa = 1405;
          }
        }
        paramk.notifyDataSetChanged();
      }
      label1774:
      oV(2);
      GMTrace.o(12703439519744L, 94648);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(12703439519744L, 94648);
        return;
      }
      paramString = ((an)paramk).eBj;
      Object localObject1 = ((uy)((an)paramk).kzP.gtD.gtK).eBt;
      paramk = ((uy)((an)paramk).kzP.gtD.gtK).unl;
      this.mcx.a(paramString, (String)localObject1, paramk);
      oV(5);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12703036866560L, 94645);
    int i = R.i.czq;
    GMTrace.o(12703036866560L, 94645);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(12704379043840L, 94655);
    if (bg.nm(paramString))
    {
      GMTrace.o(12704379043840L, 94655);
      return true;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = mcr.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    d(localLinkedList, 0);
    oV(1);
    GMTrace.o(12704379043840L, 94655);
    return true;
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(12704244826112L, 94654);
    if (this.mcD)
    {
      this.mcD = false;
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    if ((this.mcB != null) && (this.mcB.equals(bg.nl(paramString))))
    {
      w.d("MicroMsg.GameSearchUI", "repeat searchChange");
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    this.mcB = paramString;
    if (bg.nm(paramString))
    {
      while (!this.mcC.isEmpty())
      {
        h.xz();
        h.xx().fYr.c((k)this.mcC.pop());
      }
      paramString = new an(v.bPK(), paramString, com.tencent.mm.plugin.game.model.e.aFf());
      at.wS().a(paramString, 0);
      this.mcC.add(paramString);
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = mcr.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    d(localLinkedList, 0);
    oV(6);
    GMTrace.o(12704244826112L, 94654);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(12703707955200L, 94650);
    super.onBackPressed();
    GMTrace.o(12703707955200L, 94650);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12702499995648L, 94641);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (!at.AU())
    {
      w.e("MicroMsg.GameSearchUI", "account not ready");
      finish();
      GMTrace.o(12702499995648L, 94641);
      return;
    }
    at.wS().a(1328, this);
    at.wS().a(1329, this);
    this.fromScene = getIntent().getIntExtra("game_report_from_scene", 0);
    MP();
    ai.a(this, 14, 1401, 0, 2, this.fromScene, null);
    w.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (System.currentTimeMillis() - l));
    GMTrace.o(12702499995648L, 94641);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(12702768431104L, 94643);
    this.jQL.a(this, paramMenu);
    this.jQL.setHint(SubCoreGameCenter.aGd());
    GMTrace.o(12702768431104L, 94643);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12703842172928L, 94651);
    w.i("MicroMsg.GameSearchUI", "onDestroy");
    super.onDestroy();
    at.wS().b(1328, this);
    at.wS().b(1329, this);
    GMTrace.o(12703842172928L, 94651);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12703573737472L, 94649);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      GMTrace.o(12703573737472L, 94649);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12703573737472L, 94649);
    return bool;
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(12702902648832L, 94644);
    this.jQL.a(this, paramMenu);
    GMTrace.o(12702902648832L, 94644);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\GameSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
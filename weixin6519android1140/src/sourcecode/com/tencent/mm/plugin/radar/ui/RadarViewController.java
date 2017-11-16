package com.tencent.mm.plugin.radar.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.radar.a.c.4;
import com.tencent.mm.plugin.radar.a.c.a;
import com.tencent.mm.plugin.radar.a.c.b;
import com.tencent.mm.plugin.radar.a.c.d;
import com.tencent.mm.plugin.radar.a.d;
import com.tencent.mm.plugin.radar.a.e;
import com.tencent.mm.plugin.radar.a.e.a;
import com.tencent.mm.plugin.radar.a.e.b;
import com.tencent.mm.plugin.radar.a.e.c;
import com.tencent.mm.plugin.radar.a.e.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.any;
import com.tencent.mm.protocal.c.awu;
import com.tencent.mm.protocal.c.awv;
import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;

public class RadarViewController
  extends RelativeLayout
  implements c.b, e.c
{
  private Context mContext;
  RadarWaveView obE;
  RadarMemberView obF;
  RadarSpecialGridView obG;
  RadarTipsView obH;
  private Button obI;
  TextView obJ;
  ProgressBar obK;
  Button obL;
  View obM;
  e obN;
  com.tencent.mm.plugin.radar.a.c obO;
  b obP;
  e.d obQ;
  private boolean obR;
  private View.OnClickListener obS;
  View.OnClickListener obT;
  private final int obU;
  private final int obV;
  private final int obW;
  
  public RadarViewController(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8924539387904L, 66493);
    this.obE = null;
    this.obF = null;
    this.obG = null;
    this.obH = null;
    this.obI = null;
    this.obJ = null;
    this.obK = null;
    this.obL = null;
    this.obM = null;
    this.obN = null;
    this.obO = null;
    this.obP = null;
    this.obQ = e.d.oaa;
    this.obR = false;
    this.obS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8923465646080L, 66485);
        GMTrace.o(8923465646080L, 66485);
      }
    };
    this.obT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8901051285504L, 66318);
        if ((RadarViewController.a(RadarViewController.this) == e.d.oaa) || (RadarViewController.a(RadarViewController.this) == e.d.oab))
        {
          ((Activity)RadarViewController.this.getContext()).finish();
          GMTrace.o(8901051285504L, 66318);
          return;
        }
        RadarViewController localRadarViewController = RadarViewController.this;
        RadarViewController.b localb = RadarViewController.b(RadarViewController.this);
        if (localb.ocf == null)
        {
          paramAnonymousView = null;
          if (!RadarViewController.a(localRadarViewController, paramAnonymousView)) {
            break label222;
          }
          if (RadarViewController.c(RadarViewController.this) != null)
          {
            RadarViewController.c(RadarViewController.this).bac();
            RadarViewController.c(RadarViewController.this).setVisibility(0);
          }
          RadarViewController.d(RadarViewController.this).aZH();
          RadarViewController.a(RadarViewController.this, e.d.oab);
        }
        for (;;)
        {
          if (RadarViewController.b(RadarViewController.this) != null) {
            RadarViewController.b(RadarViewController.this).aZP();
          }
          GMTrace.o(8901051285504L, 66318);
          return;
          LinkedList localLinkedList = new LinkedList();
          int j = localb.ocf.length;
          int i = 0;
          for (;;)
          {
            paramAnonymousView = localLinkedList;
            if (i >= j) {
              break;
            }
            paramAnonymousView = localb.ocf[i];
            if (paramAnonymousView != null) {
              localLinkedList.add(paramAnonymousView);
            }
            i += 1;
          }
          label222:
          RadarViewController.a(RadarViewController.this, e.d.oaa);
        }
      }
    };
    this.obU = 33554432;
    this.obV = 33554433;
    this.obW = 33554434;
    this.obN = new e(this, paramContext.getApplicationContext());
    this.obO = new com.tencent.mm.plugin.radar.a.c(this, paramContext);
    this.mContext = paramContext;
    GMTrace.o(8924539387904L, 66493);
  }
  
  private void a(e.d paramd)
  {
    GMTrace.i(8926284218368L, 66506);
    this.obQ = paramd;
    switch (5.oca[paramd.ordinal()])
    {
    default: 
      w.d("MicroMsg.Radar.RadarViewController", "swithcRadarUI");
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(8926284218368L, 66506);
          return;
          this.obM.setVisibility(8);
          if (this.obL != null) {
            this.obL.setText(R.l.dPs);
          }
          if (this.obI != null)
          {
            this.obI.setVisibility(4);
            this.obI.setBackgroundResource(R.g.aUF);
            this.obI.setEnabled(false);
          }
          if ((this.obJ != null) && (this.obK != null))
          {
            this.obK.setVisibility(8);
            this.obJ.setText("");
          }
          if (this.obE != null)
          {
            this.obE.bac();
            this.obE.setVisibility(0);
          }
          this.obN.aZH();
          GMTrace.o(8926284218368L, 66506);
          return;
          this.obM.setVisibility(8);
          if (this.obI != null)
          {
            this.obI.setText(R.l.dPm);
            this.obI.setMinWidth(com.tencent.mm.br.a.V(getContext(), R.f.aRN));
            this.obI.setTextColor(getResources().getColorStateList(R.e.aPs));
            this.obI.setBackgroundResource(R.g.aUF);
            this.obI.setEnabled(true);
            gP(false);
          }
        } while ((this.obJ == null) || (this.obK == null));
        this.obK.setVisibility(8);
        this.obJ.setText("");
        GMTrace.o(8926284218368L, 66506);
        return;
        if ((this.obM != null) && (this.obM.getVisibility() != 0))
        {
          this.obM.setAnimation(AnimationUtils.loadAnimation(getContext(), R.a.aLI));
          this.obM.setVisibility(0);
        }
        if (this.obL != null) {
          this.obL.setText(R.l.cSk);
        }
        if (this.obN != null) {
          this.obN.aZI();
        }
        if ((this.obJ != null) && (this.obK != null))
        {
          this.obK.setVisibility(0);
          this.obJ.setText(R.l.dPt);
        }
        if (this.obE != null)
        {
          this.obE.bad();
          this.obE.setVisibility(4);
        }
        if (this.obG != null) {
          this.obG.setVisibility(4);
        }
      } while (this.obP == null);
      paramd = this.obP;
      paramd.och.clear();
      paramd.ock.clear();
      Iterator localIterator = paramd.ock.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        a locala = paramd.oci;
        localObject = (View)paramd.ock.get(localObject);
        int i = a.cn((View)localObject);
        if (i > 0) {
          locala.ocd.removeMessages(i);
        }
        ((View)localObject).clearAnimation();
      }
      paramd.aZP();
      GMTrace.o(8926284218368L, 66506);
      return;
      this.obM.setVisibility(0);
      if (this.obN != null) {
        this.obN.aZI();
      }
      if ((this.obJ != null) && (this.obK != null))
      {
        this.obK.setVisibility(8);
        this.obJ.setText(R.l.dPk);
      }
      if (this.obG != null) {
        this.obG.setVisibility(0);
      }
      gP(true);
      if (this.obI != null)
      {
        this.obI.setVisibility(0);
        this.obI.setMinWidth(com.tencent.mm.br.a.V(getContext(), R.f.aSB));
      }
      baa();
      GMTrace.o(8926284218368L, 66506);
      return;
      this.obM.setVisibility(8);
      if (this.obN != null) {
        this.obN.aZI();
      }
      if ((this.obJ != null) && (this.obK != null))
      {
        this.obK.setVisibility(0);
        this.obJ.setText(R.l.dPl);
      }
    } while (this.obI == null);
    this.obI.setVisibility(4);
    GMTrace.o(8926284218368L, 66506);
  }
  
  private void ab(LinkedList<awx> paramLinkedList)
  {
    GMTrace.i(8925881565184L, 66503);
    if ((paramLinkedList.size() == 0) && (this.obP.getCount() == 0)) {
      this.obH.gO(true);
    }
    for (;;)
    {
      w.d("MicroMsg.Radar.RadarViewController", "members got, size : " + paramLinkedList.size());
      boolean bool = ac(paramLinkedList);
      w.d("MicroMsg.Radar.RadarViewController", "has friend:%s", new Object[] { String.valueOf(bool) });
      this.obP.ad(paramLinkedList);
      if ((this.obR) && (bool)) {
        a(e.d.oab);
      }
      GMTrace.o(8925881565184L, 66503);
      return;
      this.obH.gO(false);
    }
  }
  
  private boolean ac(LinkedList<awx> paramLinkedList)
  {
    GMTrace.i(8926015782912L, 66504);
    Iterator localIterator = paramLinkedList.iterator();
    boolean bool = false;
    if (localIterator.hasNext())
    {
      Object localObject = (awx)localIterator.next();
      paramLinkedList = this.obN.a((awx)localObject, false);
      if (paramLinkedList != null) {
        break label104;
      }
      localObject = c.b((awx)localObject);
      paramLinkedList = this.obO.Fm((String)localObject);
      this.obN.b((String)localObject, paramLinkedList);
    }
    label104:
    for (;;)
    {
      if (paramLinkedList == c.d.nZw) {
        bool = true;
      }
      for (;;)
      {
        break;
        GMTrace.o(8926015782912L, 66504);
        return bool;
      }
    }
  }
  
  private void baa()
  {
    boolean bool = false;
    GMTrace.i(8926150000640L, 66505);
    int i;
    label46:
    Button localButton;
    if (this.obI != null)
    {
      localObject = this.obP;
      if (((b)localObject).ocg != null) {
        break label111;
      }
      i = 0;
      if (i != 0) {
        break label122;
      }
      this.obI.setText(R.l.cTM);
      localObject = this.obI;
      if (i > 1) {
        bool = true;
      }
      ((Button)localObject).setEnabled(bool);
      localButton = this.obI;
      if (i <= 1) {
        break label156;
      }
    }
    label111:
    label122:
    label156:
    for (Object localObject = getResources().getColorStateList(R.e.aPs);; localObject = getResources().getColorStateList(R.e.aOK))
    {
      localButton.setTextColor((ColorStateList)localObject);
      this.obI.setBackgroundResource(R.g.aUF);
      GMTrace.o(8926150000640L, 66505);
      return;
      i = ((b)localObject).ocg.size();
      break;
      this.obI.setText(String.format(getContext().getString(R.l.dPr), new Object[] { Integer.valueOf(i) }));
      break label46;
    }
  }
  
  private void d(String paramString, c.d paramd)
  {
    GMTrace.i(8924807823360L, 66495);
    c.d locald = this.obN.an(paramString, false);
    if ((locald != null) && (locald != paramd))
    {
      this.obN.b(paramString, paramd);
      this.obP.aZP();
    }
    GMTrace.o(8924807823360L, 66495);
  }
  
  private void gP(boolean paramBoolean)
  {
    GMTrace.i(8926418436096L, 66507);
    if ((this.obI != null) && ((this.obI.getVisibility() != 0) || (paramBoolean)))
    {
      this.obI.startAnimation(AnimationUtils.loadAnimation(getContext(), R.a.aLI));
      this.obI.setVisibility(0);
    }
    GMTrace.o(8926418436096L, 66507);
  }
  
  public final void I(x paramx)
  {
    GMTrace.i(8925344694272L, 66499);
    if (this.obF.isShowing()) {
      this.obF.c(paramx.field_encryptUsername, c.d.nZw);
    }
    d(paramx.field_username, c.d.nZw);
    d(paramx.field_encryptUsername, c.d.nZw);
    GMTrace.o(8925344694272L, 66499);
  }
  
  public final void J(x paramx)
  {
    GMTrace.i(8925210476544L, 66498);
    if ((this.obN.an(paramx.field_username, false) == null) && (this.obN.an(paramx.field_encryptUsername, false) == null))
    {
      LinkedList localLinkedList = new LinkedList();
      String str1 = paramx.field_username;
      String str2 = paramx.field_encryptUsername;
      String str3 = paramx.field_nickname;
      awx localawx = new awx();
      localawx.uJl = 100;
      localawx.jhi = str1;
      localawx.jio = str3;
      localawx.uhb = "";
      localawx.ujf = str2;
      localLinkedList.add(localawx);
      ab(localLinkedList);
    }
    if (this.obF.isShowing()) {
      this.obF.c(paramx.field_encryptUsername, c.d.nZx);
    }
    d(paramx.field_username, c.d.nZx);
    d(paramx.field_encryptUsername, c.d.nZx);
    GMTrace.o(8925210476544L, 66498);
  }
  
  public final void a(int paramInt1, int paramInt2, LinkedList<awx> paramLinkedList)
  {
    GMTrace.i(8925613129728L, 66501);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.Radar.RadarViewController", "radar member return error : %s, type : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      if (2 == paramInt1)
      {
        this.obH.Fn(getContext().getString(R.l.dwI));
        GMTrace.o(8925613129728L, 66501);
        return;
      }
      this.obH.Fn(getContext().getString(R.l.dPv));
      GMTrace.o(8925613129728L, 66501);
      return;
    }
    ab(paramLinkedList);
    GMTrace.o(8925613129728L, 66501);
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(8925076258816L, 66497);
    if (paramBoolean) {
      d(paramString2, c.d.nZw);
    }
    for (;;)
    {
      this.obN.aZL().remove(Long.valueOf(paramLong));
      GMTrace.o(8925076258816L, 66497);
      return;
      this.obH.Fn(paramString1);
      paramString1 = (e.b)this.obN.aZL().get(Long.valueOf(paramLong));
      if (paramString1 != null) {
        d(c.b(paramString1.nZY), paramString1.nZZ);
      }
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(8924942041088L, 66496);
    if (paramBoolean1) {
      d(paramString2, c.d.nZw);
    }
    for (;;)
    {
      this.obN.aZL().remove(Long.valueOf(paramLong));
      GMTrace.o(8924942041088L, 66496);
      return;
      if (paramBoolean2)
      {
        d(paramString2, c.d.nZv);
      }
      else
      {
        this.obH.Fn(paramString1);
        paramString1 = (e.b)this.obN.aZL().get(Long.valueOf(paramLong));
        if (paramString1 != null)
        {
          d(c.b(paramString1.nZY), paramString1.nZZ);
          d(c.c(paramString1.nZY), paramString1.nZZ);
        }
      }
    }
  }
  
  public final void b(int paramInt1, int paramInt2, LinkedList<awu> paramLinkedList)
  {
    int i = 0;
    GMTrace.i(8925747347456L, 66502);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramLinkedList != null))
    {
      a(e.d.oad);
      if (this.obP != null)
      {
        b localb = this.obP;
        localb.obX.obN.aZO().clear();
        localb.obX.obN.aZK().clear();
        localb.ocg.clear();
        localb.och.clear();
        LinkedList localLinkedList = null;
        Object localObject1 = localLinkedList;
        if (paramLinkedList != null)
        {
          localObject1 = localLinkedList;
          if (paramLinkedList.size() > 0)
          {
            localLinkedList = new LinkedList();
            paramInt2 = paramLinkedList.size();
            paramInt1 = 0;
            if (paramInt1 < paramInt2)
            {
              localObject1 = (awu)paramLinkedList.get(paramInt1);
              Object localObject2 = new awv();
              ((awv)localObject2).uLI = ((awu)localObject1).jhi;
              localLinkedList.add(localObject2);
              localb.obX.obN.aZK().put(((awu)localObject1).ujf, ((awu)localObject1).jhi);
              localObject2 = localb.och;
              if (localObject1 == null) {
                localObject1 = "";
              }
              for (;;)
              {
                ((HashMap)localObject2).put(localObject1, Integer.valueOf(0));
                paramInt1 += 1;
                break;
                if (((awu)localObject1).ujf != null) {
                  localObject1 = ((awu)localObject1).ujf;
                } else {
                  localObject1 = ((awu)localObject1).jhi;
                }
              }
            }
            if (localb.obX.obP != null)
            {
              paramInt2 = localb.ocf.length;
              paramInt1 = i;
              while (paramInt1 < paramInt2)
              {
                paramLinkedList = localb.ocf[paramInt1];
                if (!bg.nm((String)localb.obX.obN.aZK().get(c.c(paramLinkedList))))
                {
                  localb.obX.obP.e(paramLinkedList);
                  localb.obX.obN.a(paramLinkedList);
                }
                paramInt1 += 1;
              }
            }
            localObject1 = localLinkedList;
          }
        }
        localb.obX.obN.nZL = ((LinkedList)localObject1);
        this.obP.aZP();
        baa();
        GMTrace.o(8925747347456L, 66502);
      }
    }
    else
    {
      a(e.d.oaa);
      this.obH.Fn(getContext().getString(R.l.dPv));
    }
    GMTrace.o(8925747347456L, 66502);
  }
  
  public final void gM(boolean paramBoolean)
  {
    GMTrace.i(8925478912000L, 66500);
    GMTrace.o(8925478912000L, 66500);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8924673605632L, 66494);
    if ((paramInt == 4) && (this.obF.isShowing()))
    {
      this.obF.dismiss();
      GMTrace.o(8924673605632L, 66494);
      return true;
    }
    GMTrace.o(8924673605632L, 66494);
    return false;
  }
  
  private final class a
  {
    private int ocb;
    public boolean occ;
    ae ocd;
    
    public a()
    {
      GMTrace.i(8910178091008L, 66386);
      this.ocb = 0;
      if (RadarViewController.this.getContext().getResources().getDisplayMetrics().densityDpi <= 240) {
        bool = true;
      }
      this.occ = bool;
      this.ocd = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(8914070405120L, 66415);
          View localView;
          if ((paramAnonymousMessage.obj instanceof View))
          {
            localView = (View)paramAnonymousMessage.obj;
            localView.setVisibility(0);
            localView.clearAnimation();
            if (!RadarViewController.a.this.occ)
            {
              paramAnonymousMessage = localView.getTag(33554434);
              if (!(paramAnonymousMessage instanceof Animation)) {
                break label92;
              }
            }
          }
          label92:
          for (paramAnonymousMessage = (Animation)paramAnonymousMessage;; paramAnonymousMessage = null)
          {
            Object localObject = paramAnonymousMessage;
            if (paramAnonymousMessage == null) {
              localObject = RadarViewController.a.this.getInAnimation();
            }
            localView.startAnimation((Animation)localObject);
            GMTrace.o(8914070405120L, 66415);
            return;
          }
        }
      };
      GMTrace.o(8910178091008L, 66386);
    }
    
    static int cn(View paramView)
    {
      GMTrace.i(8910714961920L, 66390);
      paramView = paramView.getTag(33554433);
      if ((paramView instanceof Integer))
      {
        int i = ((Integer)paramView).intValue();
        GMTrace.o(8910714961920L, 66390);
        return i;
      }
      GMTrace.o(8910714961920L, 66390);
      return -1;
    }
    
    public final int bab()
    {
      GMTrace.i(8910580744192L, 66389);
      int i = this.ocb + 1;
      this.ocb = i;
      GMTrace.o(8910580744192L, 66389);
      return i;
    }
    
    public final void f(int paramInt, View paramView)
    {
      GMTrace.i(8910446526464L, 66388);
      Message localMessage = this.ocd.obtainMessage();
      localMessage.what = cn(paramView);
      localMessage.obj = paramView;
      paramView.setVisibility(4);
      this.ocd.sendMessageDelayed(localMessage, (paramInt + 1) * 500);
      GMTrace.o(8910446526464L, 66388);
    }
    
    public final Animation getInAnimation()
    {
      GMTrace.i(8910312308736L, 66387);
      Animation localAnimation = AnimationUtils.loadAnimation(RadarViewController.this.getContext(), R.a.aLP);
      GMTrace.o(8910312308736L, 66387);
      return localAnimation;
    }
  }
  
  public final class b
    extends a
  {
    private Context context;
    public awx[] ocf;
    public HashMap<String, any> ocg;
    public HashMap<String, Integer> och;
    RadarViewController.a oci;
    private int ocj;
    public HashMap<String, View> ock;
    private boolean ocl;
    
    public b(RadarSpecialGridView paramRadarSpecialGridView, Context paramContext)
    {
      super(paramContext);
      GMTrace.i(8910983397376L, 66392);
      this.ocf = new awx[12];
      this.ocg = new HashMap();
      this.och = new HashMap();
      this.ocj = 0;
      this.ock = new HashMap();
      this.ocl = false;
      this.context = paramContext;
      this.oci = new RadarViewController.a(RadarViewController.this);
      GMTrace.o(8910983397376L, 66392);
    }
    
    private View B(View paramView, int paramInt)
    {
      GMTrace.i(8911654486016L, 66397);
      View localView = paramView;
      if (paramView == null)
      {
        localView = View.inflate(this.context, R.i.cEb, null);
        localView.setTag(33554433, Integer.valueOf(this.oci.bab()));
        localView.setTag(33554434, this.oci.getInAnimation());
      }
      localView.findViewById(R.h.bVY).setVisibility(8);
      localView.findViewById(R.h.bVZ).setVisibility(8);
      localView.findViewById(R.h.bWa).setVisibility(4);
      localView.findViewById(R.h.bVS).setVisibility(4);
      localView.findViewById(R.h.bVR).setVisibility(4);
      if ((paramInt == 7) || (paramInt % 3 == 1))
      {
        localView.findViewById(R.h.bis).setVisibility(0);
        localView.findViewById(R.h.cic).setVisibility(8);
      }
      for (;;)
      {
        GMTrace.o(8911654486016L, 66397);
        return localView;
        localView.findViewById(R.h.cic).setVisibility(0);
        localView.findViewById(R.h.bis).setVisibility(8);
      }
    }
    
    protected static boolean d(awx paramawx)
    {
      GMTrace.i(8911117615104L, 66393);
      if ((paramawx == null) || ((bg.nl(paramawx.jhi).equals("")) && (bg.nl(paramawx.ujf).equals(""))))
      {
        GMTrace.o(8911117615104L, 66393);
        return true;
      }
      GMTrace.o(8911117615104L, 66393);
      return false;
    }
    
    public final View A(View paramView, int paramInt)
    {
      GMTrace.i(8911520268288L, 66396);
      w.d("MicroMsg.Radar.RadarViewController", "getview RadarStatus%s", new Object[] { RadarViewController.a(RadarViewController.this) });
      awx localawx = (awx)this.ocf[paramInt];
      String str;
      Object localObject1;
      View localView;
      if (!d(localawx))
      {
        str = c.b(localawx);
        localObject1 = RadarViewController.a(RadarViewController.this);
        if (paramView != null) {
          break label1216;
        }
        localView = View.inflate(this.context, R.i.cEb, null);
        localView.setTag(33554433, Integer.valueOf(this.oci.bab()));
        localView.setTag(33554434, this.oci.getInAnimation());
      }
      for (;;)
      {
        Object localObject2 = (ImageView)localView.findViewById(R.h.bVY);
        RadarStateView localRadarStateView = (RadarStateView)localView.findViewById(R.h.bVS);
        TextView localTextView = (TextView)localView.findViewById(R.h.bWa);
        ImageView localImageView = (ImageView)localView.findViewById(R.h.bVZ);
        RadarStateChooseView localRadarStateChooseView = (RadarStateChooseView)localView.findViewById(R.h.bVR);
        ((ImageView)localObject2).setVisibility(0);
        localRadarStateView.setVisibility(0);
        localTextView.setVisibility(0);
        localImageView.setVisibility(0);
        label291:
        label551:
        boolean bool;
        if ((localObject1 == e.d.oaa) || (localObject1 == e.d.oab))
        {
          localRadarStateView.setVisibility(0);
          localRadarStateChooseView.setVisibility(8);
          localView.setTag(new a(localTextView, (ImageView)localObject2, localRadarStateView, localRadarStateChooseView, localImageView));
          if ((paramInt != 7) && (paramInt % 3 != 1)) {
            break label748;
          }
          localView.findViewById(R.h.bis).setVisibility(0);
          localView.findViewById(R.h.cic).setVisibility(8);
          if ((paramView == null) || (localView != paramView)) {
            this.ock.put(str, localView);
          }
          localObject2 = (a)localView.getTag();
          ((a)localObject2).ocm.setText(h.b(RadarViewController.this.getContext(), localawx.jio, ((a)localObject2).ocm.getTextSize()));
          b.a.a(((a)localObject2).ocn, str);
          localView.findViewById(R.h.bVI).setTag(new RadarViewController.c(RadarViewController.this, localawx));
          if ((RadarViewController.a(RadarViewController.this) != e.d.oaa) && (RadarViewController.a(RadarViewController.this) != e.d.oab)) {
            break label886;
          }
          ((a)localObject2).oco.setBackgroundResource(R.g.aZO);
          paramView = ((a)localObject2).ocp;
          paramView.obc = true;
          paramView.aZU();
          paramView = ((a)localObject2).ocq;
          paramView.oaY = false;
          paramView.setVisibility(8);
          localObject1 = RadarViewController.d(RadarViewController.this).a(localawx, false);
          paramView = (View)localObject1;
          if (localObject1 == null)
          {
            paramView = RadarViewController.e(RadarViewController.this).Fm(str);
            localObject1 = RadarViewController.d(RadarViewController.this);
            ((e)localObject1).b(localawx.jhi, paramView);
            ((e)localObject1).b(localawx.ujf, paramView);
          }
          localObject1 = RadarViewController.d(RadarViewController.this).a(localawx, true);
          localRadarStateView = ((a)localObject2).ocp;
          if (localObject1 == null) {
            break label776;
          }
          localRadarStateView.init();
          localRadarStateView.obd.removeMessages(0);
          localRadarStateView.clearAnimation();
          localRadarStateView.nZZ = ((c.d)localObject1);
          localRadarStateView.oaV = false;
          localRadarStateView.aZU();
          localObject1 = ((a)localObject2).ocp;
          ((RadarStateView)localObject1).init();
          w.d("MicroMsg.RadarStateView", " turnToState : " + paramView);
          bool = false;
          if (((RadarStateView)localObject1).nZZ != paramView) {
            break label784;
          }
          ((RadarStateView)localObject1).aZU();
          label640:
          paramView = RadarViewController.d(RadarViewController.this);
          paramView.a(localawx.jhi, null);
          paramView.a(localawx.ujf, null);
          if (paramInt == 0) {
            this.ocj = this.och.size();
          }
          paramView = localView;
          if (this.och.remove(str) != null)
          {
            this.oci.f(this.ocj - this.och.size(), localView);
            paramView = localView;
          }
        }
        for (;;)
        {
          GMTrace.o(8911520268288L, 66396);
          return paramView;
          localRadarStateView.setVisibility(8);
          localRadarStateChooseView.setVisibility(0);
          break;
          label748:
          localView.findViewById(R.h.cic).setVisibility(0);
          localView.findViewById(R.h.bis).setVisibility(8);
          break label291;
          label776:
          localObject1 = c.d.nZu;
          break label551;
          label784:
          if (((RadarStateView)localObject1).getVisibility() == 0) {}
          for (int i = 1;; i = 0)
          {
            if (i != 0)
            {
              ((RadarStateView)localObject1).aZW();
              bool = true;
            }
            w.d("MicroMsg.RadarStateView", " delay : " + bool);
            ((RadarStateView)localObject1).nZZ = paramView;
            if (((RadarStateView)localObject1).nZZ == c.d.nZu) {
              break;
            }
            if (bool) {
              break label870;
            }
            ((RadarStateView)localObject1).obd.sendEmptyMessage(0);
            break;
          }
          label870:
          ((RadarStateView)localObject1).obd.sendEmptyMessageDelayed(0, 320L);
          break label640;
          label886:
          if (!bg.nm((String)RadarViewController.d(RadarViewController.this).aZK().get(c.c(localawx))))
          {
            paramView = ((a)localObject2).ocp;
            paramView.obc = false;
            paramView.setVisibility(8);
            paramView = ((a)localObject2).ocq;
            paramView.oaY = true;
            paramView.aZU();
            paramView = RadarViewController.d(RadarViewController.this);
            if ((paramView.aZO() != null) && (localawx != null))
            {
              localObject1 = c.b(localawx);
              if (paramView.aZO().containsKey(localObject1))
              {
                paramView = (e.a)paramView.aZO().get(localObject1);
                label1001:
                if (paramView != e.a.nZW) {
                  break label1153;
                }
                ((a)localObject2).oco.setBackgroundResource(R.k.cOn);
                label1019:
                localObject1 = ((a)localObject2).ocq;
                if (((RadarStateChooseView)localObject1).oaZ != paramView)
                {
                  ((RadarStateChooseView)localObject1).oaZ = paramView;
                  if (((RadarStateChooseView)localObject1).oaZ != e.a.nZV) {
                    break label1165;
                  }
                  if (((RadarStateChooseView)localObject1).oaY)
                  {
                    ((RadarStateChooseView)localObject1).init();
                    ((RadarStateChooseView)localObject1).aZU();
                    ((RadarStateChooseView)localObject1).oaV = true;
                    ((RadarStateChooseView)localObject1).startAnimation(((RadarStateChooseView)localObject1).oaW);
                  }
                }
              }
            }
            for (;;)
            {
              if (paramInt == 0) {
                this.ocj = this.och.size();
              }
              paramView = localView;
              if (this.och.remove(c.c(localawx)) == null) {
                break;
              }
              this.oci.f(this.ocj - this.och.size(), localView);
              paramView = localView;
              break;
              paramView = e.a.nZW;
              break label1001;
              label1153:
              ((a)localObject2).oco.setBackgroundDrawable(null);
              break label1019;
              label1165:
              if (((RadarStateChooseView)localObject1).oaY)
              {
                ((RadarStateChooseView)localObject1).init();
                ((RadarStateChooseView)localObject1).aZU();
                ((RadarStateChooseView)localObject1).startAnimation(((RadarStateChooseView)localObject1).oaX);
              }
            }
          }
          paramView = B(paramView, paramInt);
          continue;
          paramView = B(paramView, paramInt);
        }
        label1216:
        localView = paramView;
      }
    }
    
    public final void ad(LinkedList<awx> paramLinkedList)
    {
      GMTrace.i(8911251832832L, 66394);
      if (paramLinkedList.size() == 0)
      {
        GMTrace.o(8911251832832L, 66394);
        return;
      }
      int j = this.ocf.length;
      int i = 0;
      awx localawx;
      while (i < j)
      {
        localObject = paramLinkedList.iterator();
        while (((Iterator)localObject).hasNext())
        {
          localawx = (awx)((Iterator)localObject).next();
          if (c.c(localawx).equals(c.c(this.ocf[i]))) {
            paramLinkedList.remove(localawx);
          }
        }
        i += 1;
      }
      Object localObject = paramLinkedList.iterator();
      label223:
      while (((Iterator)localObject).hasNext())
      {
        localawx = (awx)((Iterator)localObject).next();
        j = Math.abs((int)System.currentTimeMillis() % 6);
        i = 0;
        for (;;)
        {
          if (i >= this.ocf.length) {
            break label223;
          }
          int k = (i + j) % 12;
          if ((k != 4) && (k != 7) && (d(this.ocf[k])))
          {
            this.ocf[k] = localawx;
            this.och.put(c.b(localawx), Integer.valueOf(0));
            break;
          }
          i += 1;
        }
      }
      if (paramLinkedList.size() > 0)
      {
        super.aZP();
        localObject = d.nZz;
        i = paramLinkedList.size();
        if ((((d)localObject).eMK == 0) && (i > 0))
        {
          float f = (float)(d.aZG() - ((d)localObject).nZD) * 1.0F / 1000.0F;
          w.d("MicroMsg.RadarKvStatReport", "FoundFirstFriendTimeSpent %s", new Object[] { Float.valueOf(f) });
          g.ork.A(10682, String.format("%s", new Object[] { Float.valueOf(f) }));
        }
        ((d)localObject).eMK += i;
        ((d)localObject).nZE = (i + ((d)localObject).nZE);
      }
      GMTrace.o(8911251832832L, 66394);
    }
    
    public final void e(awx paramawx)
    {
      GMTrace.i(8911788703744L, 66398);
      if (d(paramawx))
      {
        GMTrace.o(8911788703744L, 66398);
        return;
      }
      Object localObject = c.b(paramawx);
      paramawx = (awx)localObject;
      if (RadarViewController.d(RadarViewController.this).aZK().containsKey(localObject)) {
        paramawx = (String)RadarViewController.d(RadarViewController.this).aZK().get(localObject);
      }
      localObject = new any();
      ((any)localObject).ufE = com.tencent.mm.platformtools.n.ni(paramawx);
      this.ocg.put(paramawx, localObject);
      GMTrace.o(8911788703744L, 66398);
    }
    
    public final void f(awx paramawx)
    {
      GMTrace.i(8911922921472L, 66399);
      if (d(paramawx))
      {
        GMTrace.o(8911922921472L, 66399);
        return;
      }
      String str = c.b(paramawx);
      paramawx = str;
      if (RadarViewController.d(RadarViewController.this).aZK().containsKey(str)) {
        paramawx = (String)RadarViewController.d(RadarViewController.this).aZK().get(str);
      }
      this.ocg.remove(paramawx);
      GMTrace.o(8911922921472L, 66399);
    }
    
    public final int getCount()
    {
      GMTrace.i(8911386050560L, 66395);
      if (this.ocl)
      {
        GMTrace.o(8911386050560L, 66395);
        return 0;
      }
      int i = this.ocf.length;
      GMTrace.o(8911386050560L, 66395);
      return i;
    }
    
    public final class a
    {
      TextView ocm;
      ImageView ocn;
      ImageView oco;
      RadarStateView ocp;
      RadarStateChooseView ocq;
      
      public a(TextView paramTextView, ImageView paramImageView1, RadarStateView paramRadarStateView, RadarStateChooseView paramRadarStateChooseView, ImageView paramImageView2)
      {
        GMTrace.i(8901185503232L, 66319);
        this.ocm = paramTextView;
        this.ocn = paramImageView1;
        this.ocp = paramRadarStateView;
        this.oco = paramImageView2;
        this.ocq = paramRadarStateChooseView;
        GMTrace.o(8901185503232L, 66319);
      }
    }
  }
  
  public final class c
  {
    public awx nZY;
    
    public c(awx paramawx)
    {
      GMTrace.i(8928029048832L, 66519);
      this.nZY = paramawx;
      GMTrace.o(8928029048832L, 66519);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarViewController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Spannable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.a;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.g;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.l;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
  implements com.tencent.mm.plugin.wenote.model.nativenote.b.c
{
  public static int mScreenHeight;
  public static int mScreenWidth;
  public static k sft;
  private static DisplayMetrics sfu;
  public static int sfv;
  private static int sfx;
  public int LQ;
  public long eDp;
  public int iDc;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.b sfA;
  private boolean sfB;
  public int sfC;
  public String sfD;
  public long sfE;
  public boolean sfF;
  public int sfG;
  public boolean sfH;
  private View.OnKeyListener sfI;
  public final aj sfJ;
  private transient ArrayList<WXRTEditText> sfr;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a sfs;
  private int sfw;
  public long sfy;
  private String sfz;
  
  static
  {
    GMTrace.i(17233824710656L, 128402);
    sft = null;
    sfv = -1;
    sfx = -1;
    GMTrace.o(17233824710656L, 128402);
  }
  
  public k(com.tencent.mm.plugin.wenote.model.nativenote.b.a parama, Context paramContext)
  {
    GMTrace.i(17231945662464L, 128388);
    this.sfs = null;
    this.sfy = -1L;
    this.sfz = "";
    this.eDp = -1L;
    this.sfA = null;
    this.sfB = false;
    this.sfC = -1;
    this.sfD = null;
    this.sfE = -1L;
    this.sfF = false;
    this.sfG = 0;
    this.sfH = false;
    this.sfI = new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(20644834050048L, 153816);
        if ((paramAnonymousKeyEvent.getAction() == 0) && (paramAnonymousKeyEvent.getKeyCode() == 67))
        {
          if (c.bHo().size() == 0)
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          WXRTEditText localWXRTEditText = k.this.bHW();
          if (localWXRTEditText == null)
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          paramAnonymousInt = localWXRTEditText.bHM();
          paramAnonymousView = c.bHo().yD(paramAnonymousInt);
          if (paramAnonymousView == null)
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          paramAnonymousKeyEvent = c.bHo().yD(paramAnonymousInt - 1);
          switch (localWXRTEditText.seM)
          {
          default: 
          case 0: 
            for (;;)
            {
              GMTrace.o(20644834050048L, 153816);
              return true;
              int i = localWXRTEditText.getSelectionStart();
              if (i != localWXRTEditText.getSelectionEnd())
              {
                GMTrace.o(20644834050048L, 153816);
                return false;
              }
              if (i == localWXRTEditText.bHS().Vw)
              {
                localWXRTEditText.seX = true;
                k.this.b(u.shB, Boolean.valueOf(false));
                k.this.b(u.shC, Boolean.valueOf(false));
                k.this.b(u.shA, Boolean.valueOf(false));
                k.this.sfA.jN(false);
                k.this.sfA.jO(false);
                k.this.sfA.jP(false);
                localWXRTEditText.seX = false;
              }
              if ((i != 0) || (paramAnonymousInt == 0))
              {
                GMTrace.o(20644834050048L, 153816);
                return false;
              }
              if (paramAnonymousKeyEvent == null)
              {
                GMTrace.o(20644834050048L, 153816);
                return false;
              }
              paramAnonymousView = localWXRTEditText.a(i.sfn);
              c.bHo().bHr();
              if (paramAnonymousKeyEvent.getType() != 1) {
                break;
              }
              bool = c.bHo().Q(paramAnonymousInt, true);
              paramAnonymousKeyEvent = (h)paramAnonymousKeyEvent;
              i = paramAnonymousKeyEvent.scM.getText().toString().length();
              paramAnonymousKeyEvent.content += paramAnonymousView;
              paramAnonymousKeyEvent.scJ = i;
              paramAnonymousKeyEvent.scH = true;
              paramAnonymousKeyEvent.scN = false;
              label406:
              if (k.this.sfs != null)
              {
                if (!bool) {
                  break label477;
                }
                k.this.sfs.yw(paramAnonymousInt - 1);
              }
            }
            if (!bg.nm(paramAnonymousView)) {
              break;
            }
          }
        }
        for (boolean bool = c.bHo().Q(paramAnonymousInt, true);; bool = false)
        {
          paramAnonymousKeyEvent.scL.setSelection(0);
          paramAnonymousKeyEvent.scH = true;
          paramAnonymousKeyEvent.scN = false;
          break label406;
          label477:
          k.this.sfs.dK(paramAnonymousInt - 1, 2);
          break;
          if (paramAnonymousInt == 0)
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          if (paramAnonymousKeyEvent == null)
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          c.bHo().bHr();
          if (paramAnonymousKeyEvent.getType() == 1)
          {
            paramAnonymousKeyEvent = (h)paramAnonymousKeyEvent;
            if (bg.nm(paramAnonymousKeyEvent.content))
            {
              paramAnonymousView.scK.setSelection(0);
              paramAnonymousView.scH = true;
              paramAnonymousView.scN = true;
              c.bHo().Q(paramAnonymousInt - 1, true);
              GMTrace.o(20644834050048L, 153816);
              return true;
            }
            if (paramAnonymousKeyEvent.content.endsWith("<br/>")) {
              paramAnonymousKeyEvent.content = paramAnonymousKeyEvent.content.substring(0, paramAnonymousKeyEvent.content.length() - 5);
            }
            paramAnonymousKeyEvent.scJ = -1;
            paramAnonymousKeyEvent.scH = true;
            paramAnonymousKeyEvent.scN = false;
          }
          while (k.this.sfs != null)
          {
            k.this.sfs.dK(paramAnonymousInt - 1, 2);
            break;
            paramAnonymousKeyEvent.scL.setSelection(0);
            paramAnonymousKeyEvent.scH = true;
            paramAnonymousKeyEvent.scN = false;
          }
          if ((paramAnonymousView.getType() == 4) && (((com.tencent.mm.plugin.wenote.model.a.k)paramAnonymousView).scV.booleanValue()))
          {
            GMTrace.o(20644834050048L, 153816);
            return false;
          }
          if ((!paramAnonymousView.scO) && (paramAnonymousView.getType() != -1))
          {
            c.bHo().R(paramAnonymousInt, true);
            GMTrace.o(20644834050048L, 153816);
            return true;
          }
          c.bHo().bHr();
          c.bHo().Q(paramAnonymousInt, false);
          if (k.this.sfs != null) {
            k.this.sfs.yy(paramAnonymousInt);
          }
          paramAnonymousView = new h();
          paramAnonymousView.scH = true;
          paramAnonymousView.scN = false;
          paramAnonymousView.content = "";
          paramAnonymousView.scJ = 0;
          c.bHo().a(paramAnonymousInt, paramAnonymousView);
          c.bHo().dN(paramAnonymousInt - 1, paramAnonymousInt + 1);
          break;
          GMTrace.o(20644834050048L, 153816);
          return false;
        }
      }
    };
    this.sfJ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20634767720448L, 153741);
        if (-1L == k.this.sfy)
        {
          GMTrace.o(20634767720448L, 153741);
          return false;
        }
        k.this.bHY();
        GMTrace.o(20634767720448L, 153741);
        return true;
      }
    }, true);
    this.sfr = new ArrayList();
    this.sfs = parama;
    sft = this;
    this.LQ = com.tencent.mm.pluginsdk.e.bX(paramContext);
    this.iDc = com.tencent.mm.pluginsdk.e.dH(paramContext);
    parama = com.tencent.mm.compatible.util.j.aO(paramContext);
    mScreenHeight = parama[1];
    mScreenWidth = parama[0];
    sfu = paramContext.getResources().getDisplayMetrics();
    this.sfw = (mScreenHeight - this.LQ - this.iDc - (int)ak(8.0F));
    this.sfz = c.bHo().bHv();
    com.tencent.mm.plugin.wenote.model.nativenote.spans.m.she = 0.0F;
    GMTrace.o(17231945662464L, 128388);
  }
  
  private void aM(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(18933826453504L, 141068);
        ft localft = new ft();
        localft.eIo.type = 19;
        localft.eIo.eDx = c.bHo().NH(paramString);
        if (localft.eIo.eDx == null)
        {
          w.e("noteeditor.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
          GMTrace.o(18933826453504L, 141068);
          return;
        }
        localft.eIo.title = paramString;
        localft.eIo.eDp = this.eDp;
        paramString = localft.eIo;
        int i;
        if (paramBoolean)
        {
          i = 1;
          paramString.eIv = i;
          localft.eIo.desc = "fav_update_note_storage";
          com.tencent.mm.sdk.b.a.vgX.m(localft);
          if (paramBoolean)
          {
            this.sfC = localft.eIo.eIr.getIntExtra("fav_note_item_status", -1);
            this.sfD = localft.eIo.eIr.getStringExtra("fav_note_xml");
            this.sfE = localft.eIo.eIr.getLongExtra("fav_note_item_updatetime", -1L);
          }
          GMTrace.o(18933826453504L, 141068);
        }
        else
        {
          i = 0;
        }
      }
      finally {}
    }
  }
  
  public static float ak(float paramFloat)
  {
    GMTrace.i(20644162961408L, 153811);
    paramFloat = TypedValue.applyDimension(1, paramFloat, sfu);
    GMTrace.o(20644162961408L, 153811);
    return paramFloat;
  }
  
  public static k bHX()
  {
    GMTrace.i(17232885186560L, 128395);
    k localk = sft;
    GMTrace.o(17232885186560L, 128395);
    return localk;
  }
  
  private void ctY()
  {
    GMTrace.i(21058224652288L, 156896);
    if ((this.sfy < 0L) && (this.eDp > 0L))
    {
      this.sfJ.z(60000L, 60000L);
      this.sfy = bg.Pw();
      this.sfz = c.bHo().bHv();
    }
    GMTrace.o(21058224652288L, 156896);
  }
  
  public final void a(WXRTEditText paramWXRTEditText, int paramInt1, int paramInt2)
  {
    GMTrace.i(17232616751104L, 128393);
    if ((this.sfG != 2) || (!this.sfH))
    {
      GMTrace.o(17232616751104L, 128393);
      return;
    }
    if (paramWXRTEditText == null)
    {
      GMTrace.o(17232616751104L, 128393);
      return;
    }
    if (this.sfs != null) {
      this.sfs.dL(paramInt1, paramInt2);
    }
    boolean bool8;
    boolean bool7;
    boolean bool6;
    boolean bool5;
    if (paramWXRTEditText.seM == 0)
    {
      Iterator localIterator = u.shE.iterator();
      boolean bool1 = false;
      boolean bool4 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      t localt;
      for (;;)
      {
        bool8 = bool1;
        bool7 = bool4;
        bool6 = bool3;
        bool5 = bool2;
        if (!localIterator.hasNext()) {
          break label208;
        }
        localt = (t)localIterator.next();
        if (!localt.q(paramWXRTEditText)) {
          break label262;
        }
        if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.b))
        {
          bool2 = true;
        }
        else if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.c))
        {
          bool3 = true;
        }
        else
        {
          if (!(localt instanceof l)) {
            break;
          }
          bool4 = true;
        }
      }
      if (!(localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.j)) {
        break label262;
      }
      bool1 = true;
    }
    label208:
    label262:
    for (;;)
    {
      break;
      bool8 = false;
      bool7 = false;
      bool6 = false;
      bool5 = false;
      this.sfA.jM(bool5);
      this.sfA.jN(bool6);
      this.sfA.jO(bool7);
      this.sfA.jP(bool8);
      GMTrace.o(17232616751104L, 128393);
      return;
    }
  }
  
  public final void a(WXRTEditText paramWXRTEditText, Spannable paramSpannable1, Spannable paramSpannable2, int paramInt)
  {
    GMTrace.i(20644028743680L, 153810);
    String str = paramWXRTEditText.a(i.sfn);
    if (paramWXRTEditText.seM == 0)
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = c.bHo().yD(paramWXRTEditText.bHM());
      if ((localb != null) && (localb.getType() == 1))
      {
        int i;
        if (paramSpannable1 == null)
        {
          i = 0;
          if (paramSpannable2 != null) {
            break label124;
          }
        }
        label124:
        for (int j = 0;; j = com.tencent.mm.plugin.wenote.b.b.NO(paramSpannable2.toString()))
        {
          if (!c.bHo().dM(j - i, 0)) {
            break label136;
          }
          this.sfs.bGZ();
          this.sfs.yw(paramWXRTEditText.bHM());
          GMTrace.o(20644028743680L, 153810);
          return;
          i = com.tencent.mm.plugin.wenote.b.b.NO(paramSpannable1.toString());
          break;
        }
        label136:
        c.bHo().bHr();
        ((h)localb).scJ = paramInt;
        ((h)localb).content = str;
        ((h)localb).scH = true;
        localb.scN = false;
        paramWXRTEditText = c.bHo();
        paramWXRTEditText.sdX = (j - i + paramWXRTEditText.sdX);
      }
      GMTrace.o(20644028743680L, 153810);
      return;
    }
    paramWXRTEditText.setText("");
    if (bg.nm(str))
    {
      GMTrace.o(20644028743680L, 153810);
      return;
    }
    paramSpannable2 = new h();
    if (str.equals("<br/>")) {}
    for (paramSpannable1 = "";; paramSpannable1 = str)
    {
      paramSpannable2.content = paramSpannable1;
      paramInt = c.bHo().a(paramSpannable2, paramWXRTEditText, true, false, false);
      c.bHo().dN(paramInt - 1, paramInt + 1);
      GMTrace.o(20644028743680L, 153810);
      return;
    }
  }
  
  public final void a(WXRTEditText paramWXRTEditText, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(17232482533376L, 128392);
    if (paramBoolean) {}
    try
    {
      ctY();
      if (this.sfs != null) {
        this.sfs.a(paramWXRTEditText, paramBoolean, paramInt);
      }
      GMTrace.o(17232482533376L, 128392);
      return;
    }
    finally {}
  }
  
  public final void b(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(17233153622016L, 128397);
    this.sfs.a(paramWXRTEditText);
    GMTrace.o(17233153622016L, 128397);
  }
  
  public final <V, C extends g<V>> void b(t<V, C> paramt, V paramV)
  {
    GMTrace.i(20644297179136L, 153812);
    WXRTEditText localWXRTEditText = bHW();
    if (localWXRTEditText != null)
    {
      if (localWXRTEditText.seM == 0)
      {
        int i = localWXRTEditText.bHL().Vw;
        int j = localWXRTEditText.getText().length();
        if (((paramV instanceof Boolean)) && (((Boolean)paramV).booleanValue()) && (i == j))
        {
          localWXRTEditText.bHN();
          localWXRTEditText.getText().append("\n");
          localWXRTEditText.bHO();
          localWXRTEditText.setSelection(i);
        }
        localWXRTEditText.a(paramt, paramV);
        GMTrace.o(20644297179136L, 153812);
        return;
      }
      localWXRTEditText.seY = true;
      localWXRTEditText.scR = paramt.bIq();
      localWXRTEditText.getText().append("\n");
    }
    GMTrace.o(20644297179136L, 153812);
  }
  
  public final WXRTEditText bHW()
  {
    GMTrace.i(17232214097920L, 128390);
    Object localObject1 = c.bHo();
    ArrayList localArrayList = this.sfr;
    if (localArrayList != null) {
      localArrayList.clear();
    }
    label148:
    for (;;)
    {
      com.tencent.mm.plugin.wenote.model.a.b localb;
      try
      {
        if (((c)localObject1).iFZ == null)
        {
          if (this.sfr != null) {
            break;
          }
          GMTrace.o(17232214097920L, 128390);
          return null;
        }
        Iterator localIterator = ((c)localObject1).iFZ.iterator();
        if (!localIterator.hasNext()) {
          break label148;
        }
        localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        if (localb.scM != null)
        {
          localArrayList.add(localb.scM);
          continue;
        }
        if (localb.scK == null) {
          continue;
        }
      }
      finally {}
      if (localb.scL != null)
      {
        ((ArrayList)localObject2).add(localb.scK);
        ((ArrayList)localObject2).add(localb.scL);
      }
    }
    localObject1 = this.sfr.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      WXRTEditText localWXRTEditText = (WXRTEditText)((Iterator)localObject1).next();
      if (localWXRTEditText.hasFocus())
      {
        GMTrace.o(17232214097920L, 128390);
        return localWXRTEditText;
      }
    }
    GMTrace.o(17232214097920L, 128390);
    return null;
  }
  
  public final void bHY()
  {
    GMTrace.i(17233422057472L, 128399);
    if ((this.eDp > 0L) && (this.sfy > 0L))
    {
      String str = c.bHo().bHv();
      if (!str.equals(this.sfz))
      {
        this.sfz = str;
        if (!this.sfB)
        {
          this.sfB = true;
          aM(this.sfz, true);
          GMTrace.o(17233422057472L, 128399);
          return;
        }
        aM(this.sfz, false);
      }
    }
    GMTrace.o(17233422057472L, 128399);
  }
  
  public final WXRTEditText bHZ()
  {
    GMTrace.i(17233556275200L, 128400);
    WXRTEditText localWXRTEditText = bHW();
    if ((localWXRTEditText == null) && (this.sfr.size() > 0))
    {
      localWXRTEditText = (WXRTEditText)this.sfr.get(this.sfr.size() - 1);
      GMTrace.o(17233556275200L, 128400);
      return localWXRTEditText;
    }
    GMTrace.o(17233556275200L, 128400);
    return localWXRTEditText;
  }
  
  public final void bHj()
  {
    GMTrace.i(20643760308224L, 153808);
    if (this.sfs != null) {
      this.sfs.bHj();
    }
    ctY();
    GMTrace.o(20643760308224L, 153808);
  }
  
  public final void bHk()
  {
    GMTrace.i(17233019404288L, 128396);
    this.sfs.bGX();
    GMTrace.o(17233019404288L, 128396);
  }
  
  public final void d(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(20643626090496L, 153807);
    if (this.sfs != null) {
      this.sfs.d(paramBoolean, paramLong);
    }
    GMTrace.o(20643626090496L, 153807);
  }
  
  public final void o(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(17232079880192L, 128389);
    if (paramWXRTEditText.seM == 0) {
      paramWXRTEditText.setTextSize(0, com.tencent.mm.br.a.V(paramWXRTEditText.getContext(), R.f.aQF));
    }
    b.setTextSize(paramWXRTEditText.getTextSize());
    paramWXRTEditText.seC = this;
    paramWXRTEditText.NJ(null);
    paramWXRTEditText.setOnKeyListener(this.sfI);
    GMTrace.o(17232079880192L, 128389);
  }
  
  public final void yA(int paramInt)
  {
    GMTrace.i(20643894525952L, 153809);
    if (this.sfs != null) {
      this.sfs.P(paramInt, 0L);
    }
    GMTrace.o(20643894525952L, 153809);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.f;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.j;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

final class n
  extends ah.a
{
  public static int[] ljT;
  protected TextView hqH;
  protected TextView hqI;
  protected TextView lVH;
  protected TextView ljO;
  private ArrayList<MMImageView> pVg;
  public int wrJ;
  protected MMImageView wrM;
  ImageView wrV;
  protected LinearLayout wsA;
  protected ViewStub wsB;
  protected ImageView wsC;
  protected ImageView wsD;
  protected LinearLayout wsE;
  protected ImageView wsF;
  protected TextView wsG;
  protected TextView wsH;
  protected ImageView wsI;
  protected TextView wsJ;
  protected TextView wsK;
  protected LinearLayout wsL;
  protected ImageView wsM;
  protected ImageView wsN;
  protected TextView wsO;
  private int wsP;
  protected TextView wsb;
  protected ImageView wsi;
  protected ImageView wsj;
  protected TextView wsk;
  protected LinearLayout wsl;
  protected ImageView wsm;
  protected MMPinProgressBtn wsn;
  protected ImageView wso;
  protected ImageView wsp;
  protected ImageView wsq;
  protected ChattingItemFooter wsr;
  protected ImageView wss;
  protected LinearLayout wst;
  protected ViewGroup wsu;
  protected TextView wsv;
  protected LinearLayout wsw;
  protected RelativeLayout wsx;
  protected FrameLayout wsy;
  protected LinearLayout wsz;
  
  static
  {
    GMTrace.i(2367466504192L, 17639);
    ljT = new int[] { R.h.boe, R.h.bof, R.h.bog, R.h.boh, R.h.boi };
    GMTrace.o(2367466504192L, 17639);
  }
  
  public n(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2366392762368L, 17631);
    this.wrJ = 0;
    this.wsP = Integer.MAX_VALUE;
    this.pVg = new ArrayList();
    GMTrace.o(2366392762368L, 17631);
  }
  
  private static void a(En_5b8fbb1e.a parama, n paramn, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, int[] paramArrayOfInt1, String[] paramArrayOfString4, String[] paramArrayOfString5, int[] paramArrayOfInt2, String paramString)
  {
    GMTrace.i(2367332286464L, 17638);
    int i = 0;
    while (i <= 4)
    {
      localObject1 = (MMImageView)paramn.wsA.findViewById(ljT[i]);
      if (localObject1 != null)
      {
        ((MMImageView)localObject1).setImageDrawable(null);
        ((MMImageView)localObject1).setVisibility(8);
      }
      i += 1;
    }
    Object localObject1 = (ImageView)paramn.wsA.findViewById(R.h.boj);
    Object localObject2 = (TextView)paramn.wsA.findViewById(R.h.bod);
    if (localObject1 != null) {
      ((ImageView)localObject1).setVisibility(8);
    }
    if (localObject2 != null) {
      ((TextView)localObject2).setVisibility(8);
    }
    i = 0;
    if (i < paramInt)
    {
      if (paramInt == 1)
      {
        localObject1 = (MMImageView)paramn.wsA.findViewById(ljT[i]);
        ((MMImageView)localObject1).setImageResource(R.k.cLo);
        label157:
        ((MMImageView)localObject1).setVisibility(0);
        an.bJH().a(parama.wvd, paramArrayOfString1[i], bg.Pv(), paramArrayOfString2[i], paramArrayOfString3[i], paramArrayOfInt1[i], paramString);
        localObject2 = com.tencent.mm.ao.n.IZ().l("Note_" + paramArrayOfString1[i], "", "");
        if (!FileOp.aZ((String)localObject2)) {
          break label330;
        }
        localObject2 = com.tencent.mm.ao.n.IZ().a((String)localObject2, true, com.tencent.mm.br.a.getDensity(ab.getContext()), false, true, false, 0, false);
        if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
          break label319;
        }
        ((MMImageView)localObject1).setImageBitmap((Bitmap)localObject2);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject1 = (MMImageView)paramn.wsA.findViewById(ljT[(i + 1)]);
        ((MMImageView)localObject1).setImageResource(R.k.cLn);
        break label157;
        label319:
        ((MMImageView)localObject1).setImageResource(R.k.cLn);
        continue;
        label330:
        an.bJH().a(parama.wvd, paramArrayOfString1[i], bg.Pv(), paramArrayOfString4[i], paramArrayOfString5[i], paramArrayOfInt2[i], paramString);
        com.tencent.mm.ao.n.IZ().l("Note_" + paramArrayOfString1[i], "", "");
        com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, 45);
        if (FileOp.aZ((String)localObject2))
        {
          localObject2 = com.tencent.mm.ao.n.IZ().a((String)localObject2, com.tencent.mm.br.a.getDensity(ab.getContext()));
          if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
            ((MMImageView)localObject1).setImageBitmap((Bitmap)localObject2);
          } else {
            ((MMImageView)localObject1).setImageResource(R.k.cLn);
          }
        }
        else
        {
          w.i("MicroMsg.AppMsgViewHolder", "thumb file not exist!");
        }
      }
    }
    GMTrace.o(2367332286464L, 17638);
  }
  
  static void a(En_5b8fbb1e.a parama, n paramn, f.a parama1, au paramau, boolean paramBoolean)
  {
    GMTrace.i(2367198068736L, 17637);
    Object localObject1 = new mn();
    ((mn)localObject1).eRu.type = 0;
    ((mn)localObject1).eRu.eRw = parama1.giV;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = ((mn)localObject1).eRv.eRE;
    paramn.wsx.setVisibility(8);
    String[] arrayOfString1 = new String[4];
    String[] arrayOfString2 = new String[4];
    int[] arrayOfInt1 = new int[4];
    String[] arrayOfString3 = new String[4];
    String[] arrayOfString4 = new String[4];
    int[] arrayOfInt2 = new int[4];
    String[] arrayOfString5 = new String[4];
    Object localObject3;
    int i;
    int k;
    Object localObject4;
    label268:
    String str;
    if (localObject2 != null)
    {
      parama1 = bg.aq(((com.tencent.mm.protocal.b.a.c)localObject2).desc, parama1.description);
      localObject3 = ((com.tencent.mm.protocal.b.a.c)localObject2).glr.iterator();
      i = 0;
      localObject1 = null;
      k = 0;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (th)((Iterator)localObject3).next();
        if ((bg.nm(((th)localObject4).ujI)) || (!((th)localObject4).ujI.equals(".htm")) || (bg.nm(((th)localObject4).ukv)) || (!((th)localObject4).ukv.equals("WeNoteHtmlFile"))) {
          switch (((th)localObject4).aGU)
          {
          case 3: 
          case 6: 
          case 4: 
          case 5: 
          case 7: 
          default: 
          case 1: 
            do
            {
              do
              {
                break;
              } while (k != 0);
              str = ((th)localObject4).desc;
            } while (bg.nm(str));
            if (bg.nm(str.replaceAll("\n", "").trim())) {
              break label1222;
            }
            localObject1 = ((th)localObject4).desc.replaceAll("&lt;", "<").replaceAll("&gt;", ">");
          }
        }
      }
    }
    label636:
    label1213:
    label1216:
    label1222:
    for (;;)
    {
      k = 1;
      break;
      if (paramBoolean)
      {
        paramn.wsx.setVisibility(0);
        paramn.wrM.setVisibility(0);
        paramn.wrM.setImageResource(R.g.aTK);
      }
      if (i < 4)
      {
        arrayOfString1[i] = ((th)localObject4).giD;
        arrayOfString2[i] = ((th)localObject4).ujp;
        arrayOfInt1[i] = ((int)((th)localObject4).ujZ);
        arrayOfString3[i] = ((th)localObject4).ujt;
        arrayOfString4[i] = ((th)localObject4).ujv;
        arrayOfInt2[i] = ((int)((th)localObject4).ujO);
        arrayOfString5[i] = ((th)localObject4).lhq;
      }
      i += 1;
      break;
      if (!bg.nm(parama1)) {
        break label268;
      }
      parama1 = ab.getContext().getString(R.l.cTf) + ((th)localObject4).title;
      break label268;
      if (localObject1 != null)
      {
        localObject4 = ((String)localObject1).split("\n", 2);
        localObject3 = new ArrayList();
        if (localObject4.length > 0)
        {
          int m = localObject4.length;
          j = 0;
          while (j < m)
          {
            str = localObject4[j];
            if (str.length() > 0) {
              ((ArrayList)localObject3).add(str);
            }
            j += 1;
          }
        }
        if (((ArrayList)localObject3).size() != 1) {
          break label1216;
        }
      }
      for (int j = 1;; j = 0)
      {
        if ((((ArrayList)localObject3).size() == 1) && (((com.tencent.mm.protocal.b.a.c)localObject2).glr.size() == 2))
        {
          localObject2 = ab.getContext().getString(R.l.dvi);
          parama1 = (f.a)localObject1;
          localObject1 = localObject2;
          localObject1 = ((String)localObject1).trim();
          localObject2 = localObject1;
          if (localObject1 != null) {
            localObject2 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
          }
          localObject1 = h.c(paramn.lVH.getContext(), (CharSequence)localObject2, (int)paramn.lVH.getTextSize());
          paramn.lVH.setText((CharSequence)localObject1);
          if ((parama1 == null) || (parama1.length() <= 100)) {
            break label1213;
          }
          parama1 = parama1.substring(0, 100).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
        }
        for (;;)
        {
          localObject1 = h.c(paramn.hqI.getContext(), parama1, (int)paramn.hqI.getTextSize());
          paramn.hqI.setText((CharSequence)localObject1);
          if (i > 0)
          {
            paramn.wsx.setVisibility(8);
            if ((j != 0) || (k == 0) || (bg.nm(parama1)))
            {
              paramn.hqI.setVisibility(8);
              paramn.lVH.setMaxLines(2);
              paramn.wsC.setVisibility(8);
              paramn.wsB.setLayoutResource(R.i.csF);
            }
            try
            {
              paramn.wsA = ((LinearLayout)paramn.wsB.inflate());
              if (i > 4)
              {
                j = 4;
                a(parama, paramn, j, arrayOfString5, arrayOfString2, arrayOfString1, arrayOfInt1, arrayOfString4, arrayOfString3, arrayOfInt2, paramau.field_talker);
                parama = (ImageView)paramn.wsA.findViewById(R.h.boj);
                paramn = (TextView)paramn.wsA.findViewById(R.h.bod);
                if (paramn != null) {
                  paramn.setTextSize(0, ab.getContext().getResources().getDimensionPixelSize(R.f.aQN));
                }
                if (i > 4)
                {
                  if (parama != null) {
                    parama.setVisibility(0);
                  }
                  if (paramn != null)
                  {
                    paramn.setText("(" + i + ")");
                    paramn.setVisibility(0);
                  }
                }
                GMTrace.o(2367198068736L, 17637);
                return;
                if (i > 0)
                {
                  localObject1 = (String)((ArrayList)localObject3).get(0);
                  if (((ArrayList)localObject3).size() > 1)
                  {
                    parama1 = (String)((ArrayList)localObject3).get(1);
                    break;
                  }
                  parama1 = null;
                  break;
                }
                localObject2 = (String)((ArrayList)localObject3).get(0);
                localObject3 = parama1.split(Pattern.quote((String)localObject2), 2);
                parama1 = localObject3[0].trim();
                localObject1 = localObject2;
                if (localObject3.length <= 1) {
                  break;
                }
                parama1 = (localObject3[0].trim() + "\n" + localObject3[1].trim()).trim();
                localObject1 = localObject2;
                break;
                localObject1 = ab.getContext().getString(R.l.dvi);
                j = 0;
                break label636;
                paramn.hqI.setMaxLines(1);
                paramn.hqI.setVisibility(0);
                paramn.lVH.setMaxLines(1);
              }
            }
            catch (Exception parama1)
            {
              for (;;)
              {
                paramn.wsB.setVisibility(0);
                continue;
                j = i;
              }
            }
          }
          paramn.wsB.setVisibility(8);
          paramn.wsC.setVisibility(0);
          GMTrace.o(2367198068736L, 17637);
          return;
        }
      }
    }
  }
  
  static void a(En_5b8fbb1e.a parama, n paramn, f.a parama1, boolean paramBoolean)
  {
    GMTrace.i(16777618653184L, 125003);
    paramn.hqH.setVisibility(8);
    Object localObject1;
    label60:
    Object localObject2;
    Object localObject4;
    label224:
    Object localObject3;
    Iterator localIterator;
    int i;
    if ((parama1.title != null) && (parama1.title.trim().length() > 0))
    {
      localObject1 = parama1.title;
      paramn.lVH.setVisibility(0);
      paramn.lVH.setMaxLines(2);
      paramn.hqI.setMaxLines(4);
      paramn.wsq.setVisibility(8);
      paramn.wsm.setVisibility(4);
      if (paramBoolean) {
        paramn.wrM.setVisibility(8);
      }
      localObject2 = new mn();
      ((mn)localObject2).eRu.type = 0;
      ((mn)localObject2).eRu.eRw = parama1.giV;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject4 = ((mn)localObject2).eRv.eRE;
      if (localObject4 == null) {
        break label1315;
      }
      localObject2 = h.b(paramn.lVH.getContext(), bg.aq(((com.tencent.mm.protocal.b.a.c)localObject4).title, parama1.title), paramn.lVH.getTextSize());
      paramn.lVH.setText((CharSequence)localObject2);
      localObject2 = ((com.tencent.mm.protocal.b.a.c)localObject4).desc;
      if (localObject2 != null) {
        break label608;
      }
      w.e("MicroMsg.AppMsgViewHolder", "recordMsg desc is null !! recordInfo = [%s]", new Object[] { parama1.giV });
      localObject3 = localObject2;
      if (localObject2 != null)
      {
        localObject3 = localObject2;
        if (((String)localObject2).length() > 100) {
          localObject3 = ((String)localObject2).substring(0, 100);
        }
      }
      paramn.hqI.setText(h.b(paramn.hqI.getContext(), bg.aq((String)localObject3, parama1.description), paramn.hqI.getTextSize()));
      localIterator = ((com.tencent.mm.protocal.b.a.c)localObject4).glr.iterator();
      localObject3 = null;
      localObject2 = null;
      i = 0;
    }
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label1166;
      }
      th localth = (th)localIterator.next();
      if ((bg.nm(localth.ujI)) || (!localth.ujI.equals(".htm")) || (bg.nm(localth.ukv)) || (!localth.ukv.equals("WeNoteHtmlFile")))
      {
        Object localObject5;
        int j;
        if (localth.ukn.ukF.ulb != null)
        {
          localObject5 = parama.vKB.vKW.getString(R.l.dQl);
          j = 1;
          localObject4 = localObject2;
          parama1 = (f.a)localObject3;
        }
        for (;;)
        {
          i = j;
          localObject3 = parama1;
          localObject2 = localObject4;
          localObject1 = localObject5;
          switch (localth.aGU)
          {
          case 1: 
          case 9: 
          case 12: 
          case 13: 
          case 15: 
          default: 
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            break;
          case 2: 
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            if (!paramBoolean) {
              break;
            }
            paramn.wrM.setVisibility(0);
            paramn.wrM.setImageResource(R.g.aTK);
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            break;
            paramn.lVH.setVisibility(8);
            localObject1 = null;
            break label60;
            label608:
            localObject2 = ((String)localObject2).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
            break label224;
            j = i;
            parama1 = (f.a)localObject3;
            localObject4 = localObject2;
            localObject5 = localObject1;
            if (localth.ukn.ukF.eMI != null) {
              if (localObject2 == null)
              {
                localObject4 = localth.ukp;
                j = i;
                parama1 = (f.a)localObject3;
                localObject5 = localObject1;
              }
              else
              {
                j = i;
                parama1 = (f.a)localObject3;
                localObject4 = localObject2;
                localObject5 = localObject1;
                if (localObject2 != localth.ukp)
                {
                  parama1 = localth.ukp;
                  j = i;
                  localObject4 = localObject2;
                  localObject5 = localObject1;
                }
              }
            }
            break;
          }
        }
        i = j;
        localObject3 = parama1;
        localObject2 = localObject4;
        localObject1 = localObject5;
        if (paramBoolean)
        {
          paramn.wrM.setVisibility(0);
          paramn.wrM.setImageResource(R.k.cJq);
          i = j;
          localObject3 = parama1;
          localObject2 = localObject4;
          localObject1 = localObject5;
          continue;
          i = j;
          localObject3 = parama1;
          localObject2 = localObject4;
          localObject1 = localObject5;
          if (paramBoolean)
          {
            paramn.wrM.setVisibility(0);
            paramn.wrM.setImageResource(R.k.cJr);
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            continue;
            if (paramBoolean)
            {
              paramn.wrM.setVisibility(0);
              paramn.wrM.setImageResource(R.k.cJo);
            }
            paramn.wsq.setVisibility(0);
            paramn.wsq.setImageResource(R.g.bbn);
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            continue;
            paramn.wrM.setVisibility(0);
            paramn.wrM.setImageResource(R.k.cJc);
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            continue;
            if (paramBoolean)
            {
              paramn.wrM.setVisibility(0);
              paramn.wrM.setImageResource(R.k.cJd);
            }
            paramn.wsq.setVisibility(0);
            paramn.wsq.setImageResource(R.g.aYf);
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            continue;
            i = j;
            localObject3 = parama1;
            localObject2 = localObject4;
            localObject1 = localObject5;
            if (paramBoolean)
            {
              paramn.wrM.setVisibility(0);
              paramn.wrM.setImageResource(com.tencent.mm.pluginsdk.c.NV(localth.ujI));
              i = j;
              localObject3 = parama1;
              localObject2 = localObject4;
              localObject1 = localObject5;
              continue;
              i = j;
              localObject3 = parama1;
              localObject2 = localObject4;
              localObject1 = localObject5;
              if (paramBoolean)
              {
                paramn.wrM.setVisibility(0);
                paramn.wrM.setImageResource(R.k.cJl);
                i = j;
                localObject3 = parama1;
                localObject2 = localObject4;
                localObject1 = localObject5;
                continue;
                i = j;
                localObject3 = parama1;
                localObject2 = localObject4;
                localObject1 = localObject5;
                if (paramBoolean)
                {
                  paramn.wrM.setVisibility(0);
                  paramn.wrM.setImageResource(R.g.aVS);
                  i = j;
                  localObject3 = parama1;
                  localObject2 = localObject4;
                  localObject1 = localObject5;
                }
              }
            }
          }
        }
      }
    }
    label1166:
    if ((localObject2 != null) && (localObject3 == null) && (i == 0)) {
      parama1 = parama.vKB.vKW.getString(R.l.duv, new Object[] { localObject2 });
    }
    for (;;)
    {
      if (!bg.nm(parama1)) {
        paramn.lVH.setText(parama1);
      }
      paramn.wrM.setVisibility(8);
      paramn.wsx.setVisibility(8);
      GMTrace.o(16777618653184L, 125003);
      return;
      parama1 = (f.a)localObject1;
      if (localObject2 != null)
      {
        parama1 = (f.a)localObject1;
        if (localObject3 != null)
        {
          parama1 = (f.a)localObject1;
          if (!((String)localObject2).equals(localObject3))
          {
            parama1 = (f.a)localObject1;
            if (i == 0)
            {
              parama1 = parama.vKB.vKW.getString(R.l.duu, new Object[] { localObject2, localObject3 });
              continue;
              label1315:
              parama1 = (f.a)localObject1;
            }
          }
        }
      }
    }
  }
  
  public static void a(n paramn, Boolean paramBoolean, final au paramau, String paramString1, final String paramString2)
  {
    GMTrace.i(2366929633280L, 17635);
    final long l = paramau.field_msgId;
    com.tencent.mm.pluginsdk.model.app.b localb = an.afP().eq(l);
    if (localb == null)
    {
      w.w("MicroMsg.AppMsgViewHolder", "attach info is null, msgId: %s, attachName: %s", new Object[] { Long.valueOf(l), paramString2 });
      GMTrace.o(2366929633280L, 17635);
      return;
    }
    if (paramBoolean.booleanValue()) {
      if (localb.field_status == 101L)
      {
        paramn.wsp.setVisibility(0);
        paramn.wsn.setVisibility(0);
      }
    }
    for (;;)
    {
      if (paramau.field_status == 5)
      {
        paramn.wsp.setVisibility(8);
        paramn.wso.setVisibility(8);
      }
      paramn.wsp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2383706849280L, 17760);
          if (this.wsQ.booleanValue())
          {
            l = l;
            paramAnonymousView = paramau;
            localb = an.afP().eq(l);
            if (localb == null)
            {
              w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " getinfo failed: " + paramAnonymousView);
              GMTrace.o(2383706849280L, 17760);
              return;
            }
            if (localb.field_status != 101L)
            {
              w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " get status failed: " + paramAnonymousView + " status:" + localb.field_status);
              GMTrace.o(2383706849280L, 17760);
              return;
            }
            localb.field_status = 102L;
            localb.field_lastModifyTime = bg.Pu();
            an.afP().c(localb, new String[0]);
            GMTrace.o(2383706849280L, 17760);
            return;
          }
          long l = l;
          paramAnonymousView = paramau;
          com.tencent.mm.pluginsdk.model.app.b localb = an.afP().eq(l);
          if (localb == null) {
            w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " getinfo failed: " + paramAnonymousView);
          }
          for (;;)
          {
            this.gmh.dB(5);
            at.AR();
            com.tencent.mm.y.c.yM().cM(l);
            GMTrace.o(2383706849280L, 17760);
            return;
            if (localb.field_status == 101L) {
              break;
            }
            w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " get status failed: " + paramAnonymousView + " status:" + localb.field_status);
          }
          if ((bg.nm(localb.field_clientAppDataId)) && (!bg.nm(localb.field_mediaSvrId))) {}
          for (localb.field_status = 102L;; localb.field_status = 105L)
          {
            localb.field_lastModifyTime = bg.Pu();
            an.afP().c(localb, new String[0]);
            break;
          }
        }
      });
      paramn.wso.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2186675224576L, 16292);
          com.tencent.mm.pluginsdk.model.app.b localb;
          if (!this.wsQ.booleanValue())
          {
            long l = l;
            paramAnonymousView = paramau;
            localb = an.afP().eq(l);
            if (localb != null) {
              break label110;
            }
            w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " getinfo failed: " + paramAnonymousView);
          }
          for (;;)
          {
            this.gmh.dB(1);
            at.AR();
            com.tencent.mm.y.c.yM().cM(l);
            GMTrace.o(2186675224576L, 16292);
            return;
            label110:
            if (localb.field_status != 105L)
            {
              w.e("MicroMsg.AppMsgLogic", "ERR:" + g.tC() + " get status failed: " + paramAnonymousView + " status:" + localb.field_status);
            }
            else
            {
              localb.field_status = 101L;
              localb.field_lastModifyTime = bg.Pu();
              an.afP().c(localb, new String[0]);
              an.bJK().run();
            }
          }
        }
      });
      GMTrace.o(2366929633280L, 17635);
      return;
      if (localb.field_status == 102L)
      {
        paramn.wsp.setVisibility(8);
        paramn.wsn.setVisibility(8);
      }
      else
      {
        paramn.wsp.setVisibility(8);
        paramn.wsn.setVisibility(8);
        continue;
        if (localb.field_status == 101L)
        {
          paramn.wsp.setVisibility(0);
          paramn.wso.setVisibility(8);
        }
        else if (localb.field_status == 105L)
        {
          paramn.wsp.setVisibility(8);
          paramn.wso.setVisibility(0);
        }
        else
        {
          paramn.wsp.setVisibility(8);
          paramn.wso.setVisibility(8);
        }
      }
    }
  }
  
  public static void a(n paramn, String paramString, int paramInt)
  {
    GMTrace.i(2366795415552L, 17634);
    int i = l.Oz(paramString);
    if ((i == -1) || (i >= 100) || (paramInt <= 0))
    {
      paramn.wsn.setVisibility(8);
      GMTrace.o(2366795415552L, 17634);
      return;
    }
    paramn.wsn.setVisibility(0);
    paramn.wsn.setProgress(i);
    GMTrace.o(2366795415552L, 17634);
  }
  
  public final void reset()
  {
    GMTrace.i(2366661197824L, 17633);
    if (this.lVH != null) {
      this.lVH.setMaxLines(this.wsP);
    }
    GMTrace.o(2366661197824L, 17633);
  }
  
  public final n s(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2366526980096L, 17632);
    super.dq(paramView);
    this.wrM = ((MMImageView)paramView.findViewById(R.h.bmN));
    this.hqH = ((TextView)paramView.findViewById(R.h.bmP));
    this.lVH = ((TextView)paramView.findViewById(R.h.bmQ));
    this.hqI = ((TextView)paramView.findViewById(R.h.bmB));
    this.ljO = ((TextView)paramView.findViewById(R.h.bmK));
    this.wsi = ((ImageView)paramView.findViewById(R.h.bmH));
    this.wsk = ((TextView)paramView.findViewById(R.h.bmJ));
    this.wsj = ((ImageView)paramView.findViewById(R.h.bmI));
    this.wsl = ((LinearLayout)paramView.findViewById(R.h.bmG));
    this.wsm = ((ImageView)paramView.findViewById(R.h.bmL));
    this.wsn = ((MMPinProgressBtn)paramView.findViewById(R.h.bnu));
    this.wso = ((ImageView)this.lFh.findViewById(R.h.bnn));
    this.wsp = ((ImageView)this.lFh.findViewById(R.h.boz));
    this.wsq = ((ImageView)paramView.findViewById(R.h.bmC));
    this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
    this.wss = ((ImageView)paramView.findViewById(R.h.bmF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.wsr = ((ChattingItemFooter)paramView.findViewById(R.h.bAZ));
    this.wst = ((LinearLayout)paramView.findViewById(R.h.ber));
    this.wsu = ((ViewGroup)paramView.findViewById(R.h.bLj));
    this.wsv = ((TextView)paramView.findViewById(R.h.bLh));
    this.wsw = ((LinearLayout)paramView.findViewById(R.h.bmR));
    this.wsy = ((FrameLayout)paramView.findViewById(R.h.bne));
    this.wsz = ((LinearLayout)paramView.findViewById(R.h.bmz));
    this.wsD = ((ImageView)paramView.findViewById(R.h.bnl));
    this.wsx = ((RelativeLayout)paramView.findViewById(R.h.bmM));
    this.wsB = ((ViewStub)paramView.findViewById(R.h.bRD));
    this.wsC = ((ImageView)paramView.findViewById(R.h.bnq));
    if (!paramBoolean)
    {
      this.wrV = ((ImageView)this.lFh.findViewById(R.h.boy));
      this.nWt = ((ProgressBar)this.lFh.findViewById(R.h.cjy));
    }
    this.wsL = ((LinearLayout)paramView.findViewById(R.h.bmr));
    this.wsM = ((ImageView)paramView.findViewById(R.h.bms));
    this.wsN = ((ImageView)paramView.findViewById(R.h.bxd));
    this.wsO = ((TextView)paramView.findViewById(R.h.bmu));
    this.wsE = ((LinearLayout)paramView.findViewById(R.h.bmq));
    this.wsF = ((ImageView)paramView.findViewById(R.h.bmo));
    this.wsG = ((TextView)paramView.findViewById(R.h.bmp));
    this.wsH = ((TextView)paramView.findViewById(R.h.bmt));
    this.wsI = ((ImageView)paramView.findViewById(R.h.bmv));
    this.wsJ = ((TextView)paramView.findViewById(R.h.bmx));
    this.wsK = ((TextView)paramView.findViewById(R.h.bmw));
    if ((this.lVH != null) && (Build.VERSION.SDK_INT >= 16)) {
      this.wsP = this.lVH.getMaxLines();
    }
    this.wrJ = ah.fs(ab.getContext());
    GMTrace.o(2366526980096L, 17632);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ir;
import com.tencent.mm.g.a.ir.b;
import com.tencent.mm.g.a.km;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  extends a
{
  private static int ljP;
  private static int ljQ;
  private final int ljN;
  private final String lkc;
  private final SparseIntArray lkd;
  private HashMap<String, SpannableString> lke;
  
  public r(g paramg)
  {
    super(paramg);
    GMTrace.i(6429163388928L, 47901);
    this.lkd = new SparseIntArray();
    this.lke = new HashMap();
    this.ljN = com.tencent.mm.br.a.fromDPToPix(paramg.context, 60);
    this.lkc = " ";
    ljQ = com.tencent.mm.br.a.fromDPToPix(paramg.context, 138);
    ljP = com.tencent.mm.br.a.fromDPToPix(paramg.context, 230);
    GMTrace.o(6429163388928L, 47901);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6429297606656L, 47902);
    Context localContext = paramViewGroup.getContext();
    LinkedList localLinkedList;
    int i4;
    int i5;
    int i;
    int j;
    int k;
    int n;
    boolean bool;
    int m;
    int i1;
    int i2;
    int i3;
    label267:
    final Object localObject3;
    Object localObject2;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cwA, null), paramViewGroup, paramj);
      paramViewGroup.iub = ((ImageView)paramView.findViewById(R.h.byW));
      paramViewGroup.lkl = ((FrameLayout)paramView.findViewById(R.h.byX));
      paramViewGroup.lkh = ((TextView)paramView.findViewById(R.h.bzx));
      paramViewGroup.lki = ((TextView)paramView.findViewById(R.h.byJ));
      paramViewGroup.lkt = ((LinearLayout)paramView.findViewById(R.h.bzu));
      paramViewGroup.lkf = ((ImageView)paramView.findViewById(R.h.bza));
      paramViewGroup.lkg = ((ImageView)paramView.findViewById(R.h.byZ));
      paramViewGroup.lks = ((TextView)paramView.findViewById(R.h.bzB));
      paramViewGroup.lku = ((ImageView)paramView.findViewById(R.h.bzf));
      paramViewGroup.lkv = ((TextView)paramView.findViewById(R.h.bzg));
      paramViewGroup.lkw = ((TextView)paramView.findViewById(R.h.bze));
      paramViewGroup.lkx = ((LinearLayout)paramView.findViewById(R.h.byc));
      a(paramViewGroup, paramj);
      localLinkedList = paramj.field_favProto.ulB;
      localObject1 = localLinkedList.iterator();
      i4 = 0;
      i5 = 0;
      i = 0;
      j = 0;
      k = 0;
      n = 0;
      bool = false;
      m = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (!((Iterator)localObject1).hasNext()) {
        break label930;
      }
      localObject3 = (th)((Iterator)localObject1).next();
      if (i != 0) {
        break label406;
      }
      localObject2 = new File(x.g((th)localObject3));
      if (((File)localObject2).exists()) {
        break label342;
      }
      g.a(paramj, (th)localObject3);
    }
    for (;;)
    {
      i += 1;
      break label267;
      paramViewGroup = (a)paramView.getTag();
      break;
      label342:
      if (((th)localObject3).ukv == null)
      {
        localObject3 = new km();
        ((km)localObject3).eOE.type = 10;
        ((km)localObject3).eOE.field_localId = paramj.field_localId;
        ((km)localObject3).eOE.path = ((File)localObject2).getAbsolutePath();
        com.tencent.mm.sdk.b.a.vgX.m((b)localObject3);
      }
    }
    label406:
    label488:
    int i6;
    int i7;
    int i8;
    switch (((th)localObject3).aGU)
    {
    case 9: 
    case 12: 
    case 13: 
    case 15: 
    default: 
      i6 = i3;
      i7 = i2;
      i8 = i1;
      i3 = j;
      i2 = k;
      i1 = n;
      n = m;
      m = i8;
      k = i7;
      j = i6;
    }
    for (;;)
    {
      i8 = i + 1;
      i = i3;
      i6 = i2;
      i7 = i1;
      i3 = j;
      i2 = k;
      i1 = m;
      m = n;
      n = i7;
      k = i6;
      j = i;
      i = i8;
      break;
      if (bool) {
        break label488;
      }
      i5 = i;
      i6 = m;
      bool = true;
      i7 = n;
      i8 = k;
      int i9 = j;
      j = i3;
      k = i2;
      m = i1;
      n = i6;
      i1 = i7;
      i2 = i8;
      i3 = i9;
      continue;
      if (i3 != 0) {
        break label488;
      }
      localObject2 = ((th)localObject3).desc;
      if ((bg.nm((String)localObject2)) || (bg.nm(((String)localObject2).replace("\n", "").replace(" ", " ").trim()))) {
        break label488;
      }
      i7 = 1;
      i3 = k;
      k = i2;
      i6 = j;
      n = i1;
      i2 = m;
      i1 = i;
      j = i7;
      m = n;
      n = i2;
      i2 = i3;
      i3 = i6;
      continue;
      if (m != 0) {
        break label488;
      }
      k = i3;
      i3 = j;
      m = i2;
      i6 = i1;
      i7 = 1;
      i1 = n;
      i2 = i;
      j = k;
      k = m;
      m = i6;
      n = i7;
      continue;
      if (i2 != 0) {
        break label488;
      }
      j = i3;
      i8 = 1;
      i2 = m;
      i6 = n;
      i7 = k;
      i3 = i;
      k = i8;
      m = i1;
      n = i2;
      i1 = i6;
      i2 = i7;
      continue;
      if (!c.tmH) {
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6419768147968L, 47831);
            if ((localObject3.ukn == null) || (localObject3.ukn.ukH == null))
            {
              GMTrace.o(6419768147968L, 47831);
              return;
            }
            Object localObject = new ir();
            ((ir)localObject).eMh.eMl = ((float)localObject3.ukn.ukH.lat);
            ((ir)localObject).eMh.eMm = ((float)localObject3.ukn.ukH.lng);
            ((ir)localObject).eMh.eMn = localObject3.ukn.ukH.eMn;
            ((ir)localObject).eMh.eMj = 1;
            com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
            localObject = ((ir)localObject).eMi.path;
            if (!com.tencent.mm.a.e.aZ((String)localObject))
            {
              ir localir = new ir();
              localir.eMh.eMl = ((float)localObject3.ukn.ukH.lat);
              localir.eMh.eMm = ((float)localObject3.ukn.ukH.lng);
              localir.eMh.eMn = localObject3.ukn.ukH.eMn;
              localir.eMh.height = 450;
              localir.eMh.width = 600;
              localir.eMh.filename = ((String)localObject);
              localir.eMh.eMj = 2;
              com.tencent.mm.sdk.b.a.vgX.m(localir);
            }
            GMTrace.o(6419768147968L, 47831);
          }
          
          public final String toString()
          {
            GMTrace.i(6419902365696L, 47832);
            String str = super.toString() + "|getlocationthumb";
            GMTrace.o(6419902365696L, 47832);
            return str;
          }
        });
      }
      if (i1 != 0) {
        break label488;
      }
      i7 = i3;
      i4 = i;
      i8 = i2;
      i9 = 1;
      i1 = m;
      i2 = n;
      i3 = k;
      i6 = j;
      j = i7;
      k = i8;
      m = i9;
      n = i1;
      i1 = i2;
      i2 = i3;
      i3 = i6;
    }
    label930:
    w.d("MicroMsg.FavWNNoteListItem", "hasThumb %s, firstRemarkIndex %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(0) });
    paramViewGroup.lkl.setVisibility(8);
    paramViewGroup.lkt.setVisibility(8);
    paramViewGroup.lkx.setVisibility(8);
    paramViewGroup.lkh.setVisibility(8);
    paramViewGroup.lki.setVisibility(8);
    paramViewGroup.lkf.setVisibility(8);
    paramViewGroup.lks.setVisibility(8);
    if (localLinkedList.size() < 2)
    {
      w.w("MicroMsg.FavWNNoteListItem", "dataList size is null");
      GMTrace.o(6429297606656L, 47902);
      return paramView;
    }
    if (i3 != 0)
    {
      paramViewGroup.lkt.setVisibility(0);
      localObject2 = ((th)localLinkedList.get(n)).desc;
      localObject1 = localObject2;
      if (((String)localObject2).length() > 1000) {
        localObject1 = ((String)localObject2).substring(0, 1000);
      }
      if (bg.nm((String)localObject1)) {
        break label2060;
      }
    }
    label1539:
    label1633:
    label2051:
    label2054:
    label2060:
    for (Object localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">").replace(" ", " ").split("\n");; localObject1 = null)
    {
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        localObject3 = new ArrayList();
        i = 0;
        if (i >= localObject1.length) {
          break label2054;
        }
        if (!bg.nm(localObject1[i].trim())) {
          ((ArrayList)localObject3).add(localObject1[i]);
        }
      }
      for (;;)
      {
        i += 1;
        localObject2 = "";
        for (;;)
        {
          if (i < localObject1.length)
          {
            localObject2 = (String)localObject2 + localObject1[i] + " ";
            i += 1;
            continue;
            i += 1;
            break;
          }
        }
        localObject1 = ((String)localObject2).trim();
        if (((String)localObject1).length() > 0) {
          ((ArrayList)localObject3).add(localObject1);
        }
        if (((ArrayList)localObject3).size() > 1)
        {
          paramViewGroup.lki.setVisibility(0);
          paramViewGroup.lkh.setVisibility(0);
          paramViewGroup.lkh.setText(h.b(paramViewGroup.lkh.getContext(), (CharSequence)((ArrayList)localObject3).get(0), paramViewGroup.lkh.getTextSize()));
          paramViewGroup.lki.setText(h.b(paramViewGroup.lki.getContext(), (CharSequence)((ArrayList)localObject3).get(1), paramViewGroup.lki.getTextSize()));
          if (!bool) {
            break label1633;
          }
          paramViewGroup.lkx.setVisibility(8);
          paramViewGroup.lkl.setVisibility(0);
          paramViewGroup.iub.setVisibility(0);
          if (((th)localLinkedList.get(i5)).aGU != 2) {
            break label1539;
          }
          g.a(paramViewGroup.iub, R.k.cMo, (th)localLinkedList.get(i5), paramj, true, ljP, ljQ);
        }
        for (;;)
        {
          GMTrace.o(6429297606656L, 47902);
          return paramView;
          if (((ArrayList)localObject3).size() != 1) {
            break;
          }
          paramViewGroup.lki.setVisibility(8);
          paramViewGroup.lkh.setVisibility(0);
          paramViewGroup.lkh.setText(h.b(paramViewGroup.lkh.getContext(), (CharSequence)((ArrayList)localObject3).get(0), paramViewGroup.lkh.getTextSize()));
          break;
          paramViewGroup.lkf.setVisibility(0);
          paramViewGroup.lks.setVisibility(0);
          this.laj.a(paramViewGroup.iub, (th)localLinkedList.get(i5), paramj, ((th)localLinkedList.get(i5)).eDk, R.k.cMk, ljP, ljQ);
          paramViewGroup.lks.setText(u.t(localContext, ((th)localLinkedList.get(i5)).duration));
        }
        if (i1 != 0)
        {
          localObject1 = (th)localLinkedList.get(i4);
          paramViewGroup.lkl.setVisibility(8);
          paramViewGroup.iub.setVisibility(8);
          paramViewGroup.lkx.setVisibility(0);
          paramViewGroup.lku.setImageResource(R.k.cMd);
          paramj = ((th)localObject1).ukn.ukH;
          localObject1 = ((th)localObject1).ukn.hLO;
          if (bg.nm((String)localObject1)) {
            if (bg.nm(paramj.eQm))
            {
              paramViewGroup.lkv.setText(paramj.label);
              paramViewGroup.lkw.setText(R.l.dtY);
            }
          }
          for (;;)
          {
            GMTrace.o(6429297606656L, 47902);
            return paramView;
            paramViewGroup.lkv.setText(paramj.eQm);
            paramViewGroup.lkw.setText(paramj.label);
            continue;
            paramViewGroup.lkv.setText((CharSequence)localObject1);
            if (bg.nm(paramj.eQm)) {
              paramViewGroup.lkw.setText(paramj.label);
            } else {
              paramViewGroup.lkw.setText(paramj.eQm);
            }
          }
        }
        if (m != 0)
        {
          localObject1 = (th)localLinkedList.get(k);
          paramViewGroup.lkl.setVisibility(8);
          paramViewGroup.iub.setVisibility(8);
          paramViewGroup.lkx.setVisibility(0);
          paramViewGroup.lku.setImageResource(c.Oh(((th)localObject1).ujI));
          paramViewGroup.lkv.setText(((th)localObject1).title);
          paramj = ((th)localObject1).desc;
          if (!bg.nm(paramj)) {
            break label2051;
          }
          paramj = x.ab((float)((th)localObject1).ujO);
        }
        for (;;)
        {
          paramViewGroup.lkw.setText(paramj);
          GMTrace.o(6429297606656L, 47902);
          return paramView;
          if (i2 != 0)
          {
            paramj = (th)localLinkedList.get(j);
            paramViewGroup.lkl.setVisibility(8);
            paramViewGroup.iub.setVisibility(8);
            paramViewGroup.lkx.setVisibility(0);
            paramViewGroup.lku.setImageResource(R.k.cMh);
            paramViewGroup.lkv.setText(localContext.getString(R.l.cUR));
            paramViewGroup.lkw.setText(x.t(this.laj.context, paramj.duration));
            GMTrace.o(6429297606656L, 47902);
            return paramView;
          }
          GMTrace.o(6429297606656L, 47902);
          return paramView;
        }
        i = 0;
      }
    }
  }
  
  public final void cj(View paramView)
  {
    GMTrace.i(6429431824384L, 47903);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lcn);
    GMTrace.o(6429431824384L, 47903);
  }
  
  public static final class a
    extends a.b
  {
    ImageView iub;
    ImageView lkf;
    ImageView lkg;
    TextView lkh;
    TextView lki;
    FrameLayout lkl;
    TextView lks;
    LinearLayout lkt;
    ImageView lku;
    TextView lkv;
    TextView lkw;
    LinearLayout lkx;
    
    public a()
    {
      GMTrace.i(6427686993920L, 47890);
      GMTrace.o(6427686993920L, 47890);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
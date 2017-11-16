package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.d.e.b;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.e;
import com.tencent.mm.plugin.game.model.q.f;
import com.tencent.mm.plugin.game.model.q.g;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.r.a;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.Map;

public final class m
  extends com.tencent.mm.ui.o<q>
{
  private static w lZX;
  private int eAs;
  int gQB;
  int jIt;
  private int lNQ;
  private View.OnClickListener lZY;
  private View.OnClickListener lZZ;
  private Context mContext;
  private v maa;
  private v mab;
  private long mad;
  private int mae;
  private r maf;
  private f<String, Bitmap> mag;
  
  public m(Context paramContext, q paramq, int paramInt)
  {
    super(paramContext, paramq);
    GMTrace.i(12705989656576L, 94667);
    this.jIt = 15;
    this.gQB = 0;
    this.eAs = 0;
    this.mad = 0L;
    this.lNQ = 0;
    this.mae = 0;
    this.mContext = paramContext;
    this.lNQ = paramInt;
    paramq = SubCoreGameCenter.aGf();
    String str = u.k(new int[] { 2, 5, 6, 10, 11, 100 });
    paramq = paramq.rawQuery("select count(*) from GameRawMessage where " + str + " and showInMsgList = 1" + " and isHidden = 0", new String[0]);
    if (paramq == null) {}
    for (;;)
    {
      this.gQB = i;
      this.eAs = SubCoreGameCenter.aGf().aFC();
      lZX = new w();
      this.lZY = new n(paramContext, paramInt);
      this.lZZ = new o(paramContext, paramInt);
      this.maa = new v(paramContext);
      this.maa.cm(paramInt, 1);
      this.mab = new v(paramContext);
      this.mab.cm(paramInt, 2);
      this.maf = new r(paramContext, this.lNQ);
      paramInt = com.tencent.mm.plugin.game.d.c.getScreenWidth(this.mContext);
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aQi);
      j = this.mContext.getResources().getDimensionPixelSize(R.f.aPC);
      int k = this.mContext.getResources().getDimensionPixelSize(R.f.aQw);
      this.mae = (a.Y(this.mContext, paramInt - j * 2 - i - k) / 34);
      this.mag = new f(30);
      GMTrace.o(12705989656576L, 94667);
      return;
      i = j;
      if (paramq.moveToFirst()) {
        i = paramq.getInt(0);
      }
      paramq.close();
    }
  }
  
  private static q a(q paramq, Cursor paramCursor)
  {
    GMTrace.i(12707197616128L, 94676);
    q localq = paramq;
    if (paramq == null) {
      localq = new q();
    }
    localq.b(paramCursor);
    GMTrace.o(12707197616128L, 94676);
    return localq;
  }
  
  private void a(q paramq, a parama)
  {
    GMTrace.i(12706258092032L, 94669);
    LinkedList localLinkedList = new LinkedList();
    int i = 1;
    while (i < paramq.lMM.size())
    {
      localLinkedList.add(paramq.lMM.get(i));
      i += 1;
    }
    parama.mav.a(paramq, localLinkedList, this.mae, this.lNQ, this.mag);
    GMTrace.o(12706258092032L, 94669);
  }
  
  private void b(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706392309760L, 94670);
    if (bg.nm(paramString))
    {
      a.b.a(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    if (!this.mag.ba(paramString))
    {
      c(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    Bitmap localBitmap = (Bitmap)this.mag.get(paramString);
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      c(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
    GMTrace.o(12706392309760L, 94670);
  }
  
  private void c(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706526527488L, 94671);
    paramImageView = e.aGQ().h(paramImageView, paramString);
    if (paramImageView != null) {
      this.mag.put(paramString, paramImageView);
    }
    GMTrace.o(12706526527488L, 94671);
  }
  
  private void d(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706660745216L, 94672);
    if (this.mag.ba(paramString))
    {
      Bitmap localBitmap = (Bitmap)this.mag.get(paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        e(paramImageView, paramString);
        GMTrace.o(12706660745216L, 94672);
        return;
      }
      paramImageView.setImageBitmap(localBitmap);
      GMTrace.o(12706660745216L, 94672);
      return;
    }
    e(paramImageView, paramString);
    GMTrace.o(12706660745216L, 94672);
  }
  
  private void e(ImageView paramImageView, final String paramString)
  {
    GMTrace.i(12706794962944L, 94673);
    e.a.a locala = new e.a.a();
    locala.gKA = false;
    e.aGQ().a(paramImageView, paramString, locala.aGR(), new e.b()
    {
      public final void x(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(12714982244352L, 94734);
        if ((paramAnonymousBitmap != null) && (!paramAnonymousBitmap.isRecycled())) {
          m.a(m.this).put(paramString, paramAnonymousBitmap);
        }
        GMTrace.o(12714982244352L, 94734);
      }
    });
    GMTrace.o(12706794962944L, 94673);
  }
  
  private q oS(int paramInt)
  {
    GMTrace.i(12707868704768L, 94681);
    if (oR(paramInt))
    {
      localq = (q)this.vKs;
      GMTrace.o(12707868704768L, 94681);
      return localq;
    }
    if (this.vKt != null)
    {
      localq = (q)this.vKt.get(Integer.valueOf(paramInt));
      if (localq != null)
      {
        GMTrace.o(12707868704768L, 94681);
        return localq;
      }
    }
    if ((this.gQB > this.eAs) && (this.eAs > 0) && (paramInt > this.eAs))
    {
      i = 1;
      if (i == 0) {
        break label144;
      }
    }
    label144:
    for (int i = paramInt - 1;; i = paramInt)
    {
      if ((paramInt >= 0) && (getCursor().moveToPosition(i))) {
        break label149;
      }
      GMTrace.o(12707868704768L, 94681);
      return null;
      i = 0;
      break;
    }
    label149:
    if (this.vKt == null)
    {
      localq = a((q)this.vKs, getCursor());
      GMTrace.o(12707868704768L, 94681);
      return localq;
    }
    q localq = a(null, getCursor());
    this.vKt.put(Integer.valueOf(paramInt), localq);
    GMTrace.o(12707868704768L, 94681);
    return localq;
  }
  
  public final void QF()
  {
    GMTrace.i(12706929180672L, 94674);
    u localu = SubCoreGameCenter.aGf();
    int i = this.jIt;
    String str = u.k(new int[] { 2, 5, 6, 10, 11, 100 });
    setCursor(localu.rawQuery("select * from GameRawMessage where " + str + " and showInMsgList = 1" + " and isHidden = 0" + " order by isRead, createTime desc limit " + i, new String[0]));
    this.jIt = getCount();
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(12706929180672L, 94674);
  }
  
  protected final void QG()
  {
    GMTrace.i(12707063398400L, 94675);
    aJe();
    QF();
    GMTrace.o(12707063398400L, 94675);
  }
  
  protected final int aGD()
  {
    GMTrace.i(12707734487040L, 94680);
    if ((this.gQB > this.eAs) && (this.eAs > 0))
    {
      GMTrace.o(12707734487040L, 94680);
      return 1;
    }
    GMTrace.o(12707734487040L, 94680);
    return 0;
  }
  
  public final boolean alU()
  {
    GMTrace.i(12707331833856L, 94677);
    if (this.jIt >= this.gQB)
    {
      GMTrace.o(12707331833856L, 94677);
      return true;
    }
    GMTrace.o(12707331833856L, 94677);
    return false;
  }
  
  public final int getCount()
  {
    GMTrace.i(12707466051584L, 94678);
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    if (this.count <= 0)
    {
      GMTrace.o(12707466051584L, 94678);
      return 0;
    }
    int i = this.count;
    int j = aGD();
    GMTrace.o(12707466051584L, 94678);
    return i + j;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12706123874304L, 94668);
    a locala;
    View localView;
    q localq;
    if (paramView == null)
    {
      locala = new a();
      localView = View.inflate(this.context, R.i.cze, null);
      locala.maj = ((ImageView)localView.findViewById(R.h.bGr));
      locala.mai = ((LinearLayout)localView.findViewById(R.h.bOu));
      locala.mak = ((LinearLayout)localView.findViewById(R.h.bOx));
      locala.jpV = ((TextView)localView.findViewById(R.h.bQX));
      locala.mal = ((ImageView)localView.findViewById(R.h.bfR));
      locala.iuc = ((TextView)localView.findViewById(R.h.chF));
      locala.mam = ((TextView)localView.findViewById(R.h.bOz));
      locala.man = ((LinearLayout)localView.findViewById(R.h.bOB));
      locala.mao = ((TextView)localView.findViewById(R.h.bOD));
      locala.maq = ((ImageView)localView.findViewById(R.h.bOC));
      locala.mar = ((ImageView)localView.findViewById(R.h.bOA));
      locala.mas = ((TextView)localView.findViewById(R.h.bOF));
      locala.mat = ((TextView)localView.findViewById(R.h.bOE));
      locala.mav = ((GameMessageListContainerView)localView.findViewById(R.h.bOH));
      locala.mau = ((LinearLayout)localView.findViewById(R.h.bOy));
      localView.setTag(locala);
      localq = oS(paramInt);
      if ((localq == null) || (!localq.lNz)) {
        break label348;
      }
      locala.mai.setVisibility(8);
      locala.mau.setVisibility(0);
    }
    label321:
    label348:
    while (localq == null)
    {
      GMTrace.o(12706123874304L, 94668);
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
      break;
    }
    localq.aFr();
    locala.mai.setVisibility(0);
    locala.mau.setVisibility(8);
    locala.mas.setText(b.e(this.context, localq.field_createTime * 1000L));
    label524:
    label636:
    label714:
    label723:
    label771:
    label865:
    label936:
    label1027:
    label1154:
    label1167:
    label1227:
    Object localObject1;
    Object localObject2;
    if (localq.field_msgType == 100)
    {
      if (localq.lNq != null)
      {
        d(locala.maj, localq.lNq.lNH);
        locala.maj.setVisibility(0);
        if (!bg.nm(localq.lNq.lNG))
        {
          locala.jpV.setText(localq.lNq.lNG);
          locala.jpV.setVisibility(0);
          if (bg.nm(localq.lNq.lNI)) {
            break label1154;
          }
          d(locala.mal, localq.lNq.lNI);
          locala.mal.setVisibility(0);
          if (bg.nm(localq.lNq.lNC)) {
            break label1167;
          }
          locala.jpV.setEnabled(true);
          locala.maj.setEnabled(true);
          paramView = new r.a(localq, localq.lNq.lNC, 1);
          paramViewGroup = new r.a(localq, localq.lNq.lNC, 2);
          locala.jpV.setTag(paramView);
          locala.jpV.setOnClickListener(this.maf);
          locala.maj.setTag(paramViewGroup);
          locala.maj.setOnClickListener(this.maf);
          if (bg.nm(localq.lNm)) {
            break label1600;
          }
          paramInt = localq.lMM.size();
          if (paramInt <= 1) {
            break label1584;
          }
          locala.iuc.setText(this.context.getResources().getString(R.l.dAz, new Object[] { Integer.valueOf(paramInt) }) + localq.lNm);
          locala.iuc.setVisibility(0);
          if (bg.nm(localq.lNn)) {
            break label1613;
          }
          locala.mam.setText(h.b(this.context, localq.lNn, locala.mam.getTextSize()));
          locala.mam.setVisibility(0);
          a(localq, locala);
          if (bg.nm(localq.lNr.lNF)) {
            break label1651;
          }
          locala.man.setVisibility(0);
          if (bg.nm(localq.lNr.lNC)) {
            break label1626;
          }
          paramView = new r.a(localq, localq.lNr.lNC, 3);
          locala.man.setTag(paramView);
          locala.man.setOnClickListener(this.maf);
          locala.man.setEnabled(true);
          locala.mao.setText(h.b(this.context, localq.lNr.lNF, locala.mao.getTextSize()));
          if (bg.nm(localq.lNr.lNB)) {
            break label1638;
          }
          d(locala.maq, localq.lNr.lNB);
          locala.maq.setVisibility(0);
          if (bg.nm(localq.lNo)) {
            break label1676;
          }
          d(locala.mar, localq.lNo);
          locala.mar.setVisibility(0);
          if (bg.nm(localq.lNp)) {
            break label1664;
          }
          paramView = new r.a(localq, localq.lNp, 3);
          locala.mar.setTag(paramView);
          locala.mar.setOnClickListener(this.maf);
          locala.mar.setEnabled(true);
          if (bg.nm(localq.lNs.mName)) {
            break label1701;
          }
          locala.mat.setText(localq.lNs.mName);
          locala.mat.setVisibility(0);
          if (bg.nm(localq.lNs.lNC)) {
            break label1689;
          }
          paramView = new r.a(localq, localq.lNs.lNC, 5);
          locala.mat.setTag(paramView);
          locala.mat.setOnClickListener(this.maf);
          locala.mat.setEnabled(true);
        }
      }
      for (;;)
      {
        GMTrace.o(12706123874304L, 94668);
        return localView;
        locala.jpV.setVisibility(8);
        break;
        locala.mal.setVisibility(8);
        break label524;
        locala.jpV.setEnabled(false);
        locala.maj.setEnabled(false);
        break label636;
        if (!bg.cc(localq.lMM))
        {
          paramViewGroup = (q.h)localq.lMM.get(0);
          if (!bg.nm(paramViewGroup.aDn))
          {
            paramView = paramViewGroup.aDn;
            if (bg.nm(paramViewGroup.lNN)) {
              break label1488;
            }
            locala.jpV.setEnabled(true);
            locala.maj.setEnabled(true);
            localObject1 = new r.a(localq, paramViewGroup.lNN, 1);
            localObject2 = new r.a(localq, paramViewGroup.lNN, 2);
            locala.jpV.setTag(localObject1);
            locala.jpV.setOnClickListener(this.maf);
            locala.maj.setTag(localObject2);
            locala.maj.setOnClickListener(this.maf);
            label1331:
            if (bg.nm(paramView)) {
              break label1509;
            }
            locala.jpV.setText(h.b(this.context, paramView, locala.jpV.getTextSize()), TextView.BufferType.SPANNABLE);
            locala.jpV.setVisibility(0);
            label1374:
            locala.maj.setVisibility(0);
            if (bg.nm(paramViewGroup.lNK)) {
              break label1522;
            }
            d(locala.maj, paramViewGroup.lNK);
          }
          for (;;)
          {
            if (bg.nm(paramViewGroup.lNM)) {
              break label1538;
            }
            d(locala.mal, paramViewGroup.lNM);
            locala.mal.setVisibility(0);
            break;
            at.AR();
            paramView = com.tencent.mm.y.c.yK().TE(paramViewGroup.userName);
            if ((paramView == null) || (bg.nm(paramView.vk())))
            {
              paramView = paramViewGroup.userName;
              break label1227;
            }
            paramView = paramView.vk();
            break label1227;
            label1488:
            locala.jpV.setEnabled(false);
            locala.maj.setEnabled(false);
            break label1331;
            label1509:
            locala.jpV.setVisibility(8);
            break label1374;
            label1522:
            b(locala.maj, paramViewGroup.userName);
          }
          label1538:
          locala.mal.setVisibility(8);
          break label636;
        }
        locala.maj.setVisibility(8);
        locala.jpV.setVisibility(8);
        locala.mal.setVisibility(8);
        break label636;
        label1584:
        locala.iuc.setText(localq.lNm);
        break label714;
        label1600:
        locala.iuc.setVisibility(8);
        break label723;
        label1613:
        locala.mam.setVisibility(8);
        break label771;
        label1626:
        locala.man.setEnabled(false);
        break label865;
        label1638:
        locala.maq.setVisibility(8);
        break label936;
        label1651:
        locala.man.setVisibility(8);
        break label936;
        label1664:
        locala.mar.setEnabled(false);
        break label1027;
        label1676:
        locala.mar.setVisibility(8);
        break label1027;
        label1689:
        locala.mat.setEnabled(false);
        continue;
        label1701:
        locala.mat.setVisibility(8);
      }
    }
    locala.iuc.setVisibility(8);
    locala.mam.setVisibility(8);
    locala.man.setVisibility(8);
    locala.maq.setVisibility(8);
    locala.mar.setVisibility(8);
    locala.mat.setVisibility(8);
    locala.mat.setEnabled(false);
    locala.mar.setEnabled(false);
    locala.maj.setEnabled(false);
    locala.jpV.setEnabled(false);
    locala.mav.setVisibility(8);
    locala.mal.setVisibility(8);
    paramViewGroup = null;
    paramView = null;
    if (!bg.cc(localq.lMM))
    {
      localObject1 = (q.h)localq.lMM.get(0);
      at.AR();
      localObject2 = com.tencent.mm.y.c.yK().TE(((q.h)localObject1).userName);
      paramViewGroup = paramView;
      if (localObject2 != null) {
        paramViewGroup = ((x)localObject2).vk();
      }
      paramView = paramViewGroup;
      if (bg.nm(paramViewGroup)) {
        paramView = ((q.h)localObject1).aDn;
      }
      paramViewGroup = paramView;
      if (!bg.nm(((q.h)localObject1).lNL)) {
        paramInt = 1;
      }
    }
    for (;;)
    {
      int i = localq.lMM.size();
      int j;
      if ((!bg.nm(localq.lMK)) && ((localq.lNa & 1L) == 0L))
      {
        locala.mat.setText(localq.lMK);
        locala.mat.setVisibility(0);
        if ((localq.lNa & 0x2) > 0L)
        {
          j = this.context.getResources().getColor(R.e.aNN);
          locala.mat.setTextColor(j);
          locala.mat.setBackgroundResource(R.g.aWQ);
          locala.mat.setOnClickListener(this.lZY);
          locala.mat.setTag(localq);
          locala.mat.setEnabled(true);
        }
      }
      else
      {
        label2057:
        if ((localq.field_msgType != 10) && (localq.field_msgType != 11)) {
          break label2329;
        }
        if (bg.nm(localq.mAppName)) {
          break label2273;
        }
        locala.jpV.setText(h.b(this.context, localq.mAppName, locala.jpV.getTextSize()), TextView.BufferType.SPANNABLE);
        locala.jpV.setVisibility(0);
      }
      for (;;)
      {
        switch (localq.field_msgType)
        {
        case 3: 
        case 4: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageAdapter", "error msgtype: " + localq.field_msgType);
          break label321;
          j = this.context.getResources().getColor(R.e.aNL);
          locala.mat.setTextColor(j);
          locala.mat.setBackgroundResource(0);
          locala.mat.setOnClickListener(null);
          locala.mat.setEnabled(false);
          break label2057;
          label2273:
          if (!bg.nm(paramView))
          {
            locala.jpV.setText(h.b(this.context, paramView, locala.jpV.getTextSize()));
            locala.jpV.setVisibility(0);
          }
          else
          {
            locala.jpV.setVisibility(8);
            continue;
            label2329:
            if (!bg.nm(paramView))
            {
              locala.jpV.setText(h.b(this.context, paramView, locala.jpV.getTextSize()));
              locala.jpV.setVisibility(0);
              if (paramInt != 0)
              {
                locala.jpV.setOnClickListener(this.maa);
                locala.jpV.setTag(localq);
                locala.jpV.setEnabled(true);
              }
            }
            else
            {
              locala.jpV.setVisibility(8);
            }
          }
          break;
        }
      }
      if (!bg.nm(localq.lMG))
      {
        d(locala.maj, localq.lMG);
        locala.maj.setVisibility(0);
        label2454:
        if (!bg.nm(localq.knW))
        {
          if (bg.nm(localq.lMS)) {
            break label2605;
          }
          locala.mam.setText(localq.knW);
          locala.mam.setVisibility(0);
        }
      }
      while (!bg.nm(localq.lMS))
      {
        d(locala.mar, localq.lMS);
        locala.mar.setTag(Long.valueOf(localq.field_msgId));
        locala.mar.setOnTouchListener(lZX);
        locala.mar.setOnClickListener(this.lZZ);
        locala.mar.setVisibility(0);
        locala.mar.setEnabled(true);
        break;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageAdapter", "mAppIcon is null");
        locala.maj.setVisibility(8);
        break label2454;
        label2605:
        locala.man.setVisibility(0);
        locala.mao.setText(localq.knW);
        locala.man.setOnClickListener(this.lZZ);
        locala.man.setTag(Long.valueOf(localq.field_msgId));
      }
      if (!bg.cc(localq.lMM))
      {
        locala.maj.setVisibility(0);
        if (!bg.nm(((q.h)localq.lMM.get(0)).lNK))
        {
          d(locala.maj, ((q.h)localq.lMM.get(0)).lNK);
          label2723:
          if (!bg.nm(((q.h)localq.lMM.get(0)).lNL))
          {
            locala.maj.setOnClickListener(this.mab);
            locala.maj.setTag(localq);
            locala.maj.setEnabled(true);
          }
        }
      }
      for (;;)
      {
        locala.man.setVisibility(0);
        locala.man.setOnClickListener(this.lZZ);
        locala.man.setTag(Long.valueOf(localq.field_msgId));
        if (localq.lNu != 1) {
          break label2914;
        }
        locala.mam.setVisibility(0);
        locala.mam.setText(h.b(this.context, localq.lNe, locala.mam.getTextSize()));
        locala.mao.setText(localq.lNh);
        break;
        b(locala.maj, ((q.h)localq.lMM.get(0)).userName);
        break label2723;
        locala.maj.setVisibility(8);
      }
      label2914:
      if (localq.lNu == 2)
      {
        locala.mam.setVisibility(0);
        locala.mam.setText(h.b(this.context, localq.lNe, locala.mam.getTextSize()));
        locala.mao.setText(localq.lNf);
        break;
      }
      if (localq.lNu != 3) {
        break;
      }
      locala.iuc.setVisibility(0);
      if (i > 1)
      {
        locala.iuc.setText(this.context.getResources().getString(R.l.dAt, new Object[] { String.valueOf(i) }));
        a(localq, locala);
      }
      for (;;)
      {
        locala.mao.setText(localq.lNh);
        break;
        locala.iuc.setText(this.context.getResources().getString(R.l.dAu));
      }
      d(locala.maj, localq.lMG);
      paramView = "礼物";
      if (localq.lMX.contains("爱心"))
      {
        paramView = "爱心";
        label3117:
        if (i <= 1) {
          break label3201;
        }
        locala.iuc.setText(this.context.getResources().getString(R.l.dAx, new Object[] { String.valueOf(i), paramView }));
      }
      for (;;)
      {
        locala.iuc.setVisibility(0);
        a(localq, locala);
        break;
        if (!localq.lMX.contains("体力")) {
          break label3117;
        }
        paramView = "体力";
        break label3117;
        label3201:
        locala.iuc.setText(this.context.getResources().getString(R.l.dAy, new Object[] { paramView }));
      }
      if (!bg.cc(localq.lMM))
      {
        locala.maj.setVisibility(0);
        if (!bg.nm(((q.h)localq.lMM.get(0)).lNK))
        {
          d(locala.maj, ((q.h)localq.lMM.get(0)).lNK);
          label3298:
          if (!bg.nm(((q.h)localq.lMM.get(0)).lNL))
          {
            locala.maj.setOnClickListener(this.mab);
            locala.maj.setTag(localq);
            locala.maj.setEnabled(true);
          }
          label3350:
          if (i <= 1) {
            break label3533;
          }
          locala.iuc.setText(this.context.getResources().getString(R.l.dAv, new Object[] { String.valueOf(i) }));
          a(localq, locala);
        }
      }
      for (;;)
      {
        locala.man.setVisibility(0);
        locala.iuc.setVisibility(0);
        locala.mao.setText(localq.lNi);
        locala.man.setOnClickListener(this.lZZ);
        locala.man.setTag(Long.valueOf(localq.field_msgId));
        if (bg.nm(localq.lNk)) {
          break;
        }
        locala.maq.setVisibility(0);
        d(locala.maq, localq.lNk);
        break;
        b(locala.maj, ((q.h)localq.lMM.get(0)).userName);
        break label3298;
        locala.maj.setVisibility(8);
        break label3350;
        label3533:
        locala.iuc.setText(this.context.getResources().getString(R.l.dAw));
      }
      paramInt = 0;
      paramView = paramViewGroup;
    }
  }
  
  public final boolean oR(int paramInt)
  {
    GMTrace.i(12707600269312L, 94679);
    if ((this.gQB > this.eAs) && (this.eAs > 0) && (paramInt == this.eAs))
    {
      GMTrace.o(12707600269312L, 94679);
      return true;
    }
    GMTrace.o(12707600269312L, 94679);
    return false;
  }
  
  static final class a
  {
    public TextView iuc;
    public TextView jpV;
    public LinearLayout mai;
    public ImageView maj;
    public LinearLayout mak;
    public ImageView mal;
    public TextView mam;
    public LinearLayout man;
    public TextView mao;
    public ImageView maq;
    public ImageView mar;
    public TextView mas;
    public TextView mat;
    public LinearLayout mau;
    public GameMessageListContainerView mav;
    
    a()
    {
      GMTrace.i(12684649037824L, 94508);
      GMTrace.o(12684649037824L, 94508);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
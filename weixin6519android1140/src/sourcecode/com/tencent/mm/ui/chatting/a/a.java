package com.tencent.mm.ui.chatting.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.gallery.g;
import com.tencent.mm.ui.chatting.gallery.g.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class a
  extends RecyclerView.a
{
  public List<c> iDn;
  private String iGc;
  private com.tencent.mm.ao.a.a.c jQF;
  Context mContext;
  private boolean tIv;
  boolean txk;
  long wHM;
  public boolean wHN;
  public b wHO;
  public boolean wHP;
  
  public a(Context paramContext, List<c> paramList, String paramString)
  {
    GMTrace.i(14928232579072L, 111224);
    this.iDn = null;
    this.jQF = null;
    this.tIv = true;
    this.txk = false;
    this.wHP = false;
    this.iDn = paramList;
    this.iGc = paramString;
    at.AR();
    this.tIv = com.tencent.mm.y.c.isSDCardAvailable();
    this.mContext = paramContext;
    af(paramContext, 4);
    GMTrace.o(14928232579072L, 111224);
  }
  
  public a(Context paramContext, List<c> paramList, String paramString, long paramLong)
  {
    GMTrace.i(14928366796800L, 111225);
    this.iDn = null;
    this.jQF = null;
    this.tIv = true;
    this.txk = false;
    this.wHP = false;
    this.iDn = paramList;
    this.wHM = paramLong;
    this.iGc = paramString;
    at.AR();
    this.tIv = com.tencent.mm.y.c.isSDCardAvailable();
    this.txk = true;
    this.mContext = paramContext;
    af(paramContext, 4);
    GMTrace.o(14928366796800L, 111225);
  }
  
  private void af(Context paramContext, int paramInt)
  {
    GMTrace.i(14928501014528L, 111226);
    c.a locala = new c.a();
    locala.gKH = 1;
    locala.gLb = true;
    locala.gKJ = (com.tencent.mm.br.a.ef(paramContext) / 4);
    locala.gKI = (com.tencent.mm.br.a.ef(paramContext) / 4);
    locala.gKV = R.e.aOG;
    this.jQF = locala.Jn();
    GMTrace.o(14928501014528L, 111226);
  }
  
  private static long fd(long paramLong)
  {
    GMTrace.i(15332362158080L, 114235);
    Date localDate = new Date(paramLong);
    paramLong = com.tencent.mm.ui.gridviewheaders.a.chJ().a(localDate);
    GMTrace.o(15332362158080L, 114235);
    return paramLong;
  }
  
  public final c CU(int paramInt)
  {
    GMTrace.i(14929440538624L, 111233);
    c localc = (c)this.iDn.get(paramInt);
    GMTrace.o(14929440538624L, 111233);
    return localc;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(14928769449984L, 111228);
    if (paramInt == Integer.MAX_VALUE)
    {
      paramViewGroup = new a(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cye, paramViewGroup, false));
      GMTrace.o(14928769449984L, 111228);
      return paramViewGroup;
    }
    paramViewGroup = new d(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.czK, paramViewGroup, false));
    GMTrace.o(14928769449984L, 111228);
    return paramViewGroup;
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    GMTrace.i(14929037885440L, 111230);
    if (!this.tIv)
    {
      w.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", new Object[] { Boolean.valueOf(this.tIv) });
      GMTrace.o(14929037885440L, 111230);
      return;
    }
    c localc = CU(paramInt);
    if (paramt.UX == Integer.MAX_VALUE)
    {
      if ((paramInt == getItemCount() - 1) || (fd(CU(paramInt + 1).gVB) != fd(localc.gVB)))
      {
        ((a)paramt).hqj.setVisibility(8);
        GMTrace.o(14929037885440L, 111230);
        return;
      }
      ((a)paramt).hqj.setVisibility(0);
      ((a)paramt).hqj.setText(fc(localc.gVB));
      if (this.wHN)
      {
        ((a)paramt).jeL.setVisibility(0);
        GMTrace.o(14929037885440L, 111230);
        return;
      }
      ((a)paramt).jeL.setVisibility(8);
      GMTrace.o(14929037885440L, 111230);
      return;
    }
    ((d)paramt).oOJ.setTag(Integer.valueOf(paramInt));
    ((d)paramt).lCB.setTag(Integer.valueOf(paramInt));
    n.Jd().a(localc.imagePath, ((d)paramt).oOJ, this.jQF);
    if (localc.mWE)
    {
      ((d)paramt).wHU.setVisibility(0);
      ((d)paramt).wHV.setVisibility(0);
      ((d)paramt).wHV.setText(bg.aq(localc.wHR.wHS, ""));
    }
    while (this.wHP)
    {
      ((d)paramt).lCB.setVisibility(0);
      ((d)paramt).lCA.setVisibility(0);
      if (g.a.wMg.bp(localc.eRz))
      {
        ((d)paramt).wHW.setVisibility(0);
        ((d)paramt).lCA.setChecked(true);
        GMTrace.o(14929037885440L, 111230);
        return;
        ((d)paramt).wHV.setVisibility(8);
        ((d)paramt).wHU.setVisibility(8);
      }
      else
      {
        ((d)paramt).wHW.setVisibility(8);
        ((d)paramt).lCA.setChecked(false);
        GMTrace.o(14929037885440L, 111230);
        return;
      }
    }
    ((d)paramt).lCB.setVisibility(8);
    ((d)paramt).lCA.setVisibility(8);
    GMTrace.o(14929037885440L, 111230);
  }
  
  public final void a(RecyclerView.t paramt, int paramInt, List paramList)
  {
    GMTrace.i(14928903667712L, 111229);
    if ((paramList != null) && (paramList.size() > 0) && ((paramt instanceof d)))
    {
      if (((Integer)paramList.get(0)).intValue() == 0)
      {
        ((d)paramt).lCA.setChecked(false);
        ((d)paramt).lCA.setVisibility(0);
        ((d)paramt).lCB.setVisibility(0);
        GMTrace.o(14928903667712L, 111229);
        return;
      }
      ((d)paramt).lCA.setChecked(false);
      ((d)paramt).lCA.setVisibility(8);
      ((d)paramt).lCB.setVisibility(8);
      GMTrace.o(14928903667712L, 111229);
      return;
    }
    super.a(paramt, paramInt, paramList);
    GMTrace.o(14928903667712L, 111229);
  }
  
  public final String fc(long paramLong)
  {
    GMTrace.i(14929172103168L, 111231);
    Object localObject = new Date(paramLong);
    localObject = com.tencent.mm.ui.gridviewheaders.a.chJ().a((Date)localObject, this.mContext);
    GMTrace.o(14929172103168L, 111231);
    return (String)localObject;
  }
  
  public final int getItemCount()
  {
    GMTrace.i(14929306320896L, 111232);
    int i = this.iDn.size();
    GMTrace.o(14929306320896L, 111232);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(14928635232256L, 111227);
    paramInt = CU(paramInt).type;
    GMTrace.o(14928635232256L, 111227);
    return paramInt;
  }
  
  public final class a
    extends RecyclerView.t
  {
    TextView hqj;
    ProgressBar jeL;
    
    public a(View paramView)
    {
      super();
      GMTrace.i(14929977409536L, 111237);
      this.hqj = ((TextView)paramView.findViewById(R.h.bsV));
      this.jeL = ((ProgressBar)paramView.findViewById(R.h.bKy));
      GMTrace.o(14929977409536L, 111237);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean, a.c paramc, int paramInt);
  }
  
  public static final class c
  {
    public au eRz;
    public long gVB;
    public String imagePath;
    boolean mWE;
    public int type;
    public a wHR;
    
    public c(long paramLong)
    {
      GMTrace.i(14926621966336L, 111212);
      this.type = 0;
      this.wHR = new a();
      this.gVB = paramLong;
      this.type = Integer.MAX_VALUE;
      GMTrace.o(14926621966336L, 111212);
    }
    
    public c(au paramau)
    {
      GMTrace.i(14926487748608L, 111211);
      this.type = 0;
      this.wHR = new a();
      this.eRz = paramau;
      Object localObject1;
      Object localObject2;
      if ((paramau.bTG()) || (paramau.bTH()))
      {
        this.mWE = true;
        o.Nh();
        localObject1 = s.ml(paramau.field_imgPath);
        localObject2 = t.mw(paramau.field_imgPath);
        if (localObject2 != null) {
          this.wHR.wHS = bg.hB(((r)localObject2).hcv);
        }
        this.wHR.eRj = f.a.C(paramau.field_content, paramau.field_reserved);
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        if (paramau.bTK())
        {
          Object localObject4 = f.a.eS(paramau.field_content);
          localObject3 = null;
          localObject2 = localObject3;
          if (localObject4 != null)
          {
            localObject2 = localObject3;
            if (((f.a)localObject4).eAE != null)
            {
              localObject2 = localObject3;
              if (((f.a)localObject4).eAE.length() > 0)
              {
                localObject4 = an.afP().Op(((f.a)localObject4).eAE);
                localObject2 = localObject3;
                if (localObject4 != null) {
                  localObject2 = ((b)localObject4).field_fileFullPath;
                }
              }
            }
          }
          localObject3 = localObject1;
          if (localObject2 != null) {
            localObject3 = localObject2;
          }
        }
        this.imagePath = ((String)localObject3);
        this.gVB = paramau.field_createTime;
        GMTrace.o(14926487748608L, 111211);
        return;
        localObject2 = n.IZ().b(paramau.field_imgPath, false, false);
        localObject1 = localObject2;
        if (!bg.nm((String)localObject2))
        {
          localObject1 = localObject2;
          if (!((String)localObject2).endsWith("hd"))
          {
            localObject1 = localObject2;
            if (FileOp.aZ((String)localObject2 + "hd")) {
              localObject1 = (String)localObject2 + "hd";
            }
          }
        }
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(14926353530880L, 111210);
      if ((this.eRz != null) && ((paramObject instanceof au)) && (paramObject != null))
      {
        if (this.eRz.field_msgId == ((au)paramObject).field_msgId)
        {
          GMTrace.o(14926353530880L, 111210);
          return true;
        }
        GMTrace.o(14926353530880L, 111210);
        return false;
      }
      boolean bool = super.equals(paramObject);
      GMTrace.o(14926353530880L, 111210);
      return bool;
    }
    
    final class a
    {
      public f.a eRj;
      public String wHS;
      
      a()
      {
        GMTrace.i(14931051151360L, 111245);
        GMTrace.o(14931051151360L, 111245);
      }
    }
  }
  
  public final class d
    extends RecyclerView.t
  {
    CheckBox lCA;
    View lCB;
    ImageView oOJ;
    View wHU;
    TextView wHV;
    ImageView wHW;
    View wHX;
    
    public d(View paramView)
    {
      super();
      GMTrace.i(14930514280448L, 111241);
      this.oOJ = ((ImageView)paramView.findViewById(R.h.bFz));
      this.wHU = paramView.findViewById(R.h.ckJ);
      this.wHX = paramView.findViewById(R.h.ceX);
      this.wHV = ((TextView)paramView.findViewById(R.h.ckH));
      this.wHW = ((ImageView)paramView.findViewById(R.h.bFC));
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bMz));
      this.lCB = paramView.findViewById(R.h.bMA);
      this.lCB.setVisibility(8);
      this.lCA.setVisibility(8);
      this.wHU.setVisibility(8);
      this.wHV.setVisibility(8);
      this.wHX.setVisibility(8);
      this.oOJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14930380062720L, 111240);
          Object localObject = a.this.CU(((Integer)paramAnonymousView.getTag()).intValue());
          if (localObject == null)
          {
            GMTrace.o(14930380062720L, 111240);
            return;
          }
          a locala = a.this;
          Intent localIntent = new Intent();
          localIntent.putExtra("key_biz_chat_id", locala.wHM);
          localIntent.putExtra("key_is_biz_chat", locala.txk);
          if (localObject == null)
          {
            w.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] item == null");
            GMTrace.o(14930380062720L, 111240);
            return;
          }
          localObject = ((a.c)localObject).eRz;
          if (localObject == null)
          {
            w.e("MicroMsg.MediaHistoryGalleryAdapter", "[enterGallery] msg == null");
            GMTrace.o(14930380062720L, 111240);
            return;
          }
          int k = locala.mContext.getResources().getConfiguration().orientation;
          int j = 0;
          int i = 0;
          int[] arrayOfInt = new int[2];
          if (paramAnonymousView != null)
          {
            j = paramAnonymousView.getWidth();
            i = paramAnonymousView.getHeight();
            paramAnonymousView.getLocationInWindow(arrayOfInt);
          }
          localIntent.addFlags(536870912);
          localIntent.putExtra("img_gallery_msg_id", ((ce)localObject).field_msgId).putExtra("img_gallery_msg_svr_id", ((ce)localObject).field_msgSvrId).putExtra("img_gallery_talker", ((ce)localObject).field_talker).putExtra("img_gallery_chatroom_name", ((ce)localObject).field_talker).putExtra("img_gallery_orientation", k);
          if (paramAnonymousView != null) {
            localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
          }
          for (;;)
          {
            d.a(locala.mContext, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", localIntent);
            ((Activity)locala.mContext).overridePendingTransition(0, 0);
            GMTrace.o(14930380062720L, 111240);
            return;
            localIntent.putExtra("img_gallery_back_from_grid", true);
          }
        }
      });
      this.lCB.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14926219313152L, 111209);
          boolean bool;
          if (!a.d.this.lCA.isChecked())
          {
            bool = true;
            if (g.a.wMg.wKD.size() >= 9) {
              break label146;
            }
            a.d.this.lCA.setChecked(bool);
            if (bool) {
              break label132;
            }
            a.d.this.wHW.setVisibility(8);
          }
          for (;;)
          {
            if (a.this.wHO != null)
            {
              int i = ((Integer)paramAnonymousView.getTag()).intValue();
              paramAnonymousView = a.this.CU(i);
              a.this.wHO.a(bool, paramAnonymousView, i);
            }
            GMTrace.o(14926219313152L, 111209);
            return;
            bool = false;
            break;
            label132:
            a.d.this.wHW.setVisibility(0);
            continue;
            label146:
            if (!bool) {
              a.d.this.lCA.setChecked(false);
            }
          }
        }
      });
      GMTrace.o(14930514280448L, 111241);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
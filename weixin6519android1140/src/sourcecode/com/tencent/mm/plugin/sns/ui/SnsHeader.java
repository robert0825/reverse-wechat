package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.v;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public class SnsHeader
  extends LinearLayout
{
  Context context;
  boolean eHl;
  String fJS;
  private Dialog lKo;
  b qaE;
  a qaF;
  private boolean qaG;
  private Map<Integer, View> qaH;
  private String qaI;
  Bitmap qaJ;
  int type;
  String userName;
  
  public SnsHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8510477697024L, 63408);
    this.qaG = false;
    this.eHl = false;
    this.qaH = new HashMap();
    this.qaI = "";
    this.qaJ = null;
    init(paramContext);
    GMTrace.o(8510477697024L, 63408);
  }
  
  public SnsHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8510611914752L, 63409);
    this.qaG = false;
    this.eHl = false;
    this.qaH = new HashMap();
    this.qaI = "";
    this.qaJ = null;
    init(paramContext);
    GMTrace.o(8510611914752L, 63409);
  }
  
  private void init(final Context paramContext)
  {
    GMTrace.i(8510746132480L, 63410);
    this.context = paramContext;
    View localView = v.fb(paramContext).inflate(i.g.pfK, this, true);
    this.qaE = new b();
    this.qaE.jgK = ((TextView)localView.findViewById(i.f.bQX));
    this.qaE.hqg = ((ImageView)localView.findViewById(i.f.bfq));
    this.qaE.pOz = ((TextView)localView.findViewById(i.f.pbX));
    this.qaE.qaO = ((ImageView)localView.findViewById(i.f.pcC));
    this.qaE.qaP = ((LinearLayout)localView.findViewById(i.f.pbV));
    this.qaE.qaQ = ((LinearLayout)localView.findViewById(i.f.pcT));
    this.qaE.qaO.setContentDescription(paramContext.getString(i.j.piG));
    this.qaE.qaO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8569801932800L, 63850);
        w.d("MicroMsg.SnsHeader", "change backGround");
        if ((SnsHeader.a(SnsHeader.this) != null) && (SnsHeader.a(SnsHeader.this).isShowing()))
        {
          GMTrace.o(8569801932800L, 63850);
          return;
        }
        if (SnsHeader.b(SnsHeader.this) != null) {
          SnsHeader.b(SnsHeader.this).boT();
        }
        if (SnsHeader.c(SnsHeader.this) == 1) {}
        final long l;
        for (paramAnonymousView = SnsHeader.d(SnsHeader.this);; paramAnonymousView = SnsHeader.e(SnsHeader.this))
        {
          paramAnonymousView = ae.bjh().Iw(paramAnonymousView);
          l = paramAnonymousView.field_snsBgId;
          if ((SnsHeader.f(SnsHeader.this)) || (l != 0L)) {
            break;
          }
          GMTrace.o(8569801932800L, 63850);
          return;
        }
        SnsHeader.a(SnsHeader.this, paramAnonymousView.blN());
        String str;
        if ((SnsHeader.c(SnsHeader.this) == 1) || (SnsHeader.d(SnsHeader.this).trim().equals(SnsHeader.e(SnsHeader.this).trim())))
        {
          paramAnonymousView = new String[1];
          paramAnonymousView[0] = paramContext.getString(i.j.pld);
          SnsHeader.a(SnsHeader.this, false);
          if (!SnsHeader.g(SnsHeader.this)) {
            break label335;
          }
          str = paramContext.getString(i.j.pkz);
          label236:
          if (!SnsHeader.g(SnsHeader.this)) {
            break label342;
          }
          paramContext.getString(i.j.cTM);
        }
        for (;;)
        {
          SnsHeader.a(SnsHeader.this, h.a(SnsHeader.this.getContext(), str, paramAnonymousView, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(8615972831232L, 64194);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(8615972831232L, 64194);
                return;
                if (!SnsHeader.g(SnsHeader.this)) {
                  SnsHeader.a(SnsHeader.this, l);
                }
              }
            }
          }));
          GMTrace.o(8569801932800L, 63850);
          return;
          if (SnsHeader.g(SnsHeader.this))
          {
            paramAnonymousView = new String[0];
            break;
          }
          paramAnonymousView = new String[1];
          paramAnonymousView[0] = paramContext.getString(i.j.pjW);
          break;
          label335:
          str = "";
          break label236;
          label342:
          paramContext.getString(i.j.cSk);
        }
      }
    });
    this.qaE.hqg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8393708273664L, 62538);
        paramAnonymousView = ae.biR().TE(SnsHeader.e(SnsHeader.this));
        if ((paramAnonymousView != null) && ((com.tencent.mm.l.a.eE(paramAnonymousView.field_type)) || (SnsHeader.f(SnsHeader.this))))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Contact_User", SnsHeader.e(SnsHeader.this));
          if ((SnsHeader.e(SnsHeader.this) != null) && (SnsHeader.e(SnsHeader.this).length() > 0)) {
            com.tencent.mm.plugin.sns.c.a.hnH.d(paramAnonymousView, paramContext);
          }
          GMTrace.o(8393708273664L, 62538);
          return;
        }
        paramAnonymousView = ((Activity)paramContext).getIntent();
        paramAnonymousView.putExtra("Contact_User", SnsHeader.e(SnsHeader.this));
        com.tencent.mm.plugin.sns.c.a.hnH.d(paramAnonymousView, paramContext);
        GMTrace.o(8393708273664L, 62538);
      }
    });
    GMTrace.o(8510746132480L, 63410);
  }
  
  public final void boR()
  {
    GMTrace.i(8510880350208L, 63411);
    String str1 = this.userName;
    if (this.type == 1) {
      str1 = this.fJS;
    }
    Object localObject1 = ae.getAccSnsPath();
    w.d("MicroMsg.SnsHeader", "MagicAsyncTask " + str1);
    k localk = ae.bjh().Iw(str1);
    String str2 = localk.field_bgId;
    Object localObject2 = localk.field_older_bgId;
    w.d("MicroMsg.SnsHeader", "showName " + str1 + " get bgId : " + str2 + "  olderBgId：　" + (String)localObject2);
    localObject2 = i.GO(str2);
    String str5 = str1 + "bg_";
    String str3 = str1 + "tbg_";
    String str4 = am.dE((String)localObject1, str1);
    FileOp.la(str4);
    int i;
    if ((localk.field_local_flag & 0x1) > 0)
    {
      i = 1;
      if (i != 0)
      {
        w.d("MicroMsg.SnsHeader", "bg is change");
        ae.bjh().Iv(str1);
        if (FileOp.aZ(am.dE((String)localObject1, str1) + str5))
        {
          FileOp.deleteFile(am.dE((String)localObject1, str1) + str3);
          FileOp.g(am.dE((String)localObject1, str1), str5, str3);
        }
        localk.field_local_flag &= 0xFFFFFFFE;
        ae.bjh().c(localk);
      }
      if ((FileOp.aZ(am.dE(ae.getAccSnsPath(), str2) + (String)localObject2)) && (!FileOp.aZ(am.dE((String)localObject1, str1) + str5)))
      {
        FileOp.o(am.dE((String)localObject1, str2) + (String)localObject2, am.dE((String)localObject1, str1) + str5);
        w.d("MicroMsg.SnsHeader", "nwer id Name update");
      }
      String str6 = localk.field_bgUrl;
      localObject1 = null;
      if (str2 != null)
      {
        ae.bja();
        localObject1 = str4 + str5;
        this.context.hashCode();
        localObject2 = g.a((String)localObject1, str6, str2, true, an.vBh);
        w.d("MicroMsg.SnsHeader", "set a new bg");
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          FileOp.deleteFile(str4 + str5);
          localObject1 = localObject2;
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = localObject1;
        if (str2 != null)
        {
          ae.bja();
          localObject1 = str4 + str3;
          this.context.hashCode();
          localObject2 = g.a((String)localObject1, str6, str2, false, an.vBh);
        }
      }
      if (this.qaE.qaO != null)
      {
        this.qaE.qaO.setImageBitmap((Bitmap)localObject2);
        if (localObject2 == null) {
          break label706;
        }
        this.qaE.qaO.setBackgroundDrawable(null);
      }
    }
    for (;;)
    {
      this.qaE.qaP.setVisibility(8);
      if ((localObject2 == null) && ((this.type == 1) || (this.fJS.equals(str1)))) {
        this.qaE.qaP.setVisibility(0);
      }
      this.qaG = localk.blN();
      GMTrace.o(8510880350208L, 63411);
      return;
      i = 0;
      break;
      try
      {
        label706:
        if ((this.qaJ == null) || (this.qaJ.isRecycled()))
        {
          w.i("MicroMsg.SnsHeader", "decode bitmap by self");
          this.qaJ = d.decodeStream(this.context.getAssets().open("resource/friendactivity_mycover_bg.jpg"));
        }
        localObject1 = new BitmapDrawable(this.qaJ);
        this.qaE.qaO.setBackgroundDrawable((Drawable)localObject1);
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.SnsHeader", localIOException, "", new Object[0]);
      }
    }
  }
  
  public final boolean boS()
  {
    GMTrace.i(8511014567936L, 63412);
    if (this.qaE.qaQ == null)
    {
      GMTrace.o(8511014567936L, 63412);
      return false;
    }
    Object localObject = ai.bjx();
    LinkedList localLinkedList = new LinkedList();
    final int i = 0;
    com.tencent.mm.plugin.sns.storage.m localm1;
    boolean bool;
    for (;;)
    {
      if (i >= ((List)localObject).size()) {
        break label120;
      }
      localm1 = (com.tencent.mm.plugin.sns.storage.m)((List)localObject).get(i);
      try
      {
        bool = ((anv)new anv().aD(localm1.field_postBuf)).uDC;
        if (!bool) {
          break;
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localLinkedList.add(localm1);
        }
      }
      i += 1;
    }
    label120:
    localObject = "";
    i = 0;
    for (;;)
    {
      if (i >= localLinkedList.size()) {
        break label230;
      }
      localm1 = (com.tencent.mm.plugin.sns.storage.m)localLinkedList.get(i);
      try
      {
        bool = ((anv)new anv().aD(localm1.field_postBuf)).uDC;
        if (!bool) {
          break;
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          localObject = (String)localObject + ((com.tencent.mm.plugin.sns.storage.m)localLinkedList.get(i)).blY() + " ";
        }
      }
      i += 1;
    }
    label230:
    w.i("MicroMsg.SnsHeader", "refreshError %s %s %s", new Object[] { Integer.valueOf(localLinkedList.size()), localObject, this.qaI });
    if (((String)localObject).equals(this.qaI))
    {
      if (localLinkedList.size() > 0)
      {
        GMTrace.o(8511014567936L, 63412);
        return true;
      }
      GMTrace.o(8511014567936L, 63412);
      return false;
    }
    this.qaI = ((String)localObject);
    this.qaE.qaQ.removeAllViews();
    localObject = this.qaE.qaQ;
    label370:
    int j;
    final int k;
    label454:
    TextView localTextView;
    if (localLinkedList.size() > 0)
    {
      i = 0;
      ((LinearLayout)localObject).setVisibility(i);
      Collections.sort(localLinkedList, new c());
      i = 0;
      if (i >= localLinkedList.size()) {
        break label624;
      }
      j = ((com.tencent.mm.plugin.sns.storage.m)localLinkedList.get(i)).pMe;
      k = localLinkedList.size();
      if ((!this.qaH.containsKey(Integer.valueOf(j))) || (this.qaH.get(Integer.valueOf(j)) == null)) {
        break label553;
      }
      localObject = (View)this.qaH.get(Integer.valueOf(j));
      localObject = (LinearLayout)localObject;
      ((LinearLayout)localObject).getChildAt(0).setTag(((com.tencent.mm.plugin.sns.storage.m)localLinkedList.get(i)).blY());
      com.tencent.mm.plugin.sns.storage.m localm2 = (com.tencent.mm.plugin.sns.storage.m)localLinkedList.get(i);
      localTextView = (TextView)((LinearLayout)localObject).findViewById(i.f.pdE);
      if (localm2.field_type != 15) {
        break label610;
      }
      localTextView.setText(i.j.pkr);
    }
    for (;;)
    {
      this.qaE.qaQ.addView((View)localObject);
      i += 1;
      break label370;
      i = 8;
      break;
      label553:
      localObject = (LinearLayout)v.fb(this.context).inflate(i.g.peP, null);
      ((LinearLayout)localObject).getChildAt(0).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8478802313216L, 63172);
          if ((paramAnonymousView.getTag() instanceof String))
          {
            Object localObject2 = (String)paramAnonymousView.getTag();
            w.i("MicroMsg.SnsHeader", "sns Header localId " + (String)localObject2);
            paramAnonymousView = ae.bjd().Is((String)localObject2);
            if ((SnsHeader.h(SnsHeader.this) != null) && (paramAnonymousView != null))
            {
              Object localObject1 = new Intent();
              ((Intent)localObject1).setClass(SnsHeader.h(SnsHeader.this), SnsCommentDetailUI.class);
              if ((paramAnonymousView == null) || (paramAnonymousView.field_userName == null) || (paramAnonymousView.field_userName.equals("")))
              {
                w.i("MicroMsg.SnsHeader", "error cntinfo or username is null");
                GMTrace.o(8478802313216L, 63172);
                return;
              }
              ((Intent)localObject1).putExtra("INTENT_TALKER", paramAnonymousView.field_userName);
              ((Intent)localObject1).putExtra("INTENT_SNS_LOCAL_ID", (String)localObject2);
              ((Intent)localObject1).putExtra("INTENT_FROMGALLERY", true);
              localObject2 = b.ha(726);
              ((b)localObject2).hd(k).hd(i).hd(paramAnonymousView.field_createTime);
              ((b)localObject2).LR();
              SnsHeader.h(SnsHeader.this).startActivity((Intent)localObject1);
              try
              {
                localObject1 = (anv)new anv().aD(paramAnonymousView.field_postBuf);
                if ((((anv)localObject1).uDt == 201) || (((anv)localObject1).uDt == 210) || (((anv)localObject1).uDt != 211))
                {
                  ((anv)localObject1).uDC = true;
                  paramAnonymousView.field_postBuf = ((anv)localObject1).toByteArray();
                  ae.bjd().b(paramAnonymousView.pMe, paramAnonymousView);
                }
                GMTrace.o(8478802313216L, 63172);
                return;
              }
              catch (Exception paramAnonymousView) {}
            }
          }
          GMTrace.o(8478802313216L, 63172);
        }
      });
      this.qaH.put(Integer.valueOf(j), localObject);
      break label454;
      label610:
      localTextView.setTag(Integer.valueOf(i.j.pkm));
    }
    label624:
    if (localLinkedList.size() > 0)
    {
      GMTrace.o(8511014567936L, 63412);
      return true;
    }
    GMTrace.o(8511014567936L, 63412);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean boT();
    
    public abstract boolean dY(long paramLong);
  }
  
  final class b
  {
    ImageView hqg;
    TextView jgK;
    TextView pOz;
    ImageView qaO;
    LinearLayout qaP;
    LinearLayout qaQ;
    
    b()
    {
      GMTrace.i(8560406691840L, 63780);
      GMTrace.o(8560406691840L, 63780);
    }
  }
  
  final class c
    implements Comparator<com.tencent.mm.plugin.sns.storage.m>
  {
    c()
    {
      GMTrace.i(8624562765824L, 64258);
      GMTrace.o(8624562765824L, 64258);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ao.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class c
  extends com.tencent.mm.ui.o<com.tencent.mm.plugin.masssend.a.a>
{
  private static short mTA;
  private static short mTB;
  private static short mTC;
  private static short mTz;
  private MMActivity ezR;
  int gQB;
  int jIt;
  private LayoutInflater lVD;
  private short[] mTD;
  private List<String> mTE;
  String mTF;
  e mTG;
  
  static
  {
    GMTrace.i(11233889615872L, 83699);
    mTz = 1;
    mTA = 2;
    mTB = 3;
    mTC = 4;
    GMTrace.o(11233889615872L, 83699);
  }
  
  public c(Context paramContext)
  {
    super(paramContext, new com.tencent.mm.plugin.masssend.a.a());
    GMTrace.i(11232413220864L, 83688);
    this.mTF = "";
    this.ezR = ((MMActivity)paramContext);
    this.mTE = new LinkedList();
    this.jIt = 10;
    this.gQB = this.jIt;
    this.lVD = v.fb(paramContext);
    GMTrace.o(11232413220864L, 83688);
  }
  
  private static int ln(int paramInt)
  {
    GMTrace.i(11233218527232L, 83694);
    if (paramInt <= 2)
    {
      GMTrace.o(11233218527232L, 83694);
      return 100;
    }
    if (paramInt < 10)
    {
      GMTrace.o(11233218527232L, 83694);
      return (paramInt - 2) * 8 + 100;
    }
    if (paramInt < 60)
    {
      paramInt /= 10;
      GMTrace.o(11233218527232L, 83694);
      return (paramInt + 7) * 8 + 100;
    }
    GMTrace.o(11233218527232L, 83694);
    return 204;
  }
  
  public final void BN(String paramString)
  {
    GMTrace.i(11233084309504L, 83693);
    this.mTF = paramString;
    notifyDataSetChanged();
    GMTrace.o(11233084309504L, 83693);
  }
  
  public final void QF()
  {
    GMTrace.i(11232815874048L, 83691);
    Object localObject = com.tencent.mm.plugin.masssend.a.h.aNB().goN.a("SELECT count(*) FROM massendinfo", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      this.gQB = i;
      localObject = com.tencent.mm.plugin.masssend.a.h.aNB();
      i = this.jIt;
      String str = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   ORDER BY createtime ASC  LIMIT " + i + " offset (SELECT count(*) FROM massendinfo ) -" + i;
      w.v("MicroMsg.MasSendInfoStorage", "getCursor sql:" + str);
      setCursor(((b)localObject).goN.a(str, null, 0));
      i = getCount();
      if (i > 0) {
        this.mTD = new short[i];
      }
      super.notifyDataSetChanged();
      GMTrace.o(11232815874048L, 83691);
      return;
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(11232547438592L, 83689);
    QF();
    GMTrace.o(11232547438592L, 83689);
  }
  
  public final boolean alU()
  {
    GMTrace.i(11232681656320L, 83690);
    if (this.jIt >= this.gQB)
    {
      GMTrace.o(11232681656320L, 83690);
      return true;
    }
    GMTrace.o(11232681656320L, 83690);
    return false;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11232950091776L, 83692);
    Object localObject1 = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
    int i;
    int j;
    label84:
    label104:
    label128:
    label178:
    label218:
    label264:
    Object localObject2;
    if (paramInt != 0)
    {
      long l1 = ((com.tencent.mm.plugin.masssend.a.a)getItem(paramInt - 1)).hcs;
      paramViewGroup = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
      long l2 = paramViewGroup.hcs;
      if (l2 - l1 < 60000L)
      {
        i = 1;
        if ((l2 - l1) / 180000L >= 1L) {
          break label508;
        }
        j = 1;
        if ((i == 0) && (j == 0)) {
          break label514;
        }
        this.mTD[paramInt] = 2;
        localObject1 = paramViewGroup;
        if ((this.mTD[paramInt] != 1) || (((com.tencent.mm.plugin.masssend.a.a)localObject1).hcs <= 1000L)) {
          break label537;
        }
        paramInt = 1;
        switch (((com.tencent.mm.plugin.masssend.a.a)localObject1).msgType)
        {
        default: 
          paramViewGroup = paramView;
          paramView = (f)paramViewGroup.getTag();
          if (paramInt != 0)
          {
            paramView.lWz.setVisibility(0);
            paramView.lWz.setText(com.tencent.mm.pluginsdk.i.n.c(this.ezR, ((com.tencent.mm.plugin.masssend.a.a)localObject1).hcs, false));
            switch (((com.tencent.mm.plugin.masssend.a.a)localObject1).msgType)
            {
            default: 
              localObject2 = (f)paramViewGroup.getTag();
              ((f)localObject2).mTI.setText(this.ezR.getResources().getQuantityString(R.j.cIs, ((com.tencent.mm.plugin.masssend.a.a)localObject1).mTb, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.masssend.a.a)localObject1).mTb) }));
              if (this.mTE.contains(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt()))
              {
                ((f)localObject2).mTJ.setSingleLine(false);
                ((f)localObject2).mTJ.setEllipsize(null);
              }
              break;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      Object localObject3 = ((f)localObject2).mTJ;
      MMActivity localMMActivity = this.ezR;
      paramView = new ArrayList();
      if ((((com.tencent.mm.plugin.masssend.a.a)localObject1).aNw() != null) && (!((com.tencent.mm.plugin.masssend.a.a)localObject1).aNw().equals(""))) {
        break label1765;
      }
      paramView = "";
      ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localMMActivity, paramView, ((f)localObject2).mTJ.getTextSize()));
      paramInt = (int)((f)localObject2).mTJ.getTextSize();
      paramView = ((f)localObject2).mTJ.getText().toString();
      com.tencent.mm.br.a.fromDPToPix(this.ezR, 255);
      localObject3 = new Paint();
      ((Paint)localObject3).setTextSize(paramInt);
      ((Paint)localObject3).measureText(paramView);
      ((f)localObject2).mTM.setOnClickListener(new b(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt()));
      GMTrace.o(11232950091776L, 83692);
      return paramViewGroup;
      i = 0;
      break;
      label508:
      j = 0;
      break label84;
      label514:
      this.mTD[paramInt] = 1;
      localObject1 = paramViewGroup;
      break label104;
      this.mTD[paramInt] = 1;
      break label104;
      label537:
      paramInt = 0;
      break label128;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).mTP == mTz) {
          break label178;
        }
      }
      paramViewGroup = this.lVD.inflate(R.i.cBj, null);
      ((f)localObject2).mTI = ((TextView)paramViewGroup.findViewById(R.h.bMi));
      ((f)localObject2).mTJ = ((TextView)paramViewGroup.findViewById(R.h.bMk));
      ((f)localObject2).mTK = ((TextView)paramViewGroup.findViewById(R.h.bMl));
      ((f)localObject2).mTM = ((TextView)paramViewGroup.findViewById(R.h.bMg));
      ((f)localObject2).lWz = ((TextView)paramViewGroup.findViewById(R.h.bMq));
      ((f)localObject2).mTO = paramViewGroup.findViewById(R.h.bMh);
      ((f)localObject2).mTP = mTz;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).mTP == mTC) {
          break label178;
        }
      }
      paramViewGroup = this.lVD.inflate(R.i.cBl, null);
      ((f)localObject2).mTI = ((TextView)paramViewGroup.findViewById(R.h.bMi));
      ((f)localObject2).mTJ = ((TextView)paramViewGroup.findViewById(R.h.bMk));
      ((f)localObject2).mTL = ((TextView)paramViewGroup.findViewById(R.h.bMj));
      ((f)localObject2).mTK = ((TextView)paramViewGroup.findViewById(R.h.bMp));
      ((f)localObject2).mTN = ((AnimImageView)paramViewGroup.findViewById(R.h.bMo));
      ((f)localObject2).mTM = ((TextView)paramViewGroup.findViewById(R.h.bMg));
      ((f)localObject2).lWz = ((TextView)paramViewGroup.findViewById(R.h.bMq));
      ((f)localObject2).mTO = paramViewGroup.findViewById(R.h.bMh);
      ((f)localObject2).mTP = mTC;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).mTP == mTA) {
          break label178;
        }
      }
      paramViewGroup = this.lVD.inflate(R.i.cBi, null);
      ((f)localObject2).mTI = ((TextView)paramViewGroup.findViewById(R.h.bMi));
      ((f)localObject2).mTJ = ((TextView)paramViewGroup.findViewById(R.h.bMk));
      ((f)localObject2).len = ((ImageView)paramViewGroup.findViewById(R.h.bMm));
      ((f)localObject2).mTM = ((TextView)paramViewGroup.findViewById(R.h.bMg));
      ((f)localObject2).lWz = ((TextView)paramViewGroup.findViewById(R.h.bMq));
      ((f)localObject2).mTO = paramViewGroup.findViewById(R.h.bMh);
      ((f)localObject2).mTP = mTA;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).mTP == mTB) {
          break label178;
        }
      }
      paramViewGroup = this.lVD.inflate(R.i.cBk, null);
      ((f)localObject2).mTI = ((TextView)paramViewGroup.findViewById(R.h.bMi));
      ((f)localObject2).mTJ = ((TextView)paramViewGroup.findViewById(R.h.bMk));
      ((f)localObject2).len = ((ImageView)paramViewGroup.findViewById(R.h.bMm));
      ((f)localObject2).mTL = ((TextView)paramViewGroup.findViewById(R.h.bMn));
      ((f)localObject2).mTM = ((TextView)paramViewGroup.findViewById(R.h.bMg));
      ((f)localObject2).lWz = ((TextView)paramViewGroup.findViewById(R.h.bMq));
      ((f)localObject2).mTO = paramViewGroup.findViewById(R.h.bMh);
      ((f)localObject2).mTP = mTB;
      paramViewGroup.setTag(localObject2);
      break label178;
      paramView.lWz.setVisibility(8);
      break label218;
      paramView = (f)paramViewGroup.getTag();
      paramView.mTK.setText(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNu());
      com.tencent.mm.pluginsdk.ui.d.h.e(paramView.mTK, 1);
      break label264;
      paramView = (f)paramViewGroup.getTag();
      float f = com.tencent.mm.modelvoice.q.aD(((com.tencent.mm.plugin.masssend.a.a)localObject1).mTc);
      if (((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt().equals(this.mTF))
      {
        paramView.mTN.setVisibility(0);
        paramView.mTN.bZq();
        paramView.mTK.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      }
      for (;;)
      {
        paramView.mTL.setText(this.ezR.getString(R.l.dxn, new Object[] { Integer.valueOf((int)f) }));
        paramView.mTK.setWidth(com.tencent.mm.br.a.fromDPToPix(paramView.mTK.getContext(), ln((int)f)));
        paramView.mTN.setWidth(com.tencent.mm.br.a.fromDPToPix(paramView.mTK.getContext(), ln((int)f)));
        paramView.mTK.setOnClickListener(new d(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNt()));
        break;
        paramView.mTN.setVisibility(8);
        paramView.mTN.bbd();
        paramView.mTK.setCompoundDrawablesWithIntrinsicBounds(null, null, this.ezR.getResources().getDrawable(R.k.cLp), null);
      }
      paramView = (f)paramViewGroup.getTag();
      at.AR();
      if (com.tencent.mm.y.c.isSDCardAvailable())
      {
        com.tencent.mm.plugin.masssend.a.h.aNB();
        localObject2 = b.BJ(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNu());
        if (localObject2 != null) {
          paramView.len.setImageBitmap((Bitmap)localObject2);
        }
      }
      for (;;)
      {
        paramView.len.setOnClickListener(new a(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNu(), ((com.tencent.mm.plugin.masssend.a.a)localObject1).mTg));
        break;
        com.tencent.mm.plugin.masssend.a.h.aNB();
        localObject2 = b.b(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNv(), com.tencent.mm.br.a.getDensity(paramView.len.getContext()));
        paramView.len.setImageBitmap((Bitmap)localObject2);
        continue;
        paramView.len.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.g.aYv));
      }
      paramView = (f)paramViewGroup.getTag();
      com.tencent.mm.modelvideo.o.Nh();
      localObject2 = s.ml(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNu());
      localObject2 = com.tencent.mm.ao.n.IZ().a((String)localObject2, com.tencent.mm.br.a.getDensity(paramView.len.getContext()), this.ezR);
      if (localObject2 == null)
      {
        at.AR();
        if (!com.tencent.mm.y.c.isSDCardAvailable()) {
          paramView.len.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.cPv));
        }
      }
      for (;;)
      {
        paramView.len.setOnClickListener(new c(((com.tencent.mm.plugin.masssend.a.a)localObject1).aNu(), ((com.tencent.mm.plugin.masssend.a.a)localObject1).mTf, ((com.tencent.mm.plugin.masssend.a.a)localObject1).eqU, ((com.tencent.mm.plugin.masssend.a.a)localObject1).mTc));
        if (((com.tencent.mm.plugin.masssend.a.a)localObject1).mTf != 2) {
          break label1716;
        }
        paramView.mTL.setVisibility(8);
        break;
        paramView.len.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.e.aNU));
        continue;
        paramView.len.setImageBitmap((Bitmap)localObject2);
      }
      label1716:
      paramView.mTL.setVisibility(0);
      paramView.mTL.setText(bg.hB(((com.tencent.mm.plugin.masssend.a.a)localObject1).mTc));
      break label264;
      ((f)localObject2).mTJ.setSingleLine(true);
      ((f)localObject2).mTJ.setEllipsize(TextUtils.TruncateAt.END);
    }
    label1765:
    Object localObject4 = ((com.tencent.mm.plugin.masssend.a.a)localObject1).aNw().split(";");
    if ((localObject4 != null) && (localObject4.length > 0)) {
      paramView = bg.g((String[])localObject4);
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramView = "";
        break;
      }
      localObject4 = new StringBuilder();
      paramInt = 0;
      if (paramInt < paramView.size())
      {
        String str = r.fs((String)paramView.get(paramInt));
        if (paramInt == paramView.size() - 1) {
          ((StringBuilder)localObject4).append(str);
        }
        for (;;)
        {
          paramInt += 1;
          break;
          ((StringBuilder)localObject4).append(str + ", ");
        }
      }
      paramView = ((StringBuilder)localObject4).toString();
      break;
    }
  }
  
  final class a
    implements View.OnClickListener
  {
    private String euR;
    private int mTg;
    
    public a(String paramString, int paramInt)
    {
      GMTrace.i(11239660978176L, 83742);
      this.euR = paramString;
      this.mTg = paramInt;
      GMTrace.o(11239660978176L, 83742);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11239795195904L, 83743);
      w.v("MicroMsg.HistoryAdapter", "image clicked:" + this.euR);
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        u.fo(c.a(c.this));
        GMTrace.o(11239795195904L, 83743);
        return;
      }
      paramView = new StringBuilder();
      at.AR();
      paramView = com.tencent.mm.y.c.yU() + this.euR;
      if ((paramView == null) || (paramView.equals("")) || (!e.aZ(paramView)))
      {
        w.d("MicroMsg.HistoryAdapter", "showImg : imgPath is null");
        GMTrace.o(11239795195904L, 83743);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("key_compress_type", this.mTg);
      localIntent.putExtra("key_favorite", false);
      localIntent.putExtra("key_image_path", paramView);
      com.tencent.mm.plugin.masssend.a.hnH.c(c.a(c.this), localIntent);
      GMTrace.o(11239795195904L, 83743);
    }
  }
  
  final class b
    implements View.OnClickListener
  {
    private String id;
    
    public b(String paramString)
    {
      GMTrace.i(11231339479040L, 83680);
      this.id = paramString;
      GMTrace.o(11231339479040L, 83680);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11231473696768L, 83681);
      paramView = com.tencent.mm.plugin.masssend.a.h.aNB().BK(this.id);
      Intent localIntent = new Intent(c.a(c.this), MassSendMsgUI.class);
      localIntent.putExtra("mass_send_contact_list", paramView.aNw());
      localIntent.putExtra("mass_send_again", true);
      c.a(c.this).startActivity(localIntent);
      GMTrace.o(11231473696768L, 83681);
    }
  }
  
  final class c
    implements View.OnClickListener
  {
    private String euR;
    private int length;
    private int mTf;
    private int size;
    
    public c(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(11237916147712L, 83729);
      this.euR = paramString;
      this.mTf = paramInt1;
      this.length = paramInt3;
      this.size = paramInt2;
      GMTrace.o(11237916147712L, 83729);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11238050365440L, 83730);
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        u.fo(c.a(c.this));
        GMTrace.o(11238050365440L, 83730);
        return;
      }
      if (this.mTf == 2) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        com.tencent.mm.modelvideo.o.Nh();
        boolean bool2 = com.tencent.mm.modelvideo.q.mc(s.mk(this.euR));
        w.i("MicroMsg.HistoryAdapter", "video clicked, path:%s, isExport:%b, typeQt:%b", new Object[] { this.euR, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        com.tencent.mm.plugin.masssend.a.hnH.a(bool1, bool2, c.a(c.this), this.euR, this.length, this.size);
        GMTrace.o(11238050365440L, 83730);
        return;
      }
    }
  }
  
  final class d
    implements View.OnClickListener
  {
    private String id;
    
    public d(String paramString)
    {
      GMTrace.i(11236573970432L, 83719);
      this.id = paramString;
      GMTrace.o(11236573970432L, 83719);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11236708188160L, 83720);
      w.v("MicroMsg.HistoryAdapter", "voice clicked:" + this.id);
      if (c.b(c.this) != null)
      {
        c.a(c.this, c.b(c.this).BO(this.id));
        c.this.notifyDataSetChanged();
      }
      GMTrace.o(11236708188160L, 83720);
    }
  }
  
  static abstract interface e
  {
    public abstract String BO(String paramString);
  }
  
  static final class f
  {
    TextView lWz;
    ImageView len;
    TextView mTI;
    TextView mTJ;
    TextView mTK;
    TextView mTL;
    TextView mTM;
    AnimImageView mTN;
    View mTO;
    short mTP;
    
    f()
    {
      GMTrace.i(11240197849088L, 83746);
      GMTrace.o(11240197849088L, 83746);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\masssend\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;
import com.tencent.mm.y.q;

public final class s
  extends LinearLayout
  implements v
{
  private Context context;
  private boolean eHl;
  int eHm;
  private String eHy;
  private String fJS;
  private int jHw;
  b pSt;
  private m pSu;
  a pSv;
  private View.OnTouchListener pSw;
  private boolean pSx;
  
  public s(final Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(8447798018048L, 62941);
    this.pSt = new b();
    this.pSu = null;
    this.jHw = 0;
    this.eHy = "";
    this.eHl = false;
    this.pSw = bg.bQV();
    this.fJS = "";
    this.pSx = true;
    this.jHw = paramInt;
    this.eHl = paramBoolean;
    this.context = paramContext;
    if (this.jHw != -1)
    {
      this.fJS = q.zE();
      View localView = LayoutInflater.from(paramContext).inflate(i.g.pfG, this, true);
      this.pSt.pSA = ((LinearLayout)localView.findViewById(i.f.peh));
      this.pSt.pSK = ((LinearLayout)localView.findViewById(i.f.pey));
      this.pSt.pSD = ((LinearLayout)localView.findViewById(i.f.pbh));
      this.pSt.pSD.setOnTouchListener(this.pSw);
      this.pSt.pSE = ((ImageView)localView.findViewById(i.f.paW));
      this.pSt.pSF = ((LinearLayout)localView.findViewById(i.f.pag));
      this.pSt.pSF.setOnTouchListener(this.pSw);
      this.pSt.pSG = ((LinearLayout)localView.findViewById(i.f.pal));
      this.pSt.pSI = ((TextView)localView.findViewById(i.f.pcF));
      this.pSt.pSJ = ((TextView)localView.findViewById(i.f.pcG));
      this.pSt.pSH = ((TextView)localView.findViewById(i.f.paM));
      this.pSt.pSB = ((TextView)localView.findViewById(i.f.pbT));
      this.pSt.pSC = ((LinearLayout)localView.findViewById(i.f.pbU));
      this.pSt.mrx = ((TextView)localView.findViewById(i.f.pcQ));
      this.pSt.mrx.setTextSize(1, this.pSt.mrx.getTextSize() * ab.dZ(paramContext) / a.getDensity(this.pSt.mrx.getContext()));
      this.pSt.pSO = ((LinearLayout)localView.findViewById(i.f.paZ));
      ((LinearLayout)localView.findViewById(i.f.paZ)).getBackground().setAlpha(50);
      this.pSt.hqg = ((ImageView)localView.findViewById(i.f.oZX));
      this.pSt.pSL = ((ImageView)localView.findViewById(i.f.pbq));
      this.pSt.pSM = ((ImageView)localView.findViewById(i.f.paD));
      this.pSt.pSN = ((LinearLayout)localView.findViewById(i.f.pap));
      this.pSt.pSP = ((TextView)localView.findViewById(i.f.paq));
      if (this.jHw != 2) {
        break label663;
      }
      this.pSt.pSK.setVisibility(8);
      this.pSt.pSN.setVisibility(8);
      this.pSt.pSC.setVisibility(0);
    }
    for (;;)
    {
      this.pSt.pSD.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8560675127296L, 63782);
          if (s.a(s.this) == null)
          {
            GMTrace.o(8560675127296L, 63782);
            return;
          }
          if (s.a(s.this).field_likeFlag == 0) {
            if (s.a(s.this).blX())
            {
              al.a.a(s.a(s.this), 1, "", "", s.b(s.this));
              s.a(s.this).field_likeFlag = 1;
              com.tencent.mm.plugin.sns.model.ae.bjd().z(s.a(s.this));
              label101:
              if (s.a(s.this).field_snsId != 0L) {
                break label279;
              }
            }
          }
          label279:
          for (paramAnonymousView = "";; paramAnonymousView = i.dt(s.a(s.this).field_snsId))
          {
            g.ork.i(11989, new Object[] { Integer.valueOf(1), paramAnonymousView, Integer.valueOf(0) });
            new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8390487048192L, 62514);
                s.this.refresh();
                GMTrace.o(8390487048192L, 62514);
              }
            }, 500L);
            GMTrace.o(8560675127296L, 63782);
            return;
            al.a.a(s.a(s.this).field_userName, 5, "", s.a(s.this), s.b(s.this));
            break;
            s.a(s.this).field_likeFlag = 0;
            com.tencent.mm.plugin.sns.model.ae.bjd().z(s.a(s.this));
            al.a.Hz(s.a(s.this).blE());
            s.a(s.this, com.tencent.mm.plugin.sns.model.ae.bjd().dU(s.a(s.this).field_snsId));
            break label101;
          }
        }
      });
      this.pSt.pSF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8315861991424L, 61958);
          w.d("MicroMsg.GalleryFooter", "comment cmd");
          if (s.a(s.this) == null)
          {
            GMTrace.o(8315861991424L, 61958);
            return;
          }
          int i = s.a(s.this).pMe;
          Intent localIntent = new Intent();
          localIntent.putExtra("sns_comment_localId", i);
          localIntent.putExtra("sns_source", s.b(s.this));
          localIntent.setClass(paramContext, SnsCommentUI.class);
          if (s.a(s.this).field_snsId == 0L) {}
          for (paramAnonymousView = "";; paramAnonymousView = i.dt(s.a(s.this).field_snsId))
          {
            g.ork.i(11989, new Object[] { Integer.valueOf(2), paramAnonymousView, Integer.valueOf(0) });
            paramContext.startActivity(localIntent);
            GMTrace.o(8315861991424L, 61958);
            return;
          }
        }
      });
      this.pSt.pSG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8744150761472L, 65149);
          if (s.a(s.this) == null)
          {
            GMTrace.o(8744150761472L, 65149);
            return;
          }
          if (s.a(s.this).field_snsId == 0L) {}
          for (paramAnonymousView = "";; paramAnonymousView = i.dt(s.a(s.this).field_snsId))
          {
            g.ork.i(11989, new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(0) });
            int i = s.a(s.this).pMe;
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(paramContext, SnsCommentDetailUI.class);
            paramAnonymousView.putExtra("INTENT_TALKER", s.a(s.this).field_userName);
            paramAnonymousView.putExtra("INTENT_SNS_LOCAL_ID", u.X("sns_table_", i));
            paramAnonymousView.putExtra("INTENT_FROMGALLERY", true);
            ((MMActivity)paramContext).startActivityForResult(paramAnonymousView, 1);
            GMTrace.o(8744150761472L, 65149);
            return;
          }
        }
      });
      this.pSt.pSB.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8615704395776L, 64192);
          if (s.c(s.this) != null) {
            s.c(s.this).bmF();
          }
          GMTrace.o(8615704395776L, 64192);
        }
      });
      this.pSt.pSP.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8336531521536L, 62112);
          GMTrace.o(8336531521536L, 62112);
        }
      });
      GMTrace.o(8447798018048L, 62941);
      return;
      label663:
      if (this.jHw == 3)
      {
        this.pSt.pSK.setVisibility(8);
        this.pSt.pSC.setVisibility(8);
        this.pSt.pSN.setVisibility(0);
      }
      else
      {
        this.pSt.pSK.setVisibility(0);
        this.pSt.pSC.setVisibility(8);
        this.pSt.pSN.setVisibility(8);
      }
    }
  }
  
  public final void IV(String paramString)
  {
    GMTrace.i(8448066453504L, 62943);
    this.eHy = paramString;
    refresh();
    GMTrace.o(8448066453504L, 62943);
  }
  
  public final void refresh()
  {
    GMTrace.i(8447932235776L, 62942);
    if (this.jHw == -1)
    {
      GMTrace.o(8447932235776L, 62942);
      return;
    }
    this.pSu = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
    if ((bg.nm(this.eHy)) || (this.pSu == null))
    {
      GMTrace.o(8447932235776L, 62942);
      return;
    }
    this.pSt.pSM.setVisibility(8);
    if (ai.F(this.pSu.field_localPrivate, this.eHl))
    {
      this.pSt.pSF.setVisibility(8);
      this.pSt.pSD.setVisibility(8);
      localObject = ai.n(this.pSu);
      if (localObject != null)
      {
        if (this.pSu.blX())
        {
          int i = ((bfh)localObject).uQR;
          if (i <= 0) {
            break label522;
          }
          this.pSt.pSJ.setText(String.valueOf(i));
          this.pSt.pSJ.setVisibility(0);
          label177:
          int j = ((bfh)localObject).uQO;
          if (j <= 0) {
            break label537;
          }
          this.pSt.pSI.setText(String.valueOf(j));
          this.pSt.pSI.setVisibility(0);
          label211:
          w.d("MicroMsg.GalleryFooter", "commentCount " + i + " " + j);
          if (this.pSu.field_likeFlag != 1) {
            break label552;
          }
          localObject = getResources().getString(i.j.pjr);
          this.pSt.pSH.setText((CharSequence)localObject);
          this.pSt.pSE.setImageResource(i.i.pha);
        }
        label290:
        if ((this.fJS.equals(this.pSu.field_userName)) || (!this.eHl)) {
          break label590;
        }
        this.pSt.hqg.setVisibility(0);
        a.b.a(this.pSt.hqg, this.pSu.field_userName);
      }
    }
    for (;;)
    {
      if (this.pSu.blD() != null) {
        break label605;
      }
      this.pSt.mrx.setVisibility(8);
      GMTrace.o(8447932235776L, 62942);
      return;
      if (!this.pSu.blX())
      {
        this.pSt.pSO.setVisibility(0);
        this.pSt.pSK.setVisibility(0);
        this.pSt.pSA.setVisibility(8);
        this.pSt.pSG.setVisibility(8);
        this.pSt.pSF.setVisibility(8);
        this.pSt.pSD.setVisibility(8);
        break;
      }
      if (this.pSx) {
        this.pSt.pSA.setVisibility(0);
      }
      this.pSt.pSG.setVisibility(0);
      this.pSt.pSF.setVisibility(0);
      this.pSt.pSD.setVisibility(0);
      this.pSt.pSK.setVisibility(0);
      break;
      label522:
      this.pSt.pSJ.setVisibility(8);
      break label177;
      label537:
      this.pSt.pSI.setVisibility(8);
      break label211;
      label552:
      localObject = getResources().getString(i.j.pjs);
      this.pSt.pSH.setText((CharSequence)localObject);
      this.pSt.pSE.setImageResource(i.i.phb);
      break label290;
      label590:
      this.pSt.hqg.setVisibility(8);
    }
    label605:
    Object localObject = this.pSu.blD().uTZ;
    if ((localObject == null) || (((String)localObject).equals("")))
    {
      this.pSt.mrx.setText("");
      this.pSt.mrx.setVisibility(8);
      if (!ai.F(this.pSu.field_localPrivate, this.eHl)) {
        break label813;
      }
      this.pSt.pSL.setVisibility(0);
      this.pSt.mrx.setVisibility(0);
    }
    for (;;)
    {
      if ((this.eHl) && (this.pSu.bma()))
      {
        this.pSt.pSG.setVisibility(0);
        this.pSt.mrx.setVisibility(0);
        this.pSt.pSM.setVisibility(0);
      }
      GMTrace.o(8447932235776L, 62942);
      return;
      this.pSt.mrx.setText(h.b(getContext(), (String)localObject + " ", this.pSt.mrx.getTextSize()));
      this.pSt.mrx.setVisibility(0);
      break;
      label813:
      this.pSt.pSL.setVisibility(8);
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    boolean bool = false;
    GMTrace.i(8447663800320L, 62940);
    if ((this.jHw == 2) || (this.jHw == 3))
    {
      super.setVisibility(paramInt);
      if (paramInt == 8) {}
      for (;;)
      {
        this.pSx = bool;
        GMTrace.o(8447663800320L, 62940);
        return;
        bool = true;
      }
    }
    if ((this.pSu != null) && (!this.pSu.blX()))
    {
      GMTrace.o(8447663800320L, 62940);
      return;
    }
    if (paramInt == 8)
    {
      this.pSt.pSA.setVisibility(8);
      this.pSx = false;
      GMTrace.o(8447663800320L, 62940);
      return;
    }
    if (paramInt == 0)
    {
      this.pSt.pSA.setVisibility(0);
      this.pSx = true;
    }
    GMTrace.o(8447663800320L, 62940);
  }
  
  public static abstract interface a
  {
    public abstract void bmF();
  }
  
  final class b
  {
    ImageView hqg;
    TextView mrx;
    LinearLayout pSA;
    TextView pSB;
    LinearLayout pSC;
    LinearLayout pSD;
    ImageView pSE;
    LinearLayout pSF;
    LinearLayout pSG;
    TextView pSH;
    TextView pSI;
    TextView pSJ;
    LinearLayout pSK;
    ImageView pSL;
    ImageView pSM;
    LinearLayout pSN;
    LinearLayout pSO;
    TextView pSP;
    
    b()
    {
      GMTrace.i(8354516697088L, 62246);
      GMTrace.o(8354516697088L, 62246);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
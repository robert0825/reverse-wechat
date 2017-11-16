package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.br.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@Deprecated
final class d
  extends o<com.tencent.mm.modelfriend.h>
{
  private int[] gCW;
  private String htQ;
  a vPI;
  
  public d(Context paramContext, o.a parama)
  {
    super(paramContext, new com.tencent.mm.modelfriend.h());
    GMTrace.i(2577114595328L, 19201);
    this.vKu = parama;
    GMTrace.o(2577114595328L, 19201);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(2577517248512L, 19204);
    this.htQ = bg.nk(paramString.trim());
    aJe();
    QF();
    GMTrace.o(2577517248512L, 19204);
  }
  
  public final void QF()
  {
    GMTrace.i(2577383030784L, 19203);
    i locali = af.Ig();
    String str = this.htQ;
    StringBuilder localStringBuilder = new StringBuilder();
    if ((str != null) && (str.length() > 0))
    {
      localStringBuilder.append(" where ( ");
      localStringBuilder.append("facebookfriend.fbname like '%" + str + "%' or ");
      localStringBuilder.append("facebookfriend.nickname like '%" + str + "%' or ");
      localStringBuilder.append("facebookfriend.username like '%" + str + "%' ) ");
    }
    setCursor(locali.goN.a("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + localStringBuilder.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null, 0));
    this.gCW = new int[getCount()];
    if ((this.vPI != null) && (this.htQ != null)) {
      this.vPI.Bs(getCursor().getCount());
    }
    super.notifyDataSetChanged();
    GMTrace.o(2577383030784L, 19203);
  }
  
  protected final void QG()
  {
    GMTrace.i(2577248813056L, 19202);
    QF();
    GMTrace.o(2577248813056L, 19202);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2577651466240L, 19205);
    Object localObject = (com.tencent.mm.modelfriend.h)getItem(paramInt);
    if (paramView == null)
    {
      paramViewGroup = new b();
      paramView = View.inflate(this.context, R.i.cwj, null);
      paramViewGroup.hqg = ((ImageView)paramView.findViewById(R.h.brE));
      paramViewGroup.gDd = ((TextView)paramView.findViewById(R.h.bUO));
      paramViewGroup.gDe = ((TextView)paramView.findViewById(R.h.bUJ));
      paramViewGroup.vPJ = ((TextView)paramView.findViewById(R.h.bUK));
      paramViewGroup.vPK = ((TextView)paramView.findViewById(R.h.bUM));
      paramViewGroup.vPL = ((ImageView)paramView.findViewById(R.h.bUR));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gDd.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, ((com.tencent.mm.modelfriend.h)localObject).Hg(), paramViewGroup.gDd.getTextSize()));
      paramViewGroup.vPK.setVisibility(8);
      paramViewGroup.vPL.setVisibility(0);
      switch (this.gCW[paramInt])
      {
      case 1: 
      default: 
        label208:
        localObject = b.hM(((com.tencent.mm.modelfriend.h)localObject).fjc);
        if (localObject == null) {
          paramViewGroup.hqg.setImageDrawable(a.b(this.context, R.k.aVS));
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(2577651466240L, 19205);
      return paramView;
      paramViewGroup = (b)paramView.getTag();
      break;
      paramViewGroup.vPJ.setVisibility(8);
      paramViewGroup.gDe.setVisibility(0);
      paramViewGroup.gDe.setText(R.l.dyh);
      paramViewGroup.gDe.setTextColor(this.context.getResources().getColor(R.e.aMG));
      break label208;
      if (((com.tencent.mm.modelfriend.h)localObject).status != 102)
      {
        at.AR();
        if (!c.yK().TA(((com.tencent.mm.modelfriend.h)localObject).getUsername()))
        {
          paramViewGroup.gDe.setVisibility(8);
          paramViewGroup.vPJ.setVisibility(0);
          break label208;
        }
      }
      if (((com.tencent.mm.modelfriend.h)localObject).status == 102)
      {
        paramViewGroup.gDe.setVisibility(8);
        paramViewGroup.vPJ.setVisibility(8);
        paramViewGroup.vPL.setVisibility(8);
        break label208;
      }
      paramViewGroup.gDe.setVisibility(0);
      paramViewGroup.gDe.setText(R.l.dye);
      paramViewGroup.gDe.setTextColor(this.context.getResources().getColor(R.e.aMF));
      paramViewGroup.vPJ.setVisibility(8);
      break label208;
      paramViewGroup.hqg.setImageBitmap((Bitmap)localObject);
    }
  }
  
  public static abstract interface a
  {
    public abstract void Bs(int paramInt);
  }
  
  static final class b
  {
    TextView gDd;
    TextView gDe;
    ImageView hqg;
    TextView vPJ;
    TextView vPK;
    ImageView vPL;
    
    b()
    {
      GMTrace.i(2744215666688L, 20446);
      GMTrace.o(2744215666688L, 20446);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
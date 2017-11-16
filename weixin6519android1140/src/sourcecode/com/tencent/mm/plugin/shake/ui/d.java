package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.o;
import java.util.GregorianCalendar;

final class d
  extends o<f>
{
  private LayoutInflater CJ;
  private Context mContext;
  int oPr;
  
  public d(Context paramContext)
  {
    super(paramContext, new f());
    GMTrace.i(6540698320896L, 48732);
    this.oPr = 20;
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    GMTrace.o(6540698320896L, 48732);
  }
  
  public final void QF()
  {
    GMTrace.i(6541100974080L, 48735);
    g localg = m.bfl();
    int i = this.oPr;
    String str = "SELECT * FROM " + localg.getTableName() + " ORDER BY rowid DESC LIMIT " + i;
    setCursor(localg.fTZ.rawQuery(str, null));
    super.notifyDataSetChanged();
    GMTrace.o(6541100974080L, 48735);
  }
  
  protected final void QG()
  {
    GMTrace.i(6540966756352L, 48734);
    QF();
    GMTrace.o(6540966756352L, 48734);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6541235191808L, 48736);
    Object localObject1;
    Object localObject2;
    label149:
    label170:
    long l1;
    if (paramView == null)
    {
      paramViewGroup = this.CJ.inflate(R.i.cGq, paramViewGroup, false);
      localObject1 = new a();
      ((a)localObject1).oPs = ((MMImageView)paramViewGroup.findViewById(R.h.cdw));
      ((a)localObject1).izE = ((TextView)paramViewGroup.findViewById(R.h.cdy));
      ((a)localObject1).jXT = ((TextView)paramViewGroup.findViewById(R.h.cdv));
      ((a)localObject1).mOF = ((TextView)paramViewGroup.findViewById(R.h.cdx));
      paramViewGroup.setTag(localObject1);
      localObject2 = (f)getItem(paramInt);
      e.a(((a)localObject1).oPs, ((f)localObject2).field_thumburl, R.k.cJr, false);
      if (!bg.nm(((f)localObject2).field_title)) {
        break label244;
      }
      ((a)localObject1).izE.setVisibility(8);
      if (!bg.nm(((f)localObject2).field_desc)) {
        break label284;
      }
      ((a)localObject1).jXT.setVisibility(8);
      localObject1 = ((a)localObject1).mOF;
      paramView = this.mContext;
      l1 = ((f)localObject2).field_createtime * 1000L;
      localObject2 = new GregorianCalendar();
      if (l1 >= 3600000L) {
        break label324;
      }
      paramView = "";
    }
    for (;;)
    {
      ((TextView)localObject1).setText(paramView);
      GMTrace.o(6541235191808L, 48736);
      return paramViewGroup;
      localObject1 = (a)paramView.getTag();
      paramViewGroup = paramView;
      break;
      label244:
      ((a)localObject1).izE.setText(h.b(this.mContext, ((f)localObject2).field_title, ((a)localObject1).izE.getTextSize()));
      ((a)localObject1).izE.setVisibility(0);
      break label149;
      label284:
      ((a)localObject1).jXT.setText(h.b(this.mContext, ((f)localObject2).field_desc, ((a)localObject1).jXT.getTextSize()));
      ((a)localObject1).jXT.setVisibility(0);
      break label170;
      label324:
      long l2 = ((GregorianCalendar)localObject2).getTimeInMillis();
      int i;
      if ((l2 - l1) / 3600000L == 0L)
      {
        i = (int)((l2 - l1) / 60000L);
        paramInt = i;
        if (i <= 0) {
          paramInt = 1;
        }
        paramView = paramView.getResources().getQuantityString(R.j.cIm, paramInt, new Object[] { Integer.valueOf(paramInt) });
      }
      else
      {
        localObject2 = new GregorianCalendar(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2), ((GregorianCalendar)localObject2).get(5));
        long l3 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
        if ((l3 > 0L) && (l3 <= 86400000L))
        {
          i = (int)((l2 - l1) / 3600000L);
          paramInt = i;
          if (i <= 0) {
            paramInt = 1;
          }
          paramView = paramView.getResources().getQuantityString(R.j.cIl, paramInt, new Object[] { Integer.valueOf(paramInt) });
        }
        else
        {
          l3 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L;
          if ((l3 > 0L) && (l3 <= 86400000L))
          {
            paramView = paramView.getString(R.l.dwU);
          }
          else
          {
            i = (int)((l2 - l1) / 86400000L);
            paramInt = i;
            if (i <= 0) {
              paramInt = 1;
            }
            paramView = paramView.getResources().getQuantityString(R.j.cIn, paramInt, new Object[] { Integer.valueOf(paramInt) });
          }
        }
      }
    }
  }
  
  public final void tS(int paramInt)
  {
    GMTrace.i(6540832538624L, 48733);
    aJe();
    this.oPr = paramInt;
    QF();
    GMTrace.o(6540832538624L, 48733);
  }
  
  final class a
  {
    TextView izE;
    TextView jXT;
    TextView mOF;
    MMImageView oPs;
    
    a()
    {
      GMTrace.i(6566333906944L, 48923);
      GMTrace.o(6566333906944L, 48923);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
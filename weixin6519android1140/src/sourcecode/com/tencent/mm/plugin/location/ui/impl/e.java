package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.os.Looper;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
  extends BaseAdapter
{
  String amf;
  byte[] buffer;
  private Context context;
  boolean jAg;
  String lgm;
  List<f> mDG;
  int mDH;
  boolean mDI;
  boolean mDt;
  
  public e(Context paramContext)
  {
    GMTrace.i(9688238260224L, 72183);
    this.mDG = new ArrayList();
    this.context = null;
    this.mDH = 0;
    this.buffer = null;
    this.jAg = false;
    this.amf = "";
    this.lgm = "";
    this.mDI = false;
    this.mDt = false;
    this.context = paramContext;
    GMTrace.o(9688238260224L, 72183);
  }
  
  private Spannable Bx(String paramString)
  {
    GMTrace.i(18047855230976L, 134467);
    paramString = com.tencent.mm.az.e.a(paramString, this.lgm);
    GMTrace.o(18047855230976L, 134467);
    return paramString;
  }
  
  public final void Bw(String paramString)
  {
    GMTrace.i(9688506695680L, 72185);
    this.amf = paramString;
    w.i("MicroMsg.PoiAdapter", "initdata key %s", new Object[] { paramString });
    GMTrace.o(9688506695680L, 72185);
  }
  
  public final void a(List<f> paramList, byte[] paramArrayOfByte, boolean paramBoolean, String paramString)
  {
    GMTrace.i(9688775131136L, 72187);
    if ((this.amf == null) || (!this.amf.equals(paramString)))
    {
      w.i("MicroMsg.PoiAdapter", "old key come pass it %s %s", new Object[] { this.amf, paramString });
      GMTrace.o(9688775131136L, 72187);
      return;
    }
    int i = this.mDG.size();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      paramString = (f)paramList.next();
      paramString.mEa = i;
      i += 1;
      this.mDG.add(paramString);
    }
    this.buffer = paramArrayOfByte;
    this.jAg = paramBoolean;
    notifyDataSetChanged();
    GMTrace.o(9688775131136L, 72187);
  }
  
  public final void b(f paramf)
  {
    GMTrace.i(9688640913408L, 72186);
    if (this.mDG.size() >= 0)
    {
      this.mDG.add(0, paramf);
      notifyDataSetChanged();
    }
    GMTrace.o(9688640913408L, 72186);
  }
  
  public final void clean()
  {
    GMTrace.i(9688372477952L, 72184);
    this.buffer = null;
    this.jAg = false;
    this.amf = "";
    this.mDG.clear();
    GMTrace.o(9688372477952L, 72184);
  }
  
  public final int getCount()
  {
    GMTrace.i(9688909348864L, 72188);
    int i = this.mDG.size();
    GMTrace.o(9688909348864L, 72188);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(9689177784320L, 72190);
    GMTrace.o(9689177784320L, 72190);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(9689312002048L, 72191);
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(R.i.cDs, null);
      paramViewGroup = new a();
      paramViewGroup.titleView = ((TextView)paramView.findViewById(R.h.title));
      paramViewGroup.mDJ = ((TextView)paramView.findViewById(R.h.subtitle));
      paramViewGroup.mDK = ((ImageView)paramView.findViewById(R.h.chz));
      paramViewGroup.mDM = paramView.findViewById(R.h.bya);
      paramViewGroup.mDL = paramView.findViewById(R.h.bHs);
      paramViewGroup.iDy = ((TextView)paramView.findViewById(R.h.chv));
      paramView.setTag(paramViewGroup);
      if ((((f)this.mDG.get(paramInt)).type != 1) && (((f)this.mDG.get(paramInt)).type != 2)) {
        break label327;
      }
      paramViewGroup.mDM.setVisibility(0);
      paramViewGroup.mDL.setVisibility(8);
      paramViewGroup.iDy.setText(bg.aq(((f)this.mDG.get(paramInt)).mDN, ""));
      label208:
      if ((paramInt != 0) || (this.mDI)) {
        break label493;
      }
      if (!this.mDt) {
        break label347;
      }
      paramViewGroup.titleView.setText(bg.aq(((f)this.mDG.get(0)).mName, ""));
      paramViewGroup.mDJ.setVisibility(0);
      paramViewGroup.mDJ.setText(bg.aq(((f)this.mDG.get(0)).mDN, ""));
    }
    label306:
    label327:
    label347:
    label493:
    Object localObject2;
    Object localObject1;
    for (;;)
    {
      if (paramInt == this.mDH)
      {
        paramViewGroup.mDK.setVisibility(0);
        GMTrace.o(9689312002048L, 72191);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        paramViewGroup.mDM.setVisibility(8);
        paramViewGroup.mDL.setVisibility(0);
        break label208;
        paramViewGroup.mDJ.setVisibility(8);
        if (!bg.nm(((f)this.mDG.get(0)).mDN))
        {
          paramViewGroup.titleView.setText(bg.aq(((f)this.mDG.get(paramInt)).mDN, ""));
        }
        else if (bg.nm(((f)this.mDG.get(0)).mDW))
        {
          paramViewGroup.titleView.setText(bg.aq(((f)this.mDG.get(paramInt)).mName, ""));
        }
        else
        {
          paramViewGroup.titleView.setText(bg.aq(((f)this.mDG.get(paramInt)).mDW, ""));
          continue;
          localObject2 = (f)this.mDG.get(paramInt);
          localObject1 = bg.aq(((f)localObject2).mName, "");
          localObject2 = bg.aq(((f)localObject2).mDN, "");
          if ((!this.mDI) || (bg.nm(this.lgm))) {
            break label605;
          }
          localObject1 = Bx((String)localObject1);
          localObject2 = Bx((String)localObject2);
        }
      }
    }
    label605:
    for (;;)
    {
      paramViewGroup.titleView.setText((CharSequence)localObject1);
      paramViewGroup.mDJ.setText((CharSequence)localObject2);
      paramViewGroup.mDJ.setVisibility(0);
      break;
      paramViewGroup.mDK.setVisibility(4);
      break label306;
    }
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(9689446219776L, 72192);
    super.notifyDataSetChanged();
    Thread.currentThread().getId();
    Looper.getMainLooper().getThread().getId();
    w.i("MicroMsg.PoiAdapter", "map notifyDataChange " + bg.bQW().toString() + " threadId : " + Thread.currentThread().getId());
    GMTrace.o(9689446219776L, 72192);
  }
  
  public final f pO(int paramInt)
  {
    GMTrace.i(9689043566592L, 72189);
    f localf = (f)this.mDG.get(paramInt);
    GMTrace.o(9689043566592L, 72189);
    return localf;
  }
  
  static final class a
  {
    TextView iDy;
    TextView mDJ;
    ImageView mDK;
    View mDL;
    View mDM;
    TextView titleView;
    
    public a()
    {
      GMTrace.i(9691191050240L, 72205);
      GMTrace.o(9691191050240L, 72205);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
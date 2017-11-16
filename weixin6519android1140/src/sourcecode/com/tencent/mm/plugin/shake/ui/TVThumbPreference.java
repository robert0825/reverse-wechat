package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class TVThumbPreference
  extends Preference
  implements j.a
{
  public f iAA;
  public ImageView oRn;
  public ImageView oRo;
  public ImageView oRp;
  List<String> oRq;
  
  public TVThumbPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(6590358880256L, 49102);
    GMTrace.o(6590358880256L, 49102);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6590224662528L, 49101);
    GMTrace.o(6590224662528L, 49101);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6590090444800L, 49100);
    this.oRq = null;
    setLayoutResource(R.i.cHh);
    setWidgetLayoutResource(0);
    j.a(this);
    GMTrace.o(6590090444800L, 49100);
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6590761533440L, 49105);
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.oRn != null) && (this.oRn.getTag() != null) && (paramString.equals((String)this.oRn.getTag())))
    {
      this.oRn.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6541772062720L, 48740);
          TVThumbPreference.this.oRn.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.iAA != null) {
            TVThumbPreference.this.iAA.notifyDataSetChanged();
          }
          GMTrace.o(6541772062720L, 48740);
        }
      });
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.oRo != null) && (this.oRo.getTag() != null) && (paramString.equals((String)this.oRo.getTag())))
    {
      this.oRo.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6581634727936L, 49037);
          TVThumbPreference.this.oRo.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.iAA != null) {
            TVThumbPreference.this.iAA.notifyDataSetChanged();
          }
          GMTrace.o(6581634727936L, 49037);
        }
      });
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.oRp != null) && (this.oRp.getTag() != null) && (paramString.equals((String)this.oRp.getTag()))) {
      this.oRp.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6582171598848L, 49041);
          TVThumbPreference.this.oRp.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.iAA != null) {
            TVThumbPreference.this.iAA.notifyDataSetChanged();
          }
          GMTrace.o(6582171598848L, 49041);
        }
      });
    }
    GMTrace.o(6590761533440L, 49105);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6590627315712L, 49104);
    super.onBindView(paramView);
    this.oRn = ((ImageView)paramView.findViewById(R.h.chb));
    this.oRo = ((ImageView)paramView.findViewById(R.h.chc));
    this.oRp = ((ImageView)paramView.findViewById(R.h.chd));
    if (this.oRq != null)
    {
      if (this.oRq.size() <= 0)
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.oRq.get(0));
      this.oRn.setTag(paramView.Po());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.oRn.setImageBitmap(paramView);
      }
      this.oRn.setVisibility(0);
      if (1 >= this.oRq.size())
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.oRq.get(1));
      this.oRo.setTag(paramView.Po());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.oRo.setImageBitmap(paramView);
      }
      this.oRo.setVisibility(0);
      if (2 >= this.oRq.size())
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.oRq.get(2));
      this.oRp.setTag(paramView.Po());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.oRp.setImageBitmap(paramView);
      }
      this.oRp.setVisibility(0);
    }
    GMTrace.o(6590627315712L, 49104);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6590493097984L, 49103);
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(6590493097984L, 49103);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\TVThumbPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
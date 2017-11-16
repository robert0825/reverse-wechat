package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.MMSingelLinePanel;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class ContactLabelPreference
  extends Preference
{
  private TextView hqi;
  private MMSingelLinePanel nLI;
  private ArrayList<String> nLJ;
  private String title;
  
  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(6727932051456L, 50127);
    GMTrace.o(6727932051456L, 50127);
  }
  
  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6728066269184L, 50128);
    this.nLJ = new ArrayList();
    setLayoutResource(R.i.cBA);
    GMTrace.o(6728066269184L, 50128);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6728334704640L, 50130);
    this.hqi = ((TextView)paramView.findViewById(R.h.title));
    this.nLI = ((MMSingelLinePanel)paramView.findViewById(R.h.brq));
    this.nLI.cag();
    this.nLI.weZ = false;
    this.nLI.lJ(false);
    if (this.hqi != null) {
      this.hqi.setText(this.title);
    }
    if ((this.nLI != null) && (this.nLJ != null) && (this.nLJ.size() > 0)) {
      this.nLI.a(this.nLJ, this.nLJ);
    }
    super.onBindView(paramView);
    GMTrace.o(6728334704640L, 50130);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6728200486912L, 50129);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cBJ, localViewGroup);
    GMTrace.o(6728200486912L, 50129);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\ContactLabelPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
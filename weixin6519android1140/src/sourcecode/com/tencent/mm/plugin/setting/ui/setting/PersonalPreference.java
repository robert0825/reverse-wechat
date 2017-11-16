package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.Preference;

public class PersonalPreference
  extends Preference
{
  private String eQt;
  private String fsF;
  Bitmap gsp;
  private TextView jtr;
  ImageView ljR;
  private TextView oGJ;
  int oGK;
  String oGL;
  private View.OnClickListener oGM;
  private String username;
  
  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4666079313920L, 34765);
    this.jtr = null;
    this.oGJ = null;
    this.ljR = null;
    this.gsp = null;
    this.oGK = -1;
    this.oGL = null;
    GMTrace.o(4666079313920L, 34765);
  }
  
  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4666213531648L, 34766);
    this.jtr = null;
    this.oGJ = null;
    this.ljR = null;
    this.gsp = null;
    this.oGK = -1;
    this.oGL = null;
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(R.i.cCj);
    GMTrace.o(4666213531648L, 34766);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(4666481967104L, 34768);
    if (this.ljR == null) {
      this.ljR = ((ImageView)paramView.findViewById(R.h.bGN));
    }
    if (this.gsp != null)
    {
      this.ljR.setImageBitmap(this.gsp);
      this.ljR.setOnClickListener(this.oGM);
      if ((this.jtr != null) && (this.eQt != null)) {
        this.jtr.setText(h.b(this.mContext, this.eQt, this.jtr.getTextSize()));
      }
      if (this.oGJ != null) {
        if (!bg.nm(this.fsF)) {
          break label238;
        }
      }
    }
    label238:
    for (String str = this.username;; str = this.fsF)
    {
      if ((bg.nm(this.fsF)) && (x.Ts(this.username))) {
        this.oGJ.setVisibility(8);
      }
      this.oGJ.setText(this.mContext.getString(R.l.cTa) + str);
      super.onBindView(paramView);
      GMTrace.o(4666481967104L, 34768);
      return;
      if (this.oGK > 0)
      {
        this.ljR.setImageResource(this.oGK);
        break;
      }
      if (this.oGL == null) {
        break;
      }
      a.b.a(this.ljR, this.oGL);
      break;
    }
  }
  
  public final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(4666347749376L, 34767);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBO, localViewGroup);
    GMTrace.o(4666347749376L, 34767);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\PersonalPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class RoomGrantPreference
  extends Preference
{
  TextView jPE;
  String jPF;
  
  public RoomGrantPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9160091500544L, 68248);
    this.jPE = null;
    this.jPF = "";
    GMTrace.o(9160091500544L, 68248);
  }
  
  public RoomGrantPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9160225718272L, 68249);
    this.jPE = null;
    this.jPF = "";
    setLayoutResource(R.i.cBA);
    setWidgetLayoutResource(R.i.cCj);
    GMTrace.o(9160225718272L, 68249);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(9160494153728L, 68251);
    if (this.jPE == null) {
      this.jPE = ((TextView)paramView.findViewById(R.h.brW));
    }
    this.jPE.setText(this.jPF);
    super.onBindView(paramView);
    GMTrace.o(9160494153728L, 68251);
  }
  
  public final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(9160359936000L, 68250);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBT, localViewGroup);
    GMTrace.o(9160359936000L, 68250);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomGrantPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
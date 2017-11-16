package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.InputPreference.a;
import com.tencent.mm.ui.base.preference.Preference;

public class AddFriendSearchPreference
  extends Preference
{
  private Context context;
  private String qtW;
  String qtX;
  private View.OnClickListener qtY;
  public View.OnClickListener qtZ;
  public InputPreference.a qub;
  public TextView quc;
  private TextView qud;
  private View.OnClickListener que;
  
  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5776462577664L, 43038);
    GMTrace.o(5776462577664L, 43038);
  }
  
  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5776596795392L, 43039);
    this.qtW = "";
    this.qtX = "";
    this.qtY = null;
    this.qtZ = null;
    this.qub = null;
    this.quc = null;
    this.qud = null;
    this.que = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5782636593152L, 43084);
        if ((AddFriendSearchPreference.this.qub != null) && (AddFriendSearchPreference.this.quc != null) && (AddFriendSearchPreference.this.quc.getText() != null)) {
          AddFriendSearchPreference.this.quc.getText().toString();
        }
        GMTrace.o(5782636593152L, 43084);
      }
    };
    this.context = paramContext;
    setLayoutResource(R.i.cBA);
    GMTrace.o(5776596795392L, 43039);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5776865230848L, 43041);
    super.onBindView(paramView);
    paramView.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5779012714496L, 43057);
        GMTrace.o(5779012714496L, 43057);
        return true;
      }
    });
    this.quc = ((TextView)paramView.findViewById(R.h.bvB));
    this.qud = ((TextView)paramView.findViewById(R.h.ccn));
    this.qud.setText(this.qtX);
    if (this.qtZ != null) {
      this.qud.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(5781025980416L, 43072);
          if (paramAnonymousMotionEvent.getAction() == 1) {
            AddFriendSearchPreference.this.qtZ.onClick(paramAnonymousView);
          }
          GMTrace.o(5781025980416L, 43072);
          return true;
        }
      });
    }
    if (this.qub != null)
    {
      paramView = (Button)paramView.findViewById(R.h.button);
      paramView.setOnClickListener(this.que);
      paramView.setVisibility(0);
    }
    GMTrace.o(5776865230848L, 43041);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(5776731013120L, 43040);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.cBD, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), 0, localViewGroup.getPaddingBottom());
    GMTrace.o(5776731013120L, 43040);
    return paramViewGroup;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\AddFriendSearchPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.v.a.g;

public class InputPreference
  extends Preference
{
  private String qtX;
  public a qub;
  private View.OnClickListener que;
  private String wki;
  public EditText wkj;
  private Button wkk;
  private TextView.OnEditorActionListener wkl;
  
  public InputPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3234647244800L, 24100);
    GMTrace.o(3234647244800L, 24100);
  }
  
  public InputPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3234781462528L, 24101);
    this.que = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3217467375616L, 23972);
        if ((InputPreference.this.qub != null) && (InputPreference.this.wkj != null) && (InputPreference.this.wkj.getText() != null)) {
          InputPreference.this.wkj.getText().toString();
        }
        GMTrace.o(3217467375616L, 23972);
      }
    };
    this.wkl = new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(3209816965120L, 23915);
        if ((3 == paramAnonymousInt) && (InputPreference.this.qub != null) && (InputPreference.this.wkj != null))
        {
          if (InputPreference.this.wkj.getText() != null) {
            InputPreference.this.wkj.getText().toString();
          }
          GMTrace.o(3209816965120L, 23915);
          return true;
        }
        GMTrace.o(3209816965120L, 23915);
        return false;
      }
    };
    GMTrace.o(3234781462528L, 24101);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3234915680256L, 24102);
    super.onBindView(paramView);
    this.wkj = ((EditText)paramView.findViewById(a.g.bvB));
    this.wkj.setHint(this.qtX);
    this.wkj.setOnEditorActionListener(this.wkl);
    this.wkk = ((Button)paramView.findViewById(a.g.button));
    this.wkk.setText(this.wki);
    this.wkk.setOnClickListener(this.que);
    GMTrace.o(3234915680256L, 24102);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\preference\InputPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.sdk.platformtools.w;

public class MMKeyBoardView
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private ColorStateList dr;
  private Context mContext;
  private float mej;
  private Button nQA;
  private Button nQB;
  private Button nQC;
  private Button nQD;
  private Button nQE;
  private Button nQF;
  private ImageButton nQG;
  private View nQH;
  private View nQI;
  private View nQJ;
  private View nQK;
  private View nQL;
  private View nQM;
  private boolean nQN;
  private int nQO;
  private int nQP;
  private int nQQ;
  private int nQR;
  private int nQS;
  private int nQT;
  private int nQU;
  private int nQV;
  private int nQW;
  public a nQe;
  private Button nQw;
  private Button nQx;
  private Button nQy;
  private Button nQz;
  
  public MMKeyBoardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(10693663260672L, 79674);
    GMTrace.o(10693663260672L, 79674);
  }
  
  public MMKeyBoardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10693797478400L, 79675);
    this.nQN = true;
    this.mContext = paramContext;
    this.nQO = getResources().getDimensionPixelSize(R.f.aSv);
    this.nQP = getResources().getDimensionPixelSize(R.f.aSw);
    this.mej = getResources().getDimensionPixelSize(R.f.aSx);
    this.dr = getResources().getColorStateList(R.e.aOh);
    this.nQQ = getResources().getColor(R.e.aOg);
    this.nQw = new Button(this.mContext);
    this.nQx = new Button(this.mContext);
    this.nQy = new Button(this.mContext);
    this.nQz = new Button(this.mContext);
    this.nQA = new Button(this.mContext);
    this.nQB = new Button(this.mContext);
    this.nQC = new Button(this.mContext);
    this.nQD = new Button(this.mContext);
    this.nQE = new Button(this.mContext);
    this.nQF = new Button(this.mContext);
    this.nQG = new ImageButton(this.mContext);
    this.nQH = new View(this.mContext);
    this.nQH = new View(this.mContext);
    this.nQI = new View(this.mContext);
    this.nQJ = new View(this.mContext);
    this.nQK = new View(this.mContext);
    this.nQL = new View(this.mContext);
    this.nQM = new View(this.mContext);
    this.nQw.setBackgroundResource(R.g.aXz);
    this.nQx.setBackgroundResource(R.g.aXz);
    this.nQy.setBackgroundResource(R.g.aXz);
    this.nQz.setBackgroundResource(R.g.aXz);
    this.nQA.setBackgroundResource(R.g.aXz);
    this.nQB.setBackgroundResource(R.g.aXz);
    this.nQC.setBackgroundResource(R.g.aXz);
    this.nQD.setBackgroundResource(R.g.aXz);
    this.nQE.setBackgroundResource(R.g.aXz);
    this.nQB.setBackgroundResource(R.g.aXz);
    this.nQF.setBackgroundResource(R.g.aXz);
    this.nQG.setBackgroundResource(R.g.aXz);
    this.nQG.setImageResource(R.g.aXA);
    this.nQw.setText("0");
    this.nQx.setText("1");
    this.nQy.setText("2");
    this.nQz.setText("3");
    this.nQA.setText("4");
    this.nQB.setText("5");
    this.nQC.setText("6");
    this.nQD.setText("7");
    this.nQE.setText("8");
    this.nQF.setText("9");
    this.nQw.setGravity(17);
    this.nQx.setGravity(17);
    this.nQy.setGravity(17);
    this.nQz.setGravity(17);
    this.nQA.setGravity(17);
    this.nQB.setGravity(17);
    this.nQC.setGravity(17);
    this.nQD.setGravity(17);
    this.nQE.setGravity(17);
    this.nQF.setGravity(17);
    this.nQw.setTextSize(0, this.mej);
    this.nQx.setTextSize(0, this.mej);
    this.nQy.setTextSize(0, this.mej);
    this.nQz.setTextSize(0, this.mej);
    this.nQA.setTextSize(0, this.mej);
    this.nQB.setTextSize(0, this.mej);
    this.nQC.setTextSize(0, this.mej);
    this.nQD.setTextSize(0, this.mej);
    this.nQE.setTextSize(0, this.mej);
    this.nQF.setTextSize(0, this.mej);
    this.nQw.setTextColor(this.dr);
    this.nQx.setTextColor(this.dr);
    this.nQy.setTextColor(this.dr);
    this.nQz.setTextColor(this.dr);
    this.nQA.setTextColor(this.dr);
    this.nQB.setTextColor(this.dr);
    this.nQC.setTextColor(this.dr);
    this.nQD.setTextColor(this.dr);
    this.nQE.setTextColor(this.dr);
    this.nQF.setTextColor(this.dr);
    this.nQw.setOnClickListener(this);
    this.nQx.setOnClickListener(this);
    this.nQy.setOnClickListener(this);
    this.nQz.setOnClickListener(this);
    this.nQA.setOnClickListener(this);
    this.nQB.setOnClickListener(this);
    this.nQC.setOnClickListener(this);
    this.nQD.setOnClickListener(this);
    this.nQE.setOnClickListener(this);
    this.nQF.setOnClickListener(this);
    this.nQG.setOnClickListener(this);
    this.nQG.setOnLongClickListener(this);
    this.nQH.setBackgroundColor(this.nQQ);
    this.nQH.setBackgroundColor(this.nQQ);
    this.nQI.setBackgroundColor(this.nQQ);
    this.nQJ.setBackgroundColor(this.nQQ);
    this.nQK.setBackgroundColor(this.nQQ);
    this.nQL.setBackgroundColor(this.nQQ);
    this.nQM.setBackgroundColor(this.nQQ);
    addView(this.nQw);
    addView(this.nQx);
    addView(this.nQy);
    addView(this.nQz);
    addView(this.nQA);
    addView(this.nQB);
    addView(this.nQC);
    addView(this.nQD);
    addView(this.nQE);
    addView(this.nQF);
    addView(this.nQG);
    addView(this.nQH);
    addView(this.nQI);
    addView(this.nQJ);
    addView(this.nQK);
    addView(this.nQL);
    addView(this.nQM);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10693126389760L, 79670);
        MMKeyBoardView.this.requestLayout();
        GMTrace.o(10693126389760L, 79670);
      }
    });
    GMTrace.o(10693797478400L, 79675);
  }
  
  private void input(String paramString)
  {
    GMTrace.i(10694737002496L, 79682);
    if ((this.nQe != null) && (this.nQN)) {
      this.nQe.input(paramString);
    }
    GMTrace.o(10694737002496L, 79682);
  }
  
  public final void gF(boolean paramBoolean)
  {
    GMTrace.i(10694602784768L, 79681);
    this.nQN = paramBoolean;
    this.nQw.setEnabled(paramBoolean);
    this.nQx.setEnabled(paramBoolean);
    this.nQy.setEnabled(paramBoolean);
    this.nQz.setEnabled(paramBoolean);
    this.nQA.setEnabled(paramBoolean);
    this.nQB.setEnabled(paramBoolean);
    this.nQC.setEnabled(paramBoolean);
    this.nQD.setEnabled(paramBoolean);
    this.nQE.setEnabled(paramBoolean);
    this.nQF.setEnabled(paramBoolean);
    this.nQG.setEnabled(paramBoolean);
    GMTrace.o(10694602784768L, 79681);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(10694334349312L, 79679);
    if (!this.nQN)
    {
      w.d("MicroMsg.Facing.MMKeyBoardView", "onClick KeyBoard is disable.");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQw)
    {
      input("0");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQx)
    {
      input("1");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQy)
    {
      input("2");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQz)
    {
      input("3");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQA)
    {
      input("4");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQB)
    {
      input("5");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQC)
    {
      input("6");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQD)
    {
      input("7");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQE)
    {
      input("8");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if (paramView == this.nQF)
    {
      input("9");
      GMTrace.o(10694334349312L, 79679);
      return;
    }
    if ((paramView == this.nQG) && (this.nQe != null) && (this.nQN)) {
      this.nQe.delete();
    }
    GMTrace.o(10694334349312L, 79679);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(10693931696128L, 79676);
    GMTrace.o(10693931696128L, 79676);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10694065913856L, 79677);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.nQR = getWidth();
    this.nQS = getHeight();
    paramInt1 = -this.nQP;
    paramInt2 = this.nQV - this.nQP + 1;
    paramInt3 = this.nQV * 2 - this.nQP + 2;
    paramInt4 = this.nQW + 2;
    int i = this.nQW * 2 + 3;
    int j = this.nQW * 3 + 4;
    this.nQx.layout(paramInt1, 1, this.nQT + paramInt1, this.nQU + 1);
    this.nQy.layout(paramInt2, 1, this.nQT + paramInt2, this.nQU + 1);
    this.nQz.layout(paramInt3, 1, this.nQT + paramInt3, this.nQU + 1);
    this.nQA.layout(paramInt1, paramInt4, this.nQT + paramInt1, this.nQU + paramInt4);
    this.nQB.layout(paramInt2, paramInt4, this.nQT + paramInt2, this.nQU + paramInt4);
    this.nQC.layout(paramInt3, paramInt4, this.nQT + paramInt3, this.nQU + paramInt4);
    this.nQD.layout(paramInt1, i, this.nQT + paramInt1, this.nQU + i);
    this.nQE.layout(paramInt2, i, this.nQT + paramInt2, this.nQU + i);
    this.nQF.layout(paramInt3, i, this.nQT + paramInt3, this.nQU + i);
    this.nQw.layout(paramInt2, j, this.nQT + paramInt2, this.nQU + j);
    this.nQG.layout(paramInt3, j, this.nQT + paramInt3, this.nQU + j);
    this.nQH.layout(0, this.nQO + 1, this.nQR, this.nQO + 1 + 1);
    this.nQI.layout(0, this.nQO + paramInt4, this.nQR, paramInt4 + this.nQO + 1);
    this.nQJ.layout(0, this.nQO + i, this.nQR, i + this.nQO + 1);
    this.nQK.layout(0, this.nQO + j, this.nQR, this.nQO + j + 1);
    this.nQL.layout(this.nQV + 1, this.nQO, this.nQV + 2, this.nQS);
    this.nQM.layout(this.nQV * 2 + 2, this.nQO, this.nQV * 2 + 3, this.nQS);
    GMTrace.o(10694065913856L, 79677);
  }
  
  public boolean onLongClick(View paramView)
  {
    GMTrace.i(10694468567040L, 79680);
    if ((paramView == this.nQG) && (this.nQe != null) && (this.nQN)) {
      this.nQe.MH();
    }
    GMTrace.o(10694468567040L, 79680);
    return false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10694200131584L, 79678);
    super.onMeasure(paramInt1, paramInt2);
    this.nQR = getWidth();
    this.nQS = getHeight();
    if ((this.nQR != 0) && (this.nQS != 0))
    {
      this.nQV = ((this.nQR - 2) / 3);
      this.nQW = ((this.nQS - this.nQO - 4) / 4);
      this.nQT = (this.nQV + this.nQP * 2);
      this.nQU = (this.nQW + this.nQO * 2);
    }
    this.nQx.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQy.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQz.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQA.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQB.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQC.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQD.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQE.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQF.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQw.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQG.measure(View.MeasureSpec.makeMeasureSpec(this.nQT, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQU, 1073741824));
    this.nQH.measure(View.MeasureSpec.makeMeasureSpec(this.nQR, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.nQI.measure(View.MeasureSpec.makeMeasureSpec(this.nQR, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.nQJ.measure(View.MeasureSpec.makeMeasureSpec(this.nQR, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.nQK.measure(View.MeasureSpec.makeMeasureSpec(this.nQR, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
    this.nQL.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQS, 1073741824));
    this.nQM.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.nQS, 1073741824));
    GMTrace.o(10694200131584L, 79678);
  }
  
  public static abstract interface a
  {
    public abstract void MH();
    
    public abstract void delete();
    
    public abstract void input(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\ui\widget\MMKeyBoardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
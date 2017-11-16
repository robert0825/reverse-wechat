package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.a.b;
import android.support.v4.view.z;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.pluginsdk.ui.a.a;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class AddressView
  extends View
  implements a.a, d.a
{
  private static final String TAG = "MicroMsg.AddressView";
  public final int AVATAR_LAYOUT_WIDTH;
  public final int AVATAR_PADDING;
  public final int AVATAR_START_POS;
  public final int AVATAR_WIDTH;
  public final int COMMON_PADDING;
  public final int DESCRIPTION_PADDING;
  public final float DESCRIPTION_TEXT_SIZE;
  public final float NAME_TEXT_SIZE;
  public final int TEXT_TOP_PADDING;
  public final int WEIBO_ICON_SIZE;
  Drawable avatarDrawable;
  Context context;
  float density;
  String description;
  private Paint.FontMetrics descriptionFontMetrics;
  private TextPaint descriptionPaint;
  CharSequence destNickName;
  private TextPaint displayNamePaint;
  Drawable drawable;
  private Paint.FontMetrics fm;
  boolean imageViewHasSetBounds;
  StaticLayout layout;
  boolean nameIsSpanned;
  boolean needInvaildate;
  boolean needInvaliate;
  BitmapDrawable needMask;
  boolean needUpdatePostion;
  CharSequence nickName;
  private int nickNameCurrentTextColor;
  int nickNameHeight;
  private ColorStateList nickNameTextColor;
  int nickNameWidth;
  StaticLayout nickNamelayout;
  int nickWidth;
  float textBaseY;
  
  public AddressView(Context paramContext)
  {
    this(paramContext, null, 0);
    GMTrace.i(2918564495360L, 21745);
    GMTrace.o(2918564495360L, 21745);
  }
  
  public AddressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(2918698713088L, 21746);
    GMTrace.o(2918698713088L, 21746);
  }
  
  public AddressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2918832930816L, 21747);
    this.drawable = getResources().getDrawable(R.g.bat);
    this.needUpdatePostion = true;
    this.AVATAR_LAYOUT_WIDTH = getResources().getDimensionPixelSize(R.f.aPG);
    this.AVATAR_WIDTH = getResources().getDimensionPixelSize(R.f.aPG);
    this.NAME_TEXT_SIZE = com.tencent.mm.br.a.V(paramContext, R.f.aQF);
    this.DESCRIPTION_TEXT_SIZE = com.tencent.mm.br.a.V(paramContext, R.f.aQR);
    this.WEIBO_ICON_SIZE = getResources().getDimensionPixelSize(R.f.aQL);
    this.AVATAR_START_POS = 0;
    this.AVATAR_PADDING = getResources().getDimensionPixelSize(R.f.aPy);
    this.COMMON_PADDING = 0;
    this.DESCRIPTION_PADDING = (getResources().getDimensionPixelSize(R.f.aQs) * 2);
    this.TEXT_TOP_PADDING = getResources().getDimensionPixelSize(R.f.aQQ);
    if (this.displayNamePaint == null) {
      this.displayNamePaint = generateOnePaint();
    }
    GMTrace.o(2918832930816L, 21747);
  }
  
  public static int dip2px(Context paramContext, float paramFloat)
  {
    GMTrace.i(2921785720832L, 21769);
    int i = (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
    GMTrace.o(2921785720832L, 21769);
    return i;
  }
  
  private TextPaint generateDescriptionPaint()
  {
    GMTrace.i(2922322591744L, 21773);
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setAntiAlias(true);
    localTextPaint.setTextSize(this.DESCRIPTION_TEXT_SIZE);
    localTextPaint.setColor(getResources().getColor(R.e.aOa));
    GMTrace.o(2922322591744L, 21773);
    return localTextPaint;
  }
  
  private TextPaint generateOnePaint()
  {
    GMTrace.i(2922188374016L, 21772);
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setAntiAlias(true);
    localTextPaint.setTextSize(this.NAME_TEXT_SIZE);
    localTextPaint.setColor(getResources().getColor(R.e.aOE));
    GMTrace.o(2922188374016L, 21772);
    return localTextPaint;
  }
  
  private void installAccessibilityDelegate()
  {
    GMTrace.i(2922725244928L, 21776);
    z.a(this, new android.support.v4.view.a()
    {
      public final void a(View paramAnonymousView, b paramAnonymousb)
      {
        GMTrace.i(3088484139008L, 23011);
        super.a(paramAnonymousView, paramAnonymousb);
        CharSequence localCharSequence = AddressView.this.getContentDescription();
        paramAnonymousView = localCharSequence;
        if (bg.nm((String)localCharSequence)) {
          paramAnonymousView = AddressView.this.nickName;
        }
        paramAnonymousb.setText(paramAnonymousView);
        GMTrace.o(3088484139008L, 23011);
      }
      
      public final void onPopulateAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        GMTrace.i(3088349921280L, 23010);
        super.onPopulateAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        CharSequence localCharSequence = AddressView.this.getContentDescription();
        paramAnonymousView = localCharSequence;
        if (bg.nm((String)localCharSequence)) {
          paramAnonymousView = AddressView.this.nickName;
        }
        paramAnonymousAccessibilityEvent.getText().add(paramAnonymousView);
        GMTrace.o(3088349921280L, 23010);
      }
    });
    GMTrace.o(2922725244928L, 21776);
  }
  
  private void updateDrawableBounds()
  {
    GMTrace.i(2920175108096L, 21757);
    this.avatarDrawable.setBounds(this.AVATAR_START_POS, (getHeight() - this.AVATAR_WIDTH) / 2, this.AVATAR_START_POS + this.AVATAR_WIDTH, (getHeight() - this.AVATAR_WIDTH) / 2 + this.AVATAR_WIDTH);
    this.needMask.setBounds(this.AVATAR_START_POS + this.AVATAR_WIDTH - this.needMask.getIntrinsicWidth() / 2, (getHeight() - this.AVATAR_WIDTH) / 2 + this.AVATAR_WIDTH - this.needMask.getIntrinsicHeight() / 2 - this.COMMON_PADDING * 2, this.AVATAR_START_POS + this.AVATAR_WIDTH + this.needMask.getIntrinsicWidth() / 2, (getHeight() - this.AVATAR_WIDTH) / 2 + this.AVATAR_WIDTH - this.needMask.getIntrinsicHeight() / 2 - this.COMMON_PADDING * 2 + this.needMask.getIntrinsicHeight());
    GMTrace.o(2920175108096L, 21757);
  }
  
  public void doInvalidate()
  {
    GMTrace.i(2922456809472L, 21774);
    invalidate();
    GMTrace.o(2922456809472L, 21774);
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(2921919938560L, 21770);
    updateTextColors();
    super.drawableStateChanged();
    GMTrace.o(2921919938560L, 21770);
  }
  
  public int fromDPToPix(Context paramContext, int paramInt)
  {
    GMTrace.i(2920577761280L, 21760);
    paramInt = Math.round(getDensity(paramContext) * paramInt);
    GMTrace.o(2920577761280L, 21760);
    return paramInt;
  }
  
  public float getDensity(Context paramContext)
  {
    GMTrace.i(2920711979008L, 21761);
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = getContext();
    }
    if (this.density < 0.0F) {
      this.density = localContext.getResources().getDisplayMetrics().density;
    }
    float f = this.density;
    GMTrace.o(2920711979008L, 21761);
    return f;
  }
  
  public float getDesiredWidth(CharSequence paramCharSequence, TextPaint paramTextPaint)
  {
    GMTrace.i(2919772454912L, 21754);
    if ((paramCharSequence instanceof Spanned))
    {
      f = Layout.getDesiredWidth(paramCharSequence, paramTextPaint);
      GMTrace.o(2919772454912L, 21754);
      return f;
    }
    Object localObject = paramCharSequence;
    if (paramCharSequence == null)
    {
      w.w("MicroMsg.AddressView", "source is null, set it empty.");
      localObject = "";
    }
    float f = paramTextPaint.measureText((CharSequence)localObject, 0, ((CharSequence)localObject).length());
    GMTrace.o(2919772454912L, 21754);
    return f;
  }
  
  public Drawable getDrawable()
  {
    GMTrace.i(2921114632192L, 21764);
    Drawable localDrawable = this.avatarDrawable;
    GMTrace.o(2921114632192L, 21764);
    return localDrawable;
  }
  
  public CharSequence getNickName()
  {
    GMTrace.i(2919638237184L, 21753);
    CharSequence localCharSequence = this.nickName;
    GMTrace.o(2919638237184L, 21753);
    return localCharSequence;
  }
  
  public float getNickNameSize()
  {
    GMTrace.i(2919504019456L, 21752);
    float f = this.NAME_TEXT_SIZE;
    GMTrace.o(2919504019456L, 21752);
    return f;
  }
  
  public int getTextAreaWidth()
  {
    GMTrace.i(2920443543552L, 21759);
    int i = getMeasuredWidth();
    int j = this.AVATAR_LAYOUT_WIDTH;
    int k = this.AVATAR_PADDING;
    GMTrace.o(2920443543552L, 21759);
    return i - j - k;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    GMTrace.i(2921651503104L, 21768);
    invalidate();
    GMTrace.o(2921651503104L, 21768);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2919101366272L, 21749);
    super.onDraw(paramCanvas);
    updatePosition();
    if (this.avatarDrawable != null) {
      this.avatarDrawable.draw(paramCanvas);
    }
    if (this.needMask != null) {
      this.needMask.draw(paramCanvas);
    }
    if (this.nameIsSpanned)
    {
      paramCanvas.save();
      paramCanvas.translate(this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING, (getHeight() - this.nickNameHeight) / 2);
      this.nickNamelayout.draw(paramCanvas);
      paramCanvas.restore();
      GMTrace.o(2919101366272L, 21749);
      return;
    }
    if (!bg.nm(this.description))
    {
      if (this.destNickName != null)
      {
        Object localObject1 = this.destNickName;
        int i = this.destNickName.length();
        float f1 = this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING;
        float f2 = (getHeight() - (this.fm.bottom - this.fm.top)) / 2.0F;
        float f3 = this.fm.top / 3.0F;
        paramCanvas.drawText((CharSequence)localObject1, 0, i, f1, this.TEXT_TOP_PADDING + (f2 - f3), this.displayNamePaint);
        int j = getWidth();
        f1 = this.descriptionPaint.measureText(this.description);
        localObject1 = this.description;
        Object localObject2 = localObject1;
        if (f1 > j - this.DESCRIPTION_PADDING)
        {
          i = 1;
          for (;;)
          {
            localObject2 = localObject1;
            if (i >= this.description.length()) {
              break label343;
            }
            localObject2 = this.description.substring(0, i);
            if (this.descriptionPaint.measureText((String)localObject2) >= j - this.DESCRIPTION_PADDING) {
              break;
            }
            i += 1;
            localObject1 = localObject2;
          }
          localObject2 = (String)localObject1 + "...";
        }
        label343:
        i = ((String)localObject2).length();
        f1 = this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING;
        f2 = (getHeight() - (this.descriptionFontMetrics.bottom - this.descriptionFontMetrics.top)) / 2.0F;
        f3 = (int)(this.descriptionFontMetrics.top * 1.7D);
        paramCanvas.drawText((String)localObject2, 0, i, f1, this.TEXT_TOP_PADDING + (f2 - f3), this.descriptionPaint);
        GMTrace.o(2919101366272L, 21749);
      }
    }
    else if (this.destNickName != null) {
      paramCanvas.drawText(this.destNickName, 0, this.destNickName.length(), this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING, (getHeight() - (this.fm.bottom - this.fm.top)) / 2.0F - this.fm.top, this.displayNamePaint);
    }
    GMTrace.o(2919101366272L, 21749);
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(2922859462656L, 21777);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    CharSequence localCharSequence2 = getContentDescription();
    CharSequence localCharSequence1 = localCharSequence2;
    if (bg.nm((String)localCharSequence2)) {
      localCharSequence1 = this.nickName;
    }
    paramAccessibilityNodeInfo.setText(localCharSequence1);
    GMTrace.o(2922859462656L, 21777);
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(2922591027200L, 21775);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    CharSequence localCharSequence2 = getContentDescription();
    CharSequence localCharSequence1 = localCharSequence2;
    if (bg.nm((String)localCharSequence2)) {
      localCharSequence1 = this.nickName;
    }
    paramAccessibilityEvent.getText().add(localCharSequence1);
    GMTrace.o(2922591027200L, 21775);
  }
  
  public void onScrollStateChanged(boolean paramBoolean)
  {
    GMTrace.i(2921517285376L, 21767);
    if (paramBoolean)
    {
      stopAvatarLoad();
      GMTrace.o(2921517285376L, 21767);
      return;
    }
    resumeAvatarLoad();
    GMTrace.o(2921517285376L, 21767);
  }
  
  public void resumeAvatarLoad()
  {
    GMTrace.i(2921248849920L, 21765);
    if (this.avatarDrawable != null) {
      ((com.tencent.mm.pluginsdk.ui.a)this.avatarDrawable).bKQ();
    }
    GMTrace.o(2921248849920L, 21765);
  }
  
  public void setDescription(String paramString)
  {
    GMTrace.i(2919369801728L, 21751);
    this.description = paramString;
    if (this.descriptionPaint == null)
    {
      this.descriptionPaint = generateDescriptionPaint();
      this.descriptionFontMetrics = this.descriptionPaint.getFontMetrics();
    }
    GMTrace.o(2919369801728L, 21751);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(2920980414464L, 21763);
    this.avatarDrawable = paramDrawable;
    if (paramDrawable != null) {
      this.avatarDrawable.setCallback(this);
    }
    GMTrace.o(2920980414464L, 21763);
  }
  
  public void setMaskBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(2920846196736L, 21762);
    this.needMask = new BitmapDrawable(getResources(), paramBitmap);
    GMTrace.o(2920846196736L, 21762);
  }
  
  public void setName(CharSequence paramCharSequence)
  {
    GMTrace.i(2919235584000L, 21750);
    if ((this.nickName == null) || (!this.nickName.equals(paramCharSequence))) {
      this.needInvaildate = true;
    }
    this.nickName = paramCharSequence;
    this.nameIsSpanned = (paramCharSequence instanceof Spanned);
    if (this.displayNamePaint == null) {
      this.displayNamePaint = generateOnePaint();
    }
    if (this.fm == null) {
      this.fm = this.displayNamePaint.getFontMetrics();
    }
    GMTrace.o(2919235584000L, 21750);
  }
  
  public void setNickNameTextColor(ColorStateList paramColorStateList)
  {
    GMTrace.i(2918967148544L, 21748);
    this.nickNameTextColor = paramColorStateList;
    GMTrace.o(2918967148544L, 21748);
  }
  
  public void stopAvatarLoad()
  {
    GMTrace.i(2921383067648L, 21766);
    if (this.avatarDrawable != null) {
      ((com.tencent.mm.pluginsdk.ui.a)this.avatarDrawable).bKP();
    }
    GMTrace.o(2921383067648L, 21766);
  }
  
  public void updateDrawBounds()
  {
    GMTrace.i(2920309325824L, 21758);
    updateDrawableBounds();
    GMTrace.o(2920309325824L, 21758);
  }
  
  public void updatePosition()
  {
    GMTrace.i(2920040890368L, 21756);
    if (!this.needUpdatePostion)
    {
      GMTrace.o(2920040890368L, 21756);
      return;
    }
    this.nickNameWidth = (getTextAreaWidth() - getPaddingLeft() - getPaddingRight());
    if ((int)getDesiredWidth(this.nickName, this.displayNamePaint) > this.nickNameWidth)
    {
      this.destNickName = TextUtils.ellipsize(this.nickName, this.displayNamePaint, this.nickNameWidth, TextUtils.TruncateAt.END);
      if (!(this.nickName instanceof Spanned)) {
        break label184;
      }
      this.nickNamelayout = new StaticLayout(this.destNickName, this.displayNamePaint, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }
    for (this.nickNameHeight = this.nickNamelayout.getHeight();; this.nickNameHeight = ((int)Math.ceil(this.fm.descent - this.fm.top) + 2))
    {
      updateDrawBounds();
      this.needUpdatePostion = false;
      GMTrace.o(2920040890368L, 21756);
      return;
      this.destNickName = this.nickName;
      this.nickNameWidth = ((int)getDesiredWidth(this.destNickName, this.displayNamePaint));
      break;
      label184:
      this.nickNamelayout = null;
    }
  }
  
  public void updatePositionFlag()
  {
    GMTrace.i(2919906672640L, 21755);
    this.needUpdatePostion = true;
    if (this.needInvaildate)
    {
      invalidate();
      this.needInvaildate = false;
    }
    GMTrace.o(2919906672640L, 21755);
  }
  
  public void updateTextColors()
  {
    GMTrace.i(2922054156288L, 21771);
    if (this.nickNameTextColor != null)
    {
      int i = this.nickNameTextColor.getColorForState(getDrawableState(), 0);
      if (i != this.nickNameCurrentTextColor)
      {
        this.nickNameCurrentTextColor = i;
        if (this.displayNamePaint == null) {
          this.displayNamePaint = generateOnePaint();
        }
        this.displayNamePaint.setColor(this.nickNameCurrentTextColor);
      }
      GMTrace.o(2922054156288L, 21771);
      return;
    }
    w.e("MicroMsg.AddressView", "nickNameTextColor should not be null");
    GMTrace.o(2922054156288L, 21771);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\AddressView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class VoiceInputBehavior
  extends com.tencent.mm.bm.a
{
  public int cancel;
  public int clear;
  public int click;
  public int fail;
  public int fullScreenVoiceLongClick;
  public long fullScreenVoiceLongClickTime;
  public int longClick;
  public long longClickTime;
  public int send;
  public int smileIconClick;
  public int textChangeCount;
  public int textChangeReturn;
  public long textChangeTime;
  public int textClick;
  public int voiceIconClick;
  public long voiceInputTime;
  
  public VoiceInputBehavior()
  {
    GMTrace.i(10714869661696L, 79832);
    GMTrace.o(10714869661696L, 79832);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10715003879424L, 79833);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.cancel);
      paramVarArgs.fk(2, this.send);
      paramVarArgs.fk(3, this.click);
      paramVarArgs.fk(4, this.longClick);
      paramVarArgs.T(5, this.longClickTime);
      paramVarArgs.fk(6, this.textClick);
      paramVarArgs.fk(7, this.textChangeCount);
      paramVarArgs.T(8, this.textChangeTime);
      paramVarArgs.fk(9, this.textChangeReturn);
      paramVarArgs.T(10, this.voiceInputTime);
      paramVarArgs.fk(11, this.fail);
      paramVarArgs.fk(12, this.clear);
      paramVarArgs.fk(13, this.smileIconClick);
      paramVarArgs.fk(14, this.voiceIconClick);
      paramVarArgs.fk(15, this.fullScreenVoiceLongClick);
      paramVarArgs.T(16, this.fullScreenVoiceLongClickTime);
      GMTrace.o(10715003879424L, 79833);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.cancel);
      int i = b.a.a.a.fh(2, this.send);
      int j = b.a.a.a.fh(3, this.click);
      int k = b.a.a.a.fh(4, this.longClick);
      int m = b.a.a.a.S(5, this.longClickTime);
      int n = b.a.a.a.fh(6, this.textClick);
      int i1 = b.a.a.a.fh(7, this.textChangeCount);
      int i2 = b.a.a.a.S(8, this.textChangeTime);
      int i3 = b.a.a.a.fh(9, this.textChangeReturn);
      int i4 = b.a.a.a.S(10, this.voiceInputTime);
      int i5 = b.a.a.a.fh(11, this.fail);
      int i6 = b.a.a.a.fh(12, this.clear);
      int i7 = b.a.a.a.fh(13, this.smileIconClick);
      int i8 = b.a.a.a.fh(14, this.voiceIconClick);
      int i9 = b.a.a.a.fh(15, this.fullScreenVoiceLongClick);
      int i10 = b.a.a.a.S(16, this.fullScreenVoiceLongClickTime);
      GMTrace.o(10715003879424L, 79833);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10715003879424L, 79833);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      VoiceInputBehavior localVoiceInputBehavior = (VoiceInputBehavior)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10715003879424L, 79833);
        return -1;
      case 1: 
        localVoiceInputBehavior.cancel = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 2: 
        localVoiceInputBehavior.send = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 3: 
        localVoiceInputBehavior.click = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 4: 
        localVoiceInputBehavior.longClick = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 5: 
        localVoiceInputBehavior.longClickTime = locala.yqV.nk();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 6: 
        localVoiceInputBehavior.textClick = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 7: 
        localVoiceInputBehavior.textChangeCount = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 8: 
        localVoiceInputBehavior.textChangeTime = locala.yqV.nk();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 9: 
        localVoiceInputBehavior.textChangeReturn = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 10: 
        localVoiceInputBehavior.voiceInputTime = locala.yqV.nk();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 11: 
        localVoiceInputBehavior.fail = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 12: 
        localVoiceInputBehavior.clear = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 13: 
        localVoiceInputBehavior.smileIconClick = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 14: 
        localVoiceInputBehavior.voiceIconClick = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      case 15: 
        localVoiceInputBehavior.fullScreenVoiceLongClick = locala.yqV.nj();
        GMTrace.o(10715003879424L, 79833);
        return 0;
      }
      localVoiceInputBehavior.fullScreenVoiceLongClickTime = locala.yqV.nk();
      GMTrace.o(10715003879424L, 79833);
      return 0;
    }
    GMTrace.o(10715003879424L, 79833);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\VoiceInputBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
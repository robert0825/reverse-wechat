package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class HeavyDetailInfo
  extends com.tencent.mm.bm.a
{
  public long chatroom_;
  public long contact_;
  public long conversation_;
  public long dbSize_;
  public long favDbSize_;
  public long flag_;
  public long message_;
  public long sdFileRatio_;
  public long sdFileSize_;
  
  public HeavyDetailInfo()
  {
    GMTrace.i(17773916848128L, 132426);
    GMTrace.o(17773916848128L, 132426);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17774051065856L, 132427);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.flag_);
      paramVarArgs.T(2, this.sdFileSize_);
      paramVarArgs.T(3, this.sdFileRatio_);
      paramVarArgs.T(4, this.dbSize_);
      paramVarArgs.T(5, this.message_);
      paramVarArgs.T(6, this.conversation_);
      paramVarArgs.T(7, this.contact_);
      paramVarArgs.T(8, this.chatroom_);
      paramVarArgs.T(9, this.favDbSize_);
      GMTrace.o(17774051065856L, 132427);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.flag_);
      int i = b.a.a.a.S(2, this.sdFileSize_);
      int j = b.a.a.a.S(3, this.sdFileRatio_);
      int k = b.a.a.a.S(4, this.dbSize_);
      int m = b.a.a.a.S(5, this.message_);
      int n = b.a.a.a.S(6, this.conversation_);
      int i1 = b.a.a.a.S(7, this.contact_);
      int i2 = b.a.a.a.S(8, this.chatroom_);
      int i3 = b.a.a.a.S(9, this.favDbSize_);
      GMTrace.o(17774051065856L, 132427);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17774051065856L, 132427);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      HeavyDetailInfo localHeavyDetailInfo = (HeavyDetailInfo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17774051065856L, 132427);
        return -1;
      case 1: 
        localHeavyDetailInfo.flag_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 2: 
        localHeavyDetailInfo.sdFileSize_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 3: 
        localHeavyDetailInfo.sdFileRatio_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 4: 
        localHeavyDetailInfo.dbSize_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 5: 
        localHeavyDetailInfo.message_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 6: 
        localHeavyDetailInfo.conversation_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 7: 
        localHeavyDetailInfo.contact_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      case 8: 
        localHeavyDetailInfo.chatroom_ = locala.yqV.nk();
        GMTrace.o(17774051065856L, 132427);
        return 0;
      }
      localHeavyDetailInfo.favDbSize_ = locala.yqV.nk();
      GMTrace.o(17774051065856L, 132427);
      return 0;
    }
    GMTrace.o(17774051065856L, 132427);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\HeavyDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
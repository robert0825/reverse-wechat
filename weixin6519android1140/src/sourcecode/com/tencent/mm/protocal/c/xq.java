package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xq
  extends ayx
{
  public String jHR;
  public String rfM;
  public String signature;
  public String ufb;
  public String uph;
  public String upi;
  public String upj;
  
  public xq()
  {
    GMTrace.i(3652467032064L, 27213);
    GMTrace.o(3652467032064L, 27213);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3652601249792L, 27214);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.uph == null) {
        throw new b("Not all required fields were included: group_id");
      }
      if (this.rfM == null) {
        throw new b("Not all required fields were included: time_stamp");
      }
      if (this.jHR == null) {
        throw new b("Not all required fields were included: nonce_str");
      }
      if (this.signature == null) {
        throw new b("Not all required fields were included: signature");
      }
      if (this.upi == null) {
        throw new b("Not all required fields were included: from_url");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufb != null) {
        paramVarArgs.e(2, this.ufb);
      }
      if (this.uph != null) {
        paramVarArgs.e(3, this.uph);
      }
      if (this.rfM != null) {
        paramVarArgs.e(4, this.rfM);
      }
      if (this.jHR != null) {
        paramVarArgs.e(5, this.jHR);
      }
      if (this.signature != null) {
        paramVarArgs.e(6, this.signature);
      }
      if (this.upi != null) {
        paramVarArgs.e(7, this.upi);
      }
      if (this.upj != null) {
        paramVarArgs.e(8, this.upj);
      }
      GMTrace.o(3652601249792L, 27214);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.ufb != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ufb);
      }
      i = paramInt;
      if (this.uph != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uph);
      }
      paramInt = i;
      if (this.rfM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rfM);
      }
      i = paramInt;
      if (this.jHR != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jHR);
      }
      paramInt = i;
      if (this.signature != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.signature);
      }
      i = paramInt;
      if (this.upi != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.upi);
      }
      paramInt = i;
      if (this.upj != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.upj);
      }
      GMTrace.o(3652601249792L, 27214);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufb == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.uph == null) {
        throw new b("Not all required fields were included: group_id");
      }
      if (this.rfM == null) {
        throw new b("Not all required fields were included: time_stamp");
      }
      if (this.jHR == null) {
        throw new b("Not all required fields were included: nonce_str");
      }
      if (this.signature == null) {
        throw new b("Not all required fields were included: signature");
      }
      if (this.upi == null) {
        throw new b("Not all required fields were included: from_url");
      }
      GMTrace.o(3652601249792L, 27214);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xq localxq = (xq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3652601249792L, 27214);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localxq.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 2: 
        localxq.ufb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 3: 
        localxq.uph = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 4: 
        localxq.rfM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 5: 
        localxq.jHR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 6: 
        localxq.signature = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      case 7: 
        localxq.upi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3652601249792L, 27214);
        return 0;
      }
      localxq.upj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3652601249792L, 27214);
      return 0;
    }
    GMTrace.o(3652601249792L, 27214);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
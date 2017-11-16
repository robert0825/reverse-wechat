package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kn
  extends ayx
{
  public int mFu;
  public String tXc;
  public String tXd;
  public String ubn;
  public String ubo;
  
  public kn()
  {
    GMTrace.i(16870899974144L, 125698);
    GMTrace.o(16870899974144L, 125698);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16871034191872L, 125699);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXc == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.tXd == null) {
        throw new b("Not all required fields were included: trans_id");
      }
      if (this.ubo == null) {
        throw new b("Not all required fields were included: receiver_open_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tXc != null) {
        paramVarArgs.e(2, this.tXc);
      }
      if (this.tXd != null) {
        paramVarArgs.e(3, this.tXd);
      }
      if (this.ubn != null) {
        paramVarArgs.e(4, this.ubn);
      }
      if (this.ubo != null) {
        paramVarArgs.e(5, this.ubo);
      }
      paramVarArgs.fk(6, this.mFu);
      GMTrace.o(16871034191872L, 125699);
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
      if (this.tXc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXc);
      }
      i = paramInt;
      if (this.tXd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXd);
      }
      paramInt = i;
      if (this.ubn != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubn);
      }
      i = paramInt;
      if (this.ubo != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ubo);
      }
      paramInt = b.a.a.a.fh(6, this.mFu);
      GMTrace.o(16871034191872L, 125699);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tXc == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.tXd == null) {
        throw new b("Not all required fields were included: trans_id");
      }
      if (this.ubo == null) {
        throw new b("Not all required fields were included: receiver_open_id");
      }
      GMTrace.o(16871034191872L, 125699);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kn localkn = (kn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16871034191872L, 125699);
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
          localkn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16871034191872L, 125699);
        return 0;
      case 2: 
        localkn.tXc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16871034191872L, 125699);
        return 0;
      case 3: 
        localkn.tXd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16871034191872L, 125699);
        return 0;
      case 4: 
        localkn.ubn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16871034191872L, 125699);
        return 0;
      case 5: 
        localkn.ubo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16871034191872L, 125699);
        return 0;
      }
      localkn.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(16871034191872L, 125699);
      return 0;
    }
    GMTrace.o(16871034191872L, 125699);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
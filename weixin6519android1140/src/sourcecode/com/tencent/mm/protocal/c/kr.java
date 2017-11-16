package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kr
  extends ayx
{
  public int ePH;
  public int mFu;
  public String omE;
  public String ubo;
  public String ubr;
  public String ubs;
  public int ubt;
  public String ubu;
  public String ubv;
  public String ubw;
  public String ubx;
  
  public kr()
  {
    GMTrace.i(19146964205568L, 142656);
    GMTrace.o(19146964205568L, 142656);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19147098423296L, 142657);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ubr == null) {
        throw new b("Not all required fields were included: receiver_name");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ubr != null) {
        paramVarArgs.e(2, this.ubr);
      }
      paramVarArgs.fk(3, this.mFu);
      if (this.ubs != null) {
        paramVarArgs.e(4, this.ubs);
      }
      if (this.omE != null) {
        paramVarArgs.e(5, this.omE);
      }
      paramVarArgs.fk(6, this.ubt);
      paramVarArgs.fk(7, this.ePH);
      if (this.ubu != null) {
        paramVarArgs.e(8, this.ubu);
      }
      if (this.ubo != null) {
        paramVarArgs.e(9, this.ubo);
      }
      if (this.ubv != null) {
        paramVarArgs.e(10, this.ubv);
      }
      if (this.ubw != null) {
        paramVarArgs.e(11, this.ubw);
      }
      if (this.ubx != null) {
        paramVarArgs.e(12, this.ubx);
      }
      GMTrace.o(19147098423296L, 142657);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.ubr != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ubr);
      }
      i += b.a.a.a.fh(3, this.mFu);
      paramInt = i;
      if (this.ubs != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubs);
      }
      i = paramInt;
      if (this.omE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.omE);
      }
      i = i + b.a.a.a.fh(6, this.ubt) + b.a.a.a.fh(7, this.ePH);
      paramInt = i;
      if (this.ubu != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ubu);
      }
      i = paramInt;
      if (this.ubo != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ubo);
      }
      paramInt = i;
      if (this.ubv != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ubv);
      }
      i = paramInt;
      if (this.ubw != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.ubw);
      }
      paramInt = i;
      if (this.ubx != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.ubx);
      }
      GMTrace.o(19147098423296L, 142657);
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
      if (this.ubr == null) {
        throw new b("Not all required fields were included: receiver_name");
      }
      GMTrace.o(19147098423296L, 142657);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kr localkr = (kr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19147098423296L, 142657);
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
          localkr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 2: 
        localkr.ubr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 3: 
        localkr.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 4: 
        localkr.ubs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 5: 
        localkr.omE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 6: 
        localkr.ubt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 7: 
        localkr.ePH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 8: 
        localkr.ubu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 9: 
        localkr.ubo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 10: 
        localkr.ubv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      case 11: 
        localkr.ubw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19147098423296L, 142657);
        return 0;
      }
      localkr.ubx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19147098423296L, 142657);
      return 0;
    }
    GMTrace.o(19147098423296L, 142657);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
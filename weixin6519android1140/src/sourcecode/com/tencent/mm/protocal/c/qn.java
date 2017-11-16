package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qn
  extends ayx
{
  public String kBh;
  public int tSK;
  public String tSy;
  public azp tUK;
  public String tUR;
  public String tUp;
  public String ugu;
  public String ugv;
  public int ugw;
  
  public qn()
  {
    GMTrace.i(4047201370112L, 30154);
    GMTrace.o(4047201370112L, 30154);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4047335587840L, 30155);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(2, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tSK);
      if (this.tUp != null) {
        paramVarArgs.e(4, this.tUp);
      }
      if (this.kBh != null) {
        paramVarArgs.e(5, this.kBh);
      }
      if (this.tUR != null) {
        paramVarArgs.e(6, this.tUR);
      }
      if (this.ugu != null) {
        paramVarArgs.e(7, this.ugu);
      }
      if (this.tSy != null) {
        paramVarArgs.e(8, this.tSy);
      }
      if (this.ugv != null) {
        paramVarArgs.e(9, this.ugv);
      }
      paramVarArgs.fk(10, this.ugw);
      GMTrace.o(4047335587840L, 30155);
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
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(2, this.tUK.aYq());
      }
      i += b.a.a.a.fh(3, this.tSK);
      paramInt = i;
      if (this.tUp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUp);
      }
      i = paramInt;
      if (this.kBh != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.kBh);
      }
      paramInt = i;
      if (this.tUR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tUR);
      }
      i = paramInt;
      if (this.ugu != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ugu);
      }
      paramInt = i;
      if (this.tSy != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tSy);
      }
      i = paramInt;
      if (this.ugv != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ugv);
      }
      paramInt = b.a.a.a.fh(10, this.ugw);
      GMTrace.o(4047335587840L, 30155);
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
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      GMTrace.o(4047335587840L, 30155);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qn localqn = (qn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4047335587840L, 30155);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localqn.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 3: 
        localqn.tSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 4: 
        localqn.tUp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 5: 
        localqn.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 6: 
        localqn.tUR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 7: 
        localqn.ugu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 8: 
        localqn.tSy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      case 9: 
        localqn.ugv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4047335587840L, 30155);
        return 0;
      }
      localqn.ugw = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4047335587840L, 30155);
      return 0;
    }
    GMTrace.o(4047335587840L, 30155);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
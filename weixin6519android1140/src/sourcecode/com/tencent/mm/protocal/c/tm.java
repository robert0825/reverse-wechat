package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tm
  extends com.tencent.mm.bm.a
{
  public String appId;
  public String desc;
  public String eAr;
  public String eMI;
  public tt eRx;
  public String title;
  public int type;
  public String ulm;
  public LinkedList<String> uln;
  
  public tm()
  {
    GMTrace.i(3626563010560L, 27020);
    this.uln = new LinkedList();
    GMTrace.o(3626563010560L, 27020);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3626697228288L, 27021);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.eMI != null) {
        paramVarArgs.e(3, this.eMI);
      }
      if (this.ulm != null) {
        paramVarArgs.e(4, this.ulm);
      }
      if (this.appId != null) {
        paramVarArgs.e(5, this.appId);
      }
      if (this.eAr != null) {
        paramVarArgs.e(6, this.eAr);
      }
      paramVarArgs.d(7, 1, this.uln);
      paramVarArgs.fk(8, this.type);
      if (this.eRx != null)
      {
        paramVarArgs.fm(9, this.eRx.aYq());
        this.eRx.a(paramVarArgs);
      }
      GMTrace.o(3626697228288L, 27021);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.title != null) {
        i = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.eMI != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eMI);
      }
      paramInt = i;
      if (this.ulm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ulm);
      }
      i = paramInt;
      if (this.appId != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.appId);
      }
      paramInt = i;
      if (this.eAr != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.eAr);
      }
      i = paramInt + b.a.a.a.c(7, 1, this.uln) + b.a.a.a.fh(8, this.type);
      paramInt = i;
      if (this.eRx != null) {
        paramInt = i + b.a.a.a.fj(9, this.eRx.aYq());
      }
      GMTrace.o(3626697228288L, 27021);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uln.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3626697228288L, 27021);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tm localtm = (tm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3626697228288L, 27021);
        return -1;
      case 1: 
        localtm.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 2: 
        localtm.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 3: 
        localtm.eMI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 4: 
        localtm.ulm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 5: 
        localtm.appId = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 6: 
        localtm.eAr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 7: 
        localtm.uln.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3626697228288L, 27021);
        return 0;
      case 8: 
        localtm.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3626697228288L, 27021);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new tt();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((tt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localtm.eRx = ((tt)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3626697228288L, 27021);
      return 0;
    }
    GMTrace.o(3626697228288L, 27021);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
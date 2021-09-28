package com.example.quizapp30

object Constants {
    const val username = "sdj"

    fun get_question(): ArrayList<Question_Data> {
        var qtn = ArrayList<Question_Data>()
        var question_one = Question_Data(
            "মাইকেল মধুসূদন  দত্তের পরে কাব্য রচনায় কে সবচেয়ে খ্যাতিমান ?",
            "ক. কাজী নজরুল ইসলাম ",
            "খ. সত্যেন্দ্রনাথ দত্ত ",
            "গ. হেমচন্দ্র বন্দ্যোপাধ্যায় ",
            "ঘ. জীবনানন্দ দাশ ",
            3
        )
        qtn.add(question_one)

        var question_two = Question_Data(
            "স্বদেশপ্রেমের অনুপ্রেরণায় হেমচন্দ্র বন্দ্যোপাধ্যায় কোন মহাকাব্য রচনা করেছেন?",
            "ক. মেঘনাদবধ কাব্য",
            "খ. বৃত্র সংহার",
            "গ. কাসেমবধ কাব্য",
            "ঘ. কুরুক্ষেত্র ",
            2
        )
        qtn.add(question_two)

        var question_three = Question_Data("'জীবন-সঙ্গীত' কবিতায় \"সার\" শব্দটি কি অর্থে ব্যাবহারিত হয়েছে ?",
        "ক.মূল্যহীন",
        "খ.গুরুত্বপূর্ণ ",
        "গ. অর্থযুক্ত ",
        "ঘ. মূল্যবান",
        4)
        qtn.add(question_three)

        var question_four = Question_Data(
            "কবি বীর্যবানদের কিসের মায়া ত্যাগ করে যুদ্ধ করতে বলেছেন ?",
            "ক. জীবনের ",
            "খ.বৌউ এর ",
            "গ. পার্থিব সম্পদের ",
            "ঘ.ভোগ-বিলাসিতার",
            1
        )
        qtn.add(question_four)

        var question_five = Question_Data(
            "কবির মোতে জগতে কি দুর্লভ?",
            "ক. সৎ মানুষ ",
            "খ.সততা ",
            "গ. মহিমা ",
            "ঘ.খারাপ মানুষ",
            3
        )
        qtn.add(question_five)

        var question_six  = Question_Data(
            "মহাজ্ঞানী ও মহান ব্যাক্তিদের অনুসরণ করে আমরা কি হবো ?",
            "ক. সৎ মানুষ  ",
            "খ.সফল  ",
            "গ. খারাপ মানুষ  ",
            "ঘ.বরণীয় ",
            4
        )
        qtn.add(question_six)

        var question_seven = Question_Data(
            "'জীবন সঙ্গীত' কবিতা কোন ইংরেজি কবিতার ভাবানুবাদ ? ",
            "ক. 'A Psalm of life'  ",
            "খ.  'A Plam of life'",
            "গ. 'A Dog of life'",
            "ঘ.'A mousenof life'",
            1
        )
        qtn.add(question_seven)


        return qtn


    }
}
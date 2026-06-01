class Record {
    String topic;
    String category;
    int hours;

    public Record(String topic, String category, int hours) {
        this.topic = topic;
        this.category = category;
        this.hours = hours;
    }

    // getters
    public String getTopic() {
        return topic;
    }

    public String getCategory() {
        return category;
    }
    
    public int getHours() {
        return hours;
    }

    // setters
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setCatergory(String category) {
        this.category = category;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Hours: " + topic +
                " | Category: " + category +
                " | Hours: " + hours;
     }
}